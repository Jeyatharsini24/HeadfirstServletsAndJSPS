package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CheckCookie extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Cookie[] cookies = request.getCookies();
		for(int i = 0; i < cookies.length; i++)
		{
			Cookie cookie = cookies[i];
			if("username".equals(cookie.getName()))
			{
				String username = cookie.getValue();
				out.println("Hello " + username);
				break;
			}
		}
	}
}