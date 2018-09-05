<%@ taglib prefix="mine" uri="DiceFunctions"%>
<html>
<body>
<jsp:useBean id="list" type= "java.util.List" class="java.util.ArrayList" scope="request"/>
${mine:rollIt(list)}
</body>
</html>