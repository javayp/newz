<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form</title>
</head>
<body>
	<form:form action="/createnews" method="post" modelAttribute="NewzFormData">
		<form:input path="title" type="text" /> 
		<form:input path="keyword" type="text" /> 
		<form:input path="Discription" type="text" /> 
	<input class="btn btn-primary" type="submit" name="submit" value="Post" />
	</form:form>
</body>
</html>