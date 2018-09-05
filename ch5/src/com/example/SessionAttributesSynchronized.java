package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SessionAttributesSynchronized extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("test context attributes<br>");
		HttpSession session = request.getSession();
		
		synchronized(session)
		{
			session.setAttribute("foo", 22);
			session.setAttribute("bar", 42);
			
			out.println(session.getAttribute("foo"));
			out.println(session.getAttribute("bar"));
		}
	}
}