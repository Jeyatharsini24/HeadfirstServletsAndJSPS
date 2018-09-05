<html>
<body>
<!--jsp:useBean id = "person3" type="foo.Person3" class="foo.Employee" scope="page": same as
jsp:useBean id = "person3" type="foo.Person3" class="foo.Employee"-->
<jsp:useBean id = "person3" type="foo.Person3" class="foo.Employee" scope="page">
	<jsp:setProperty name = "person3" property = "name" value="Miyaav" />
</jsp:useBean>
<jsp:getProperty name = "person3" property = "name" />
<br>
<!--jsp:useBean id="p1" type="foo.Employee"
	jsp:setProperty name="p1" property="name" value="Fred" 
</jsp:useBean>
Name is: jsp:getProperty name="p1" property="name" wont instantiate : no scope -->
<!-- jsp:useBean id = "person4" type="foo.Person3" scope="page"
	jsp:setProperty name = "person4" property = "name" value="Miyaav" 
jsp:useBean
jsp:getProperty name = "person4" property = "name" : instantiation exception if person4 not exists -->
</body>
</html>