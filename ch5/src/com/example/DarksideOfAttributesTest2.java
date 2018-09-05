package com.example;

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;

public class DarksideOfAttributesTest2 extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		synchronized(getServletContext())
		{
			getServletContext().setAttribute("bar", "16");
		}
	}
}