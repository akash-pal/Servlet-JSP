<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<form action="process.jsp" method="post">
	<br>User ID: <input type="text" name="userId"/>
	
	<br>User Name: <input type="text" name="NAME"/>
	
	<br>Address 1: <input type="text" name="address1">
	<br>Address 2: <input type="text" name="address2">
	<br>City: <input type="text" name="city">
	<br>State: <input type="text" name="state">
	<br>Pincode: <input type="text" name="pincode">
<input type="submit"/>
</form>
</body>
</html>