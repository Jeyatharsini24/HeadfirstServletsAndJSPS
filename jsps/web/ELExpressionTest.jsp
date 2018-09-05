<!-- %@ page isELIgnored="true" % -->
<html>
<body>
<% pageContext.setAttribute("ohmygod", "mail", PageContext.APPLICATION_SCOPE); 
%>
Please contact: ${applicationScope.ohmygod}
Please contact:
<%=
	application.getAttribute("ohmygod")
%>
</body>
</html>