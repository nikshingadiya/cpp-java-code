//package com.kogent ;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class TrackSessionLifeCycle extends HttpServlet 
{
	protected void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		String url = "/MyServletApp/TrackSessionLifeCycle";
		String reqAction = req.getParameter("requestAction");

		HttpSession sessionObj = req.getSession();

		res.setContentType("text/html");
		PrintWriter prnwriter = res.getWriter();
		prnwriter.println("<html>");
		prnwriter.println("<head> <title>Demonstrating Session LifeCycle</title></head>");
		prnwriter.println("<body>");

		if (reqAction != null && reqAction.equals("invalidate")) 
		{
			sessionObj.invalidate();
			prnwriter.println("<center><p>Your session has been invalidated.</p>");
			prnwriter.println("Would you like to <a href=\"" + url + "?requestAction=createNewSession\">");
			prnwriter.println("create a new session</a>");
		}
		else 
		{
			prnwriter.println("<h1><center>Tracking Session Life Cycle</center></h1>");
			prnwriter.println("<br><Table ALIGN=CENTER Border=\"1\" BorderColor=\"Blue\">");

			prnwriter.println("<TR><TD WIDTH=\"50%\" ALIGN=LEFT><I>");
			prnwriter.println("Session Status");
			prnwriter.println("</I></TD><TD>"); 
			if (sessionObj.isNew()) 
			{
				prnwriter.println("New Session");
			} 
			else 
			{
				prnwriter.println("Old Session");
			}
			prnwriter.println("</TD></TR>");

			prnwriter.println("<TR><TD WIDTH=\"50%\" ALIGN=LEFT><I>");
			prnwriter.println("Session ID:");
			prnwriter.println("</I></TD><TD>"); 
			prnwriter.println(sessionObj.getId());
			prnwriter.println("</TD></TR>");

			prnwriter.println("<TR><TD WIDTH=\"50%\" ALIGN=LEFT><I>");
			prnwriter.println("Creation Time:");
			prnwriter.println("</I></TD><TD>"); 
			prnwriter.println(new Date(sessionObj.getCreationTime()));
			prnwriter.println("</TD></TR>");

			prnwriter.println("<TR><TD WIDTH=\"50%\" ALIGN=LEFT><I>");
			prnwriter.println("Last Accessed Time:");
			prnwriter.println("</I></TD><TD>"); 
			prnwriter.println(new Date(sessionObj.getLastAccessedTime()));
			prnwriter.println("</TD></TR>");

			prnwriter.println("<TR><TD WIDTH=\"50%\" ALIGN=LEFT><I>");
			prnwriter.println("Maximum Inactive Interval (seconds):");
			prnwriter.println("</I></TD><TD>"); 
			prnwriter.println(sessionObj.getMaxInactiveInterval());
			prnwriter.println("</TD></TR>");

			prnwriter.println("</TABLE>");
			prnwriter.println("<br><br><center><a href =\"" + url + "?requestAction=invalidate\">");
			prnwriter.println("Invalidate the session</a>");
			prnwriter.println("<br><center><a href =\"" + url + "\">");
			prnwriter.println("Reload this page</a>");
		}

		prnwriter.println("</body></html>");
		prnwriter.close();
	}
}
