package org.akash.javabrains;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.akash.javabrains.dto.User;
import org.akash.javabrains.service.LoginService;

/**
 * Servlet implementation class loginServlet
 * 
 * Controller--LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String userId = request.getParameter("userId");
	    String password = request.getParameter("password");
	    
	    LoginService loginService = new LoginService();
	    boolean result = loginService.authenticate(userId,password);
	    System.out.println("userId:"+ userId);
	    System.out.println("password:"+ password);
	    
	    if(result){
	        User user = loginService.getUserDetails(userId);
	        
	        //First way to transfer the request from servlet/jsp to servlet/jsp---- using sendRedirect()
	        //a request is sent to the browser to redirect to a different url
	        //for transferring data it has to set either in session or application scope
	        
	        /*
	        request.getSession().setAttribute("user", user);
	        response.sendRedirect("success.jsp");
	    	*/
	        
	       //Second way to transfer the request from servlet/jsp to servlet/jsp---- using RequestDispatcher()
	       //the request and response is forwarded 
	       //for transferring the data the same request scope can be used
	        
	        request.setAttribute("user", user);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
	        dispatcher.forward(request, response);
	    	return;
	    }
	    else{
	    	response.sendRedirect("login.jsp");
	    	return;
	    }
	}

}
