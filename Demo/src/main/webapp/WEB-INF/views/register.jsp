<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Registration Form</h1>
	<hr />
	<sf:form action="/user/saveUser" modelAttribute="uf">
         UserName: <sf:input path="name" />
         Age: <sf:input path="age" />
		<input type="submit" value="Register" />
	</sf:form>
</body>
</html>