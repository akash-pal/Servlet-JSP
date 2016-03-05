package org.akash.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**---------------------------------------------------------------------------------------
 * 
 * Servlet implementation class SimpleServlet
 * 
 * Servlet is a java class that resides on the tomcat instance.
 * Tomcat instance runs the java class on the VM which is on the server.
 * 
 * The very first time object is created from servlet but after that
 * Every request is treated as a thread not as an object. 
 * 
 * -----------init and service methods----------------------------------------------------
 * 
 * There are methods which run before the doGet or doPost method:
 * 
 * init(ServletConfig)--servlet calls this method first / here the object is created
 *                      ServletConfig object contains some predefined configuration values
 * service()---servlet then calls the service method after init method 
 *             however subsequent calls to the servlet are handled by the service method 
 *             service method decides to call either the doGet or doPost method 
 * These are inherited methods. 
 * 
 *------------Servlet Inheritance--------------------------------------------------------
 * 
 * MyServlet extends the HTTPServlet
 * HTTPServlet extends the GenericServlet
 * 
 * The GenericServlet has following methods:
 *  init(ServletConfig)
 *  init()
 *  service()
 *  
 * The HTTPServlet has following methods:
 *  service()---overrides the service() method in GenericServlet
 *  doGet()
 *  doPost() 
 * 
 * The MyServlet has following methods:
 *  doGet() --- overrides the doGet() method in HTTPServlet 
 *  doPost() --- overrides the doPost() method in HTTPServlet
 *  
 * -------------------------------------------------------------------------------------
 * init()
 * 
 * takes the ServletConfig parameter
 * can add initialization code here by overiding the init(ServletConfig)
 * it is a per servlet configuration
 * can also configure parameters in annotations or web.xml 
 * use simple init() method without parameter for overriding --its better
 * -------------------------------------------------------------------------------------
 * 
 * service()
 * 
 * Overridden at HTTPServlet
 * Decides which doXXX() method should be called
 * If the doXXX() methods are not overridden in our servlets, an Unsupported exception is thrown
 * 
 * ----------------------------------------------------------------------------------------
 * 
 */
@WebServlet(description = "A simple servlet", urlPatterns = { "/SimpleServletPath" },
            initParams = {@WebInitParam(name="defaultUser",value="AKASH PAL")}
            )
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from GET method");
		PrintWriter writer = response.getWriter();
		writer.print("<h3>Hello in html</h3>");
		
		//initialization parameter using annotations
		String username = this.getServletConfig().getInitParameter("defaultUser");
		writer.println("Init parameter has default username as: " + username);
	}

}
