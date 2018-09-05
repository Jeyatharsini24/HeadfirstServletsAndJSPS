<html>
<body>
<jsp:useBean id="person" type="foo.Person3" class="foo.Employee" />
<% person.setName(request.getParameter("userName")); %>
<jsp:getProperty name = "person" property = "name" />
<br>
<jsp:useBean id="person2" type="foo.Person3" class="foo.Employee" >
<jsp:setProperty name="person2" property="name" value= "<%= request.getParameter(\"userName\") %>" />
</jsp:useBean>
<!-- using scripts is not good -->
<jsp:useBean id="person3" type="foo.Person3" class="foo.Employee">
	<jsp:setProperty name="person3" property="name" param="userName" />
</jsp:useBean>
<jsp:getProperty name = "person3" property = "name" />
<br>
<jsp:useBean id="person4" type="foo.Person3" class="foo.Employee">
	<jsp:setProperty name="person4" property="name" /> <!--property name = input field name-->
</jsp:useBean>
<jsp:getProperty name = "person4" property = "name" />
<br>
<jsp:useBean id="person5" type="foo.Person3" class="foo.Employee">
	<jsp:setProperty name="person5" property="*" /> <!--bind all properties-->
</jsp:useBean>
<jsp:getProperty name = "person5" property = "name" />
<br>
<jsp:getProperty name = "person5" property = "empID" />
</body>
</html>