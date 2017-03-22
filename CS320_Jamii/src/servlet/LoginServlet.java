package servlet;

import java.io.IOException;
import controller.object_controller;
//import controller.LoginController;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		object_controller controller = new object_controller();
		String username = null;
		String password = null;
		String buttonPress = null;
		String errorMessage = null;
		boolean loggedin = false;
		
		buttonPress = req.getParameter("submit");
		
		if(buttonPress != null)
		{
			username = req.getParameter("username");
			password = req.getParameter("password");

			if("".equals(username) || username == null || "".equals(password) || password == null)
			{
				errorMessage = "Invalid username or password.";
				System.out.println("Invalid");
			}

			loggedin = controller.credentials(username, password);
				
			if(loggedin == true)
			{
				resp.sendRedirect(req.getContextPath() + "/home");
			}
			else
			{	
				errorMessage = "Invalid username or password.";
				req.setAttribute("username",username);
				req.setAttribute("errorMessage", errorMessage);
				req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);
			}
		}
		else
		{
			req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);
		}
	}
}
