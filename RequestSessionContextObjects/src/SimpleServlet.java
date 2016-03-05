import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Object Creation 
 * 
 * Request and response objects are created --- per access i.e. NOT REUSED
 * Servlet object -- not created per access
 *                -- reused
 *                
 * Different request have different servlet threads, not instances. 
 *
 *
 * Request object is created for every user request.
 * 
 * HTTP- Stateless Protocol
 * HttpSession object is used to make the servlet remember.
 * 
 * 
 * Session object is created one per user/machine. 
 * Session objects are available across requests 
 * Perfect for login screen and shopping cart.
 * Request object is used to pull the session object 
 * 
 * Session object is available across servlets but not different users.
 *   
 * Context object is available across servlets and different users. 
 * Context Object is used mainly for initialization purpose eg Database connection or bulletin board.   
 */


@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		//parameters in url 
		String username = request.getParameter("name");
		
		//session object
		HttpSession session = request.getSession();
		
		//context object
		ServletContext context = request.getServletContext();
		
		if(username != "" && username != null)
		{
		   //session object
		   session.setAttribute("savedUserName", username);
		   //context object
		   context.setAttribute("savedUserName", username);
		}
		
		
		writer.println("Request parameter has username: " + username);
		writer.println("Session parameter has username: " +(String) session.getAttribute("savedUserName"));
		writer.println("Context parameter has username: " +(String) context.getAttribute("savedUserName"));
		
	}
}
