<html>
<body>
<!-- scripting -->
<%= ((foo.Person)request.getAttribute("person")).getDog().getName() %>
<br>
<!-- try with standard actions -->
<jsp:useBean id="person" class="foo.Person" scope="request" />
Dog's name is: <jsp:getProperty name="person" property="dog" />
<br>
<!-- try with expression language -->
Dog's name is: ${person.dog.name}<br>
Person's name is: ${person["name"]}<br>
Text1 is: ${favoriteText[0]}<br>
Text2 is: ${favoriteText["1"]}<br>
</body>
</html>