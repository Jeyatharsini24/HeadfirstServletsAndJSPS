package com.jeya;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LoopingWithScripting extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		String[]movieList = {"Amelie", "Return of the King", "Mean Girls"};
		request.setAttribute("movieList", movieList);
		RequestDispatcher view = request.getRequestDispatcher("LoopingWithScripting.jsp");
		view.forward(request, response);
	}
}