<html>
<body>
<% Float one = new Float(42.5);
pageContext.setAttribute("page_scoped_attribute", one); %>
page_scoped_attribute: <%= pageContext.getAttribute("page_scoped_attribute") %>
<br>
<% Float two = new Float(22.4); %>
<% pageContext.setAttribute("session_scoped_attribute", two, PageContext.SESSION_SCOPE); %>
session_scoped_attribute: <%= pageContext.getAttribute("session_scoped_attribute", PageContext.SESSION_SCOPE) %>
<br>
<% pageContext.setAttribute("mail", "mail", PageContext.APPLICATION_SCOPE); %>
application_scoped_attribute: <%= pageContext.getAttribute("mail", PageContext.APPLICATION_SCOPE) %>
<br>
<%= pageContext.findAttribute("session_scoped_attribute") %>
</body>
</html>