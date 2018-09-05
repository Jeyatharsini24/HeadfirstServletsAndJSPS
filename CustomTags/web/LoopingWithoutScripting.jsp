<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html><body>
<strong>Movie list:</strong>
<br><br>

<table>
	<c:forEach var="movie" items="${movieList}" varStatus="movieLoopCount">
		<tr><td>Count: ${movieLoopCount.count}</td></tr>
		<tr><td>${movie}</td></tr>
	</c:forEach>
</table>
</body>
</html>