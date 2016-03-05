<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- 

In Servlet the HTML is inside the java code
In JSP the java code is inside the HTML 

The problem with servlet is that it is a pain to write all the HTML inside java code.
The dynamic content in JSP can be rendered using java code. 

The JSP is converted to a java class by Tomcat.
The java class generated is a Servlet.
Every JSP is a different way to write a Servlet.
Once the JSP is saved and deployed; Tomcat converts the JSP into a Servlet.

Tomcat takes all the code inside the script tag and adds it to jspService() method of the Servlet class;
which gets executed on GET or POST.
Tomcat appends all the script code one after another.
Tomcat takes all the code inside the declaration tag are converted to methods inside the Servlet calss 
Tomcat takes all the static content and passes it to the out.write() method.
 -->

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP</title>
</head>
<body>

<h3>Testing JSP</h3>


<!--  Declaration tag -->
<%!
public int add(int a,int b)
{
	return a+b;
}
%>

<!--  Script tag

There can be N number of script tags but only one Declaration tag

 -->
<%
int i=1;
int j=2;
int k;

k=i+j;

out.println("The value of k is: "+ k);

%>

<br>

The value of k is: <%=k %>

<%
k=add(123,123);
%>

<br>

The value of k is: <%=k %>

<% for(i=0;i<5;i++){
	out.println("<br> i = "+ i);
}
%>

<% for(i=0;i<5;i++){
%>
<br> The new value of i = <%=i %>
<%} %>


</body>
</html>