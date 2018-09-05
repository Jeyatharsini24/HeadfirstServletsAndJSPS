package foo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class ELExercise extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		String num = "2";
		request.setAttribute("num", num);
		//Integer i = new Integer(3);
		//request.setAttribute("integer", i);
		// org.apache.jasper.JasperException: java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
		List list = new ArrayList();
		list.add("true");
		list.add("false");
		list.add("2");
		list.add("10");
		Map<String, String> map = new HashMap<>();
		map.put("test", "miyaav");
		request.setAttribute("bar", map);
		request.setAttribute("list", list);
		
		RequestDispatcher view = request.getRequestDispatcher("ELExercise.jsp");
		view.forward(request, response);
	}
}