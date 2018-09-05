<html>
<body>
<!-- if attribute is not exist only it will set the value: reset will not 
	happen by this condition-->
<jsp:useBean id = "person" class="foo.Person" scope="request">
	<jsp:setProperty name = "person" property = "name" value="Miyaav" />
</jsp:useBean>
<jsp:getProperty name = "person" property = "name" />
<br>
<jsp:useBean id = "var" class="foo.Person" scope="request">
	<jsp:setProperty name = "var" property = "name" value="Miyaav" />
</jsp:useBean>
<jsp:getProperty name = "var" property = "name" />
<br>
Foods are: ${favFood}<br>
First food is: ${favFood["0"]}<br>
Second food is: ${favFood[1]}<br>
<br>
Music are: ${favMusic}<br>
First music is: ${favMusic["m1"]}<br>
Second music is: ${favMusic.m2}<br>
This interpreted implicit object's value: ${favMusic[omg]}<br><br>
Music is ${musicMap[MusicType[0]]}<br><br>
${musicMap["1"]} <br>
<!-- musicMap.1 - this wont work -->
${musicList[numbers[0]]}<br>
${musicList[numbers[0] + 1]}<br>
${musicList[numbers["2"]]}<br>
${musicList[numbers[numbers[1]]]}<br><br>
${person.name}'s dog ${person.dog.name}'s toys are: ${person.dog.toys[0].name}, ${person.dog.toys[1].name}, ${person.dog.toys[2].name}<br>
Application scope: ${applicationScope.globally}
</body>
</html>