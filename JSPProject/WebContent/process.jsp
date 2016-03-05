<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
	<jsp:useBean id="user" class="org.akash.javabrains.dto.User" scope="request">
	
	     <!-- using param to fetch the parameter from login page  -->
	     <!-- property string matches the variables in dto -->
	     <jsp:setProperty property="userName" name="user" param="NAME"/> 
	     
	     <!-- no param parameter but property has * to fetch all the parameters  -->
	     <jsp:setProperty property="*" name="user"/> 
	</jsp:useBean>

	<br>User Id: <jsp:getProperty property="userId" name="user"/>
	<br>User Name: <jsp:getProperty property="userName" name="user"/>
	<br>Address 1: <jsp:getProperty property="address1" name="user"/>
	<br>Address 2: <jsp:getProperty property="address2" name="user"/>
	<br>City: <jsp:getProperty property="city" name="user"/>
	<br>State: <jsp:getProperty property="state" name="user"/>
	<br>Pincode: <jsp:getProperty property="pincode" name="user"/>
</body>
</html>