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

	<form:form action="processUpdatedData" method="get" modelAttribute="userupdate" >
		<label for="user">Enter UserName: </label> 
			<form:input path="userName" id="user" /> 
			<form:errors path="userName"></form:errors>
		<label for="pwd">Enter Password: </label> 
			<form:input path="password" id="pwd" /> 
		<br/>
		<label for="name">Enter Name: </label> 
			<form:input path="name" id="name" />	
		<br/>	
		<label for="name">Enter Mail Id: </label> 
			<form:input path="contact.email" id="name" />
		<br/>	
		<label for="name">Enter Mobile Number: </label> 
			<form:input path="contact.mobile" id="name" />
			
		<input type=submit value="Submit">
	</form:form>
</body>
</html>