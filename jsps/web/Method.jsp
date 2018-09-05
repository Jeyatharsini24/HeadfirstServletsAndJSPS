<html>
<body>
<%!
	int doubleCount()
	{
		count = count * 2;
		return count;
	}
%>
<%!
	int count = 1;
%>
doubleCount is:
<%= doubleCount() %>
</body>
</html>