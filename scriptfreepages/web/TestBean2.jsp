<html>
<body>
Request param name is: ${param.name}<br>
Request param empID is: ${param.empID}<br>
Request param food is: ${param.food}<br>
First food request param: ${paramValues.food[0]}<br>
Second food request param: ${paramValues.food[1]}<br>
Request param name: ${paramValues.name[0]}<br><br>
Host by script: <%= request.getHeader("host") %><br>
Host by EL like array: ${header["host"]}<br>
Host by EL like map: ${header.host}<br>
Http Method by script: <%= request.getMethod()%><br>
Http Method by EL: ${requestScope.method}<!--method is not an attribute. it's a property. but requestScope is a map-->
<br>Method is: ${pageContext.request.method}<br><br>
init param: ${initParam.globalMail}<br>
Application scope: ${applicationScope.email}<br><!--wont work -->
${requestScope.name}
</body>
</html>