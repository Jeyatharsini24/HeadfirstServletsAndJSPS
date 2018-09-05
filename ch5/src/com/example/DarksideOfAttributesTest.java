package com.example;

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;

public class DarksideOfAttributesTest extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("test context attributes<br>");
		synchronized(getServletContext())
		{
			getServletContext().setAttribute("foo", "22");
			getServletContext().setAttribute("bar", "42");
		
			out.println(getServletContext().getAttribute("foo"));
			out.println(getServletContext().getAttribute("bar"));
		}
	}
}