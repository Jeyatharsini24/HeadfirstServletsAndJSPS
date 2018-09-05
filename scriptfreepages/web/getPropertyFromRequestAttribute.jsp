<html>
<body>
<% foo.Person p = (foo.Person) request.getAttribute("person"); %>
Person is: <%= p.getName() %>
<jsp:useBean id="person" class="foo.Person" scope="request" />
<!-- id is the attribute name-->
<br>
Person created by servlet: <jsp:getProperty name="person" property="name" />
<!-- name is the id value for the bean -->
<br>
<jsp:useBean id="variable" class="foo.Person" scope="request" />
<!-- attribute 'variable' is not already existed. it will create new object -->
<jsp:setProperty name="variable" property="name" value="Test" />
<!-- set value to newly  created attribute -->
<jsp:getProperty name="variable" property="name" />
</body>
</html>