<html>
<head>
<body>
<table>
<%
	String[]items = (String[])request.getAttribute("movieList");
	String var = null;
	for(int i = 0; i < items.length; i++)
	{
		var = items[i];
%>
<tr><td><%= var %></td></tr>
<% } %>
</table>
</body>
</head>
</html>