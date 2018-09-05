<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<strong>Member Comments</strong><br>
<hr>${commentList}<hr>

<c:if test="${userType1 eq 'member'}">
	<jsp:include page="inputComments.jsp"/>
</c:if>
<br><br><br><br>
<strong>Member Comments</strong><br>
<hr>${commentList}<hr>

<c:if test="${userType2 eq ''}">
</c:if>
</body>
</html>