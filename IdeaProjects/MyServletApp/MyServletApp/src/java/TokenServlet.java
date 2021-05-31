//package com.kogent;

import java.io.*;
import java.util.Random;
import javax.servlet.http.*;
import javax.servlet.ServletException;

public class TokenServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String tokensID = request.getParameter("tokens");

		response.setContentType("text/html");
		PrintWriter prnwriter = response.getWriter();
		prnwriter.println("<html><head><title>Tokens</title></head><body");
		prnwriter.println("style=\"font-family:verdana;font-size:10pt\">");
		if(tokensID==null) 
		{	
			Random rnd = new Random();
			tokensID = Long.toString(rnd.nextLong());
			prnwriter.println("<p>Welcome. A new token " + tokensID + " is now established</p>");
		}
		else
		{
			prnwriter.println("Welcome back.. Your token is " + tokensID + ".</p>");
		}

		String requestURLSame = request.getRequestURL().toString()+"?tokens="+tokensID;
		String requestURLNew = request.getRequestURL().toString();

		prnwriter.println("<p>Click <a href=" + requestURLSame +" > here </a> again to continue browsing with the same identity.</p>");
		prnwriter.println("<p>Click <a href=" + requestURLNew +" > here </a> to continue browsing with a new identity.</p>");
		prnwriter.println("</body></html>");
		prnwriter.close();
	}
}