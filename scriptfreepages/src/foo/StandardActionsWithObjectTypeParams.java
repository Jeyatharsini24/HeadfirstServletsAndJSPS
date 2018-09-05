package foo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class StandardActionsWithObjectTypeParams extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Person p = new Person();
		p.setName("Evan");
		Dog dog = new Dog();
		dog.setName("Spike");
		p.setDog(dog);
		
		String[]favoriteText = {"miyaav", "omg", "grr"};
		request.setAttribute("favoriteText", favoriteText);
		request.setAttribute("person", p);
		
		RequestDispatcher view = request.getRequestDispatcher("StandardActionsWithObjectTypeParams.jsp");
		view.forward(request, response);
	}
}