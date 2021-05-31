package com.kogent;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.*;

@WebServlet(name="FirstServlet2", urlPatterns="/FirstServlet2",initParams={@WebInitParam(name="greeting",value="welcome") }) 

public class FirstServlet2 extends HttpServlet 
{
  @Override
public void init(ServletConfig config) throws ServletException
{
super.init(config);
config.getServletContext().setAttribute("name", "Pallavi Sharma");
}

    @Override
public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
{
response.setContentType("text/html");
PrintWriter printwrite = response.getWriter();
printwrite.println("<html>");
printwrite.println("<head>");
String greet;
String name;
greet = getServletConfig().getInitParameter("greeting");
name=getServletContext().getAttribute("name").toString(); 
printwrite.println("<title>"+greet+"</title>");
printwrite.println("</head>");
printwrite.println("<body>");
printwrite.println("<h1>"+greet+"</h1>");
printwrite.println("<h2>"+name+"</h2>");
printwrite.println("</body>");
printwrite.println("</html>");
}
}
