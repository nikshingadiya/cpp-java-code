//package com.kogent ;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;

public class MySessionServlet extends HttpServlet 
{ 

          @Override
  	public void doGet (HttpServletRequest req, HttpServletResponse res)
     	throws ServletException, IOException 
	{
    		// Retrieve the session object for the current user session.
		// A new session is created if a session object has not been 
		// created previously.
		HttpSession sessionObj = req.getSession(true);

		// Create and update the variable that holds a count indicating 
		// the number of times the page has been visited during the current 
		// user session.
	    	Integer count = (Integer) sessionObj.getAttribute("count");

    		if (count == null) 
		{
	      		count = new Integer(1);
    		}
    		else 
		{
      			count = new Integer(count.intValue() + 1);
    		}

    		// Save the updated count value to the current user session
    		sessionObj.setAttribute("count", count);


		// Displaying the output to the user
    		res.setContentType("text/html");
	    	PrintWriter prnwriter = res.getWriter();

    		prnwriter.println("<head><title> " + "Displaying the Details of Current User Session" + "</title></head><body>");
    		prnwriter.println("<h1>Displaying the Details of Current User Session</h1>");
    		prnwriter.println("<h2><I>You have visited this page</I><b><font color=\"blue\">" + count + "</font></b><I> times.</I></h2><p>");

		prnwriter.println("<BR>");


		// Displaying the request related information from the request object
		prnwriter.println("<Table ALIGN=CENTER Border=\"1\" BorderColor=\"Red\">");
		prnwriter.println("<TH COLSPAN=2 ALIGN=CENTER>Summary of Request Data</TH>");

		prnwriter.println("<TR><TD WIDTH=\"50%\" ALIGN=LEFT VALIGN=CENTER>");
		prnwriter.println("Session ID in Request Object");
		prnwriter.println("</TD>");
		prnwriter.println("<TD WIDTH=\"50%\">");
		prnwriter.println(req.getRequestedSessionId());
		prnwriter.println("</TD></TR>");

		prnwriter.println("<TR><TD WIDTH=\"50%\" ALIGN=LEFT VALIGN=CENTER>");
		prnwriter.println("Is Session ID in Request from a Cookie");
		prnwriter.println("</TD>");
		prnwriter.println("<TD WIDTH=\"50%\">");
		prnwriter.println(req.isRequestedSessionIdFromCookie());
		prnwriter.println("</TD></TR>");

		prnwriter.println("<TR><TD WIDTH=\"50%\" ALIGN=LEFT VALIGN=CENTER>");
		prnwriter.println("Is Session ID in Request from the URL");
		prnwriter.println("</TD>");
		prnwriter.println("<TD WIDTH=\"50%\">");
		prnwriter.println(req.isRequestedSessionIdFromURL());
		prnwriter.println("</TD></TR>");

		prnwriter.println("<TR><TD WIDTH=\"50%\" ALIGN=LEFT VALIGN=CENTER>");
		prnwriter.println("Is Requested Session ID Valid");
		prnwriter.println("</TD>");
		prnwriter.println("<TD WIDTH=\"50%\">");
		prnwriter.println(req.isRequestedSessionIdValid());
		prnwriter.println("</TD></TR>");

		prnwriter.println("</Table>");

		prnwriter.println("<BR><BR>");

		// Displaying the session related information from the session object
		prnwriter.println("<Table ALIGN=CENTER Border=\"1\" BorderColor=\"Red\">");
		prnwriter.println("<TH COLSPAN=2 ALIGN=CENTER>Summary of Session Data</TH>");

		prnwriter.println("<TR><TD WIDTH=\"50%\" ALIGN=LEFT VALIGN=CENTER>");
		prnwriter.println("Is it a New Session");
		prnwriter.println("</TD>");
		prnwriter.println("<TD WIDTH=\"50%\">");
		prnwriter.println(sessionObj.isNew());
		prnwriter.println("</TD></TR>");

		prnwriter.println("<TR><TD WIDTH=\"50%\" ALIGN=LEFT VALIGN=CENTER>");
		prnwriter.println("Session ID");
		prnwriter.println("</TD>");
		prnwriter.println("<TD WIDTH=\"50%\">");
		prnwriter.println(sessionObj.getId());
		prnwriter.println("</TD></TR>");

		prnwriter.println("<TR><TD WIDTH=\"50%\" ALIGN=LEFT VALIGN=CENTER>");
		prnwriter.println("Session Creation Time");
		prnwriter.println("</TD>");
		prnwriter.println("<TD WIDTH=\"50%\">");
		prnwriter.println(new Date(sessionObj.getCreationTime()));
		prnwriter.println("</TD></TR>");

		prnwriter.println("<TR><TD WIDTH=\"50%\" ALIGN=LEFT VALIGN=CENTER>");
		prnwriter.println("Time at which Session was Last Accessed");
		prnwriter.println("</TD>");
		prnwriter.println("<TD WIDTH=\"50%\">");
		prnwriter.println(new Date(sessionObj.getLastAccessedTime()));
		prnwriter.println("</TD></TR>");

		prnwriter.println("</Table>");

		prnwriter.println("<BR><BR>");

    		// User can reaccess the servlet using this hyperlink to see 
		// Session Tracking in action. Clicking the hyperlink refreshes 
		// the page and increment the session variable count by one every 
		// time it is clicked.
		String url = req.getRequestURL().toString();
    		prnwriter.println(" Click <a href=" + url + "> here </a> to reload the servlet and see session tracking in action. <br>");

       		prnwriter.println("</body>");
    		prnwriter.close();
  	}
}

