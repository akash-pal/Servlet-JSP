<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<%
	//request object similar to request object in servlet
	String userName = request.getParameter("name");
	
    if(userName != "" && userName != null)
	{
	  //session object similar to session object in servlet
      session.setAttribute("sessionUserName", userName);
	
	  //application object similar to context object in servlet
      application.setAttribute("applicationUserName", userName);
	  
	  //PageContext object only in JSP
	  pageContext.setAttribute("pageContextUserName", userName);
	  
	  //generalised way of declaring objects
	  //i.e. declaring session / application / pageContext / request scope 
	  pageContext.setAttribute("applicationName", userName , pageContext.APPLICATION_SCOPE);
	  
	  //to find an attribute irrespective of the scope
	  pageContext.findAttribute("applicationName");
	}
%>

<br>
User Name in the request object is: <%=userName %>
<br>
User Name in the session object is: <%=session.getAttribute("sessionUserName") %>
<br>
User Name in the application object is: <%=application.getAttribute("applicationUserName") %>
<br>
User Name in the pageContext object is: <%=pageContext.getAttribute("pageContextUserName") %>
<br>
User Name in the application object set using pageContext object is: <%=application.getAttribute("applicationName") %>
<br>
Name is : <%=pageContext.findAttribute("applicationName")%>
</body>
</html>