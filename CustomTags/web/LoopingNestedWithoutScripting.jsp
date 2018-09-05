<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html><body>
<strong>Movie list:</strong>
<br><br>

<table>
	<c:forEach begin="0" var="listElement" items="${movieList}" step="2" end="1">
		<c:forEach var="movie" items="${listElement}">
			<tr><td>${movie}</td></tr>
		</c:forEach>
	</c:forEach>
</table>
</body>
</html>