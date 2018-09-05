package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class TestInitParams extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("servlet context parameters");
		out.println(getServletContext().getInitParameter("globalAttribute"));
		out.println("test init parameters<br>");
		
		Enumeration e = getServletConfig().getInitParameterNames();
		
		while(e.hasMoreElements())
		{
			out.println("<br>Param name = " + e.nextElement() + "<br>");
		}
		/**
		out.println("Admin Mail : " + getServletConfig().getInitParameter("adminEmail"));
		out.println("<br>");
		out.println("Main Mail : " + getServletConfig().getInitParameter("mainEmail"));
		*/
		request.setAttribute("globalAttribute", getServletContext().getInitParameter("globalAttribute"));
		request.setAttribute("adminEmail", getServletConfig().getInitParameter("adminEmail"));
		request.setAttribute("mainEmail", getServletConfig().getInitParameter("mainEmail"));
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}
}