package org.akash.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/GetPostServlet")
public class GetPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * doGet is used for reading operation , long url , parameters values are visible 
	 * doPost is used for writing operation , small url , parameters values are not visible
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get method");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		out.println("Hello from Get Method "+ userName);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Post method");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String userName = req.getParameter("userName");
		String fullName = req.getParameter("fullName");
		String profession = req.getParameter("prof");
		String[] location = req.getParameterValues("location");
		
		out.println("Hello from Post method "+ userName);
		out.println("Your full name is "+ fullName);
		out.println("Your are a  "+ profession);
		out.println("Your are from  "+ location.length + " location");
		out.println("You are from");
		for(int i=0;i<location.length;i++)
		{
			out.print("," + location[i]);
		}
		
	}
}
