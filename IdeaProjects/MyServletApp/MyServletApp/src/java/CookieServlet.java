//package com.kogent;

import java.io.*;
import java.util.Random;
import javax.servlet.http.*;
import javax.servlet.ServletException;


public class CookieServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Cookie[] coki = request.getCookies();
		Cookie tokenCookie = null;
		if(coki !=null) 
		{
			for(int i=0; i<coki.length; i++) 
			{
				if (coki[i].getName().equals("token")) 
				{
					tokenCookie = coki[i];
					break;
				}
			}
		}

		response.setContentType("text/html");
		PrintWriter prnwriter = response.getWriter();
		prnwriter.println("<html><head><title>Extracting the token cookie</title></head><body");
		prnwriter.println("style=\"font-family:arial;font-size:12pt\">");
		
		String resetParam = request.getParameter("resetParam");
		if(tokenCookie==null || (resetParam != null && resetParam.equals("yes")))
		{
			Random rnd = new Random();
			long cookieid = rnd.nextLong();
			prnwriter.println("<p>Welcome. A new token " + cookieid + "is now established</p>");
			tokenCookie = new Cookie("token", Long.toString(cookieid));
			tokenCookie.setComment("A cookie named token to identity user");
			tokenCookie.setMaxAge(-1);
			tokenCookie.setPath("/HandleSession/CookieServlet");
			response.addCookie(tokenCookie);
		}
		else
		{
			prnwriter.println("Welcome back.. Your token is " + tokenCookie.getValue() + ".</p>");
		}

		String requestURLSame = request.getRequestURL().toString();
		String requestURLNew = request.getRequestURL() + "?resetParam=yes";

		prnwriter.println("<p>Click <a href=" + requestURLSame +" > here </a>again to continue browsing with the " + " same identity.</p>");
		prnwriter.println("<p>Otherwise, click <a href = " + requestURLNew + "> here</a> to start browsing with a new identity. </p>");
		prnwriter.println("</body></html>");
		prnwriter.close();
	}
}
