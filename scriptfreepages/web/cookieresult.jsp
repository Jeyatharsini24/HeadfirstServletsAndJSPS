<html>
<body>
<h1>Cookie viewer</h1>
By Script:
<% Cookie[]cookies = request.getCookies();
for(int i = 0; i < cookies.length; i++)
{
	if("username".equals(cookies[i].getName()))
	{
		out.println(cookies[i].getValue());
	}
	if("password".equals(cookies[i].getName()))
	{
		out.println(cookies[i].getValue());
	}
}
%>
<br>
By EL: <br>
${cookie.username.value}<br>
${cookie.password.value}<br>
**********************************<br>
Context Params: <br>
Email by script: <%=application.getInitParameter("globalMail") %><br>
Email by EL: ${initParam.globalMail}<br> <!-- only for context param :( -->
<a href="checkcookie.do">click here to view cookie by servlet
</body>
</html>