<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Test</title>
</head>
<body>

<form:form action="/logear" modelAttribute="usuario" method="post">
    <table style="border: 2px solid black " align="center">
        <tr>
            <td colspan="2"><h2>Login</h2></td>
        </tr>
        <tr>
            <td><form:label path="nombre">Nombre:</form:label></td>
            <td><form:input path="nombre" type="text" /></td>
        </tr>
        <tr>
            <td><form:label path="pass">Password:</form:label></td>
            <td><form:password path="pass"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>