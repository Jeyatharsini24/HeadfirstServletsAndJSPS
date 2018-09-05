package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class URLRewritingTest extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(20*60);
		out.println("<html><body>");
		out.println("<a href=\"" + response.encodeURL("Testor.do") + "\">click me to direct</a><br>");
		out.println("<a href=\"" + response.encodeRedirectURL("Testor.do") + "\">click me to redirect</a>");
		out.println("</body></html>");
	}
}