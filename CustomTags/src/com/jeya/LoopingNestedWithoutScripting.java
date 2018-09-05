package com.jeya;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class LoopingNestedWithoutScripting extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		String[]movies1 = {"Matrix Revolutions", "Kill Bill", "Boondock Saints"};
		String[]movies2 = {"Amelie", "Return of the King", "Mean Girls"};
		List<String[]>movieList = new ArrayList();
		movieList.add(movies1);
		movieList.add(movies2);
		request.setAttribute("movieList", movieList);
		RequestDispatcher view = request.getRequestDispatcher("LoopingNestedWithoutScripting.jsp");
		view.forward(request, response);
	}
}