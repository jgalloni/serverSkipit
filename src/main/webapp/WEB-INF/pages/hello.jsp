<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	<title>Test</title>
</head>
<body>
<h2>Login</h2>
<form:form action="/logear" modelAttribute="usuario" method="post">
	<form:label path="nombre">Nombre:</form:label>
	<form:input path="nombre" type="text"/>
	<br>
	<form:label path="pass">Password:</form:label>
	<form:password path="pass"/>
	<br>
	<input type="submit" value="Submit"/>
</form:form>
</body>
</html>