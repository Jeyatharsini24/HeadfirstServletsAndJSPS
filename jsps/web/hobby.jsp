<%@ page import = "java.util.*" %>
<html>
<!-- HTML comment-->
<body>
The friends who share your hobby of
<%-- JSP comment--%>
<%
	out.print(request.getParameter("hobby"));
%>
are: <br>
<% 	List al = (ArrayList)(request.getAttribute("names")); %>
	<%  Iterator it = al.iterator();
	while(it.hasNext())
	{%>
		<%= it.next() %><br>
	<%}
	%>
</body>
</html>