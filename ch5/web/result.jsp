<%@ page import="java.util.*" %>
<html>
<body>
<h1 align="center">Beer Recommendations JSP</h1>
<p>
<%
	String globalAttribute = (String)request.getAttribute("globalAttribute");
	out.print("<br>Global Attribute: " + globalAttribute);
	
	String adminEmail = (String)request.getAttribute("adminEmail");
	out.print("<br>Admin Email: " + adminEmail);
	
	String mainMail = (String)request.getAttribute("mainEmail");
	out.print("<br>Main Mail: " + mainMail);
%>
</body>
</html>