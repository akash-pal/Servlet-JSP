<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="org.akash.javabrains.dto.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>
Login Successful!!!
<br>

<!-- script blocks can be removed -->
<%
//User user =(User) session.getAttribute("user"); //using sendRedirect
//User user =(User) request.getAttribute("user"); //using ResquestDispatcher
%>

<!-- jstl tag -->
<!-- the string value in getAttribute must be same as the id in useBean -->
<!-- if the request scope doesnot find the attribute then its can set -->
<jsp:useBean id="user" class="org.akash.javabrains.dto.User" scope="request">
   <jsp:setProperty property="userName" name="user" value="NewUser"/>
</jsp:useBean>


Hello
<!-- script blocks can be removed -->
<%//=user.getUserName()%>

<!-- jstl tag -->
<jsp:getProperty property="userName" name="user"/>

</body>
</html>