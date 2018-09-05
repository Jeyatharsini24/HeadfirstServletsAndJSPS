package foo;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class CookieReader extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Cookie[]cookies = request.getCookies();
		for(Cookie cookie : cookies)
		{
			if("username".equals(cookie.getName()))
			{
				out.println(cookie.getValue());
			}
			if("password".equals(cookie.getName()))
			{
				out.println(cookie.getValue());
			}
		}
	}
}