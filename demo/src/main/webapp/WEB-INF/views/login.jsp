<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>

	<form:form action="processData" method="get" modelAttribute="user" >
		<label for="user">Enter UserName: </label> 
			<form:input path="userName" id="user" /> 
			<form:errors path="userName"></form:errors>
		<label for="pwd">Enter Password: </label> 
			<form:input path="password" id="pwd" /> 
			
		<input type=submit value="Submit">
	</form:form>
	
	<br/>
	
	<a href="/modifyData"> Click here to Update User data</a>
</body>
</html>