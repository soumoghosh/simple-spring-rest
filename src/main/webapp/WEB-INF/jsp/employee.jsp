<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Add Employee</title>
</head>
<body>
	<h1>Add Employee</h1>
	<form:form  method="POST" commandName="employee">
		<div>
		<div align="center">
				Id: <form:input  path="id" />
			</div>
			<div align="center">
				First Name: <form:input path="firstname"   />
			</div>
			<div align="center">
				Last Name: <form:input path="lastname"   />
			</div>
			<div align="center">
				<input id="submit" type="submit" value="Save Person"/>
			</div>
		</div>
	</form:form>
</body>
</html>