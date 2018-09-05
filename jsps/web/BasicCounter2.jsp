<%@ page import="foo.*,java.io.*" %>
<html>
<body>
The page count is:
<%
	out.println(Counter2.getCount());
%>
</body>
</html>