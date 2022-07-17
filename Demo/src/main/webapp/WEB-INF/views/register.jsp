<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/css/test.css" />
<title>Insert title here</title>
</head>
<body>
	<h1>Registration Form</h1>
	<hr />
	<sf:form action="/user/saveUser" modelAttribute="uf">
         UserName: <sf:input path="name"/>
		<sf:errors path="name" cssClass="error" /><br/>
         Age: <sf:input path="age" />
		<sf:errors path="age" cssClass="error" /><br/>
		<input type="submit" value="Register" />
	</sf:form>
</body>
</html>