package foo;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class CookieCreator extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Cookie usernameCookie = new Cookie("username", username);
		usernameCookie.setMaxAge(30*60);
		Cookie passwordCookie = new Cookie("password", password);
		passwordCookie.setMaxAge(30*60);
		
		response.setContentType("text/html");
		response.addCookie(usernameCookie);
		response.addCookie(passwordCookie);
		
		RequestDispatcher view = request.getRequestDispatcher("cookieresult.jsp");
		view.forward(request, response);
	}
}