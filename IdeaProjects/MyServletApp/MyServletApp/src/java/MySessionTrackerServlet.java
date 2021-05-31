//package com.kogent ;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class MySessionTrackerServlet extends HttpServlet 
{
  	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException 
	{
		// Retrieve the session object for the current user session.
		// A new session is created if a session object has not been 
		// created previously.
		HttpSession sessionObj = req.getSession(true);

		// Create and update the variable that holds a count indicating 
		// the number of times the page has been visited during the current 
		// user session.
	    	Integer count = (Integer) sessionObj.getAttribute("Count");

    		if (count == null) 
		{
	      		count = new Integer(1);
    		}
    		else 
		{
      			count = new Integer(count.intValue() + 1);
    		}

    		// Save the updated count value to the current user session
    		sessionObj.setAttribute("Count", count);
		
		// Add some more attributes to the current user session
		sessionObj.setAttribute("UserName", "Pallavi");
		sessionObj.setAttribute("UserID", sessionObj.getId());
		sessionObj.setAttribute("MyFavouriteColor", "Red");


		// Displaying the output to the user
    		res.setContentType("text/html");
    		PrintWriter prnwriter = res.getWriter();
    		prnwriter.println("<HTML><HEAD><TITLE>My Session Tracker Servlet</TITLE></HEAD>");
    		prnwriter.println("<BODY><H1>Demonstrating Session Tracking</H1>");

    		// Display the hit cnt for this page for the current user
    		prnwriter.println("You have visited this page <b><font color=\"blue\">" + count + ((count.intValue()==1)?"</font></b> time." : "</font></b> times."));
    		prnwriter.println("<P>");

    		prnwriter.println("<H2><I>Displaying Session Data</I></H2>");
		prnwriter.println("<Table Border=\"1\" BorderColor=\"Blue\">");

    		Enumeration names = sessionObj.getAttributeNames();
    		while(names.hasMoreElements())
		{
                	String name = (String) names.nextElement();
			prnwriter.println("<TR><TD WIDTH=\"50%\" ALIGN=LEFT VALIGN=CENTER><I>");
     			prnwriter.println(name);
			prnwriter.println("</I></TD><TD>"); 
			prnwriter.println(sessionObj.getAttribute(name));
			prnwriter.println("</TD></TR>");
   		}

		prnwriter.println("</TABLE>");
    		prnwriter.println("</BODY></HTML>");
  	}
}
