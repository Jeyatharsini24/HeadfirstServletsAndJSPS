<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>Choose</head>
<body>
<br>
<br>
<br>
<c:set var = "performance" scope = "session" value = "performance"/>
<!-- jsp:setProperty can do only one thing - set the property of a bean. This is more powerful than that -->
<c:set var = "safety" scope = "session" value = "safety"/>
<c:set var = "maintenance" scope = "session" value = "maintenance"/>
<c:set var = "userPref" scope = "session" value = "${performance}"/>
<c:choose>
	<c:when test="${userPref == performance}">
		Now you can stop even if you <em>do</em> drive insanely fast.
	</c:when>
	
	<c:when test="${userPref == safety}">
		Our brakes will never lock up, no matter how bad a driver you are.
	</c:when>
	
	<c:when test="${userPref == maintenance}">
		Lost your tech job? No problem--you won't have to service these brakes for at least three years.
	</c:when>
	
	<c:otherwise>
		Our brakes are the best.
	</c:otherwise>
</c:choose>
<br>
<br>Otherwise is not required for choose<br>
</body>
</html>