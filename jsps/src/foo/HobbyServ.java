package foo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class HobbyServ extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		List list = new ArrayList();
		list.add("Fred");
		list.add("Pradeep");
		list.add("Philippe");
		
		request.setAttribute("names", list);
		RequestDispatcher view = request.getRequestDispatcher("hobby.jsp");
		view.forward(request, response);
	}
}