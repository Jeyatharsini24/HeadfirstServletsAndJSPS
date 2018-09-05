<html>
<body>
<%!
	public void jspInit()
	{
		ServletConfig sConfig = getServletConfig();
		String email = sConfig.getInitParameter("email");
		ServletContext ctx = getServletContext();
		ctx.setAttribute("mail", email);
	}
%>
</body>
</html>