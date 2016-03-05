<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>init Parameter in JSP</title>
</head>
<%!
/*ServletConfig -- Tomcat passes on the creation of servlet object
* ServletConfig checks the init parameters and configuration parameters in web.xml
* Tomcat bundles them into a single object called ServletConfig and passes to init() method
* This is available in servlet as a member variable called ServletConfig

* ServletContext or Application Context is a scoped object like request and session
* ServletContext is avaialble across the Application 
*
*/
	public void jspInit() {
		String defaultUser = getServletConfig().getInitParameter("defaultUser");
		ServletContext context = getServletContext();
		context.setAttribute("defaultUser", defaultUser);
	}
%>
<body>
The default user from servlet config is: <%=getServletConfig().getInitParameter("defaultUser")%>
<br>
The value in the servlet context is: <%=getServletContext().getAttribute("defaultUser")%>
</body>
</html>