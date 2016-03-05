package org.akash.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		System.out.println("Xml Servlet Called");
		
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>Xml Servlet Says Hello</h1>");
        String username = this.getServletConfig().getInitParameter("defaultUser");
        System.out.println(username);
		writer.println("Init parameter using web.xml has default username as: " + username);
	}
}
