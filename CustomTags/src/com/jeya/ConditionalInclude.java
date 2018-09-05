package com.jeya;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ConditionalInclude extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// based on login information, servlet has set this value
		// only one value will be there. I have two just to demonstrate both
		String userType1 = "member";
		String userType2 = "";
		
		request.setAttribute("userType1", userType1);
		request.setAttribute("userType2", userType2);
		
		RequestDispatcher view = request.getRequestDispatcher("ConditionalInclude.jsp");
		view.forward(request, response);
	}
}