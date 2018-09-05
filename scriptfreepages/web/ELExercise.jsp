<%@ taglib prefix="mine" uri="DiceFunctions"%>
<html>
<body>
Test
<%@ include file="Header.jspf" %>
<% out.flush(); %>
{num > 3} : ${num > 3} <br>
{integer} : ${integer} <br>
{integer le 12} : ${integer le 12} && {integer ge 12} : ${integer ge 12} && {integer eq 12} : ${integer eq 12} <br>
{requestScope[integer]} : ${requestScope[integer]} <br>
{requestScope[integer] ne 4 and 6 le num || false} : ${requestScope[integer] ne 4 and 6 le num || false} <br>
{list[0] || list["1"] and true} : ${list[0] || list["1"] and true} <br>
{num > integer} : ${num > integer} <br>
{num > integer} : ${num > integer} <br>
{num == integer-1} : ${num == integer-1} <br>
<jsp:useBean class="foo.Dog" id="myDog">
	<jsp:setProperty name="myDog" property="name" value="${list[1]}" />
</jsp:useBean>
{myDog.name} : ${myDog.name} <br>
{myDog.name and true} : ${myDog.name and true} <br>
{42 div 0} : ${42 div 0} <br>
{mine:rollIt(list) le 0} : ${mine:rollIt(list) le 0} <br>
{foo} : ${foo} <br>
{foo[bar]} : ${foo[bar]} <br>
{bar[foo]} : ${bar[foo]} <br>
{foo.bar} : ${foo.bar} <br>
{7 + foo} : ${7 + foo} <br>
{7 / foo} : ${7 / foo} <br>
{7 - foo} : ${7 - foo} <br>
{7 < foo} : ${7 < foo} <br>
{7 == foo} : ${7 == foo} <br>
{foo == foo} : ${foo == foo} <br>
{7 != foo} : ${7 != foo} <br>
{true and foo} : ${true and foo} <br>
{true or foo} : ${true or foo} <br>
{not foo} : ${not foo} <br>
<!--7 % foo : 7 % foo -->
<!-- having .jspf extension for footer wont show param value -->
<jsp:include page="footer.jsp" >
	<jsp:param name="subTitle" value="Miyaav Miyaav" />
</jsp:include>
<% if(request.getParameter("userName") == null) {%>
	<jsp:forward page="HandleIt.jsp" />
<%}%>
Hello ${param.userName}
</body>
</html>