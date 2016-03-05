
<!-- JSP Page Directives tag -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date" %>

<!-- JSP page directive -->   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Clock</title>
</head>
<body>

<!-- JSP include directive: includes the contents from another page -->
<%@ include file="\hello.jsp" %>

The time is: <%=new Date() %>

</body>
</html>