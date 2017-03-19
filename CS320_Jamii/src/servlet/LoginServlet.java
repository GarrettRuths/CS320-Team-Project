package servlet;

import java.io.IOException;
import controller.object_controller;
//import controller.LoginController;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);


	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);
		object_controller controller = new object_controller();
		String username = null;
		String password = null;
		String buttonPress = null;
		boolean loggedin = false;
		String errorMessage = null;
		System.out.println("here");
		System.out.println("" + loggedin);
		try{
			buttonPress = req.getParameter("submit");
			if(buttonPress != null){
				System.out.println("Button Pressed");
				username = req.getParameter("username");
				password = req.getParameter("password");

				if("".equals(username) || username == null ||
						"".equals(password) || password == null){
					errorMessage = "Invalid username or password.";
					System.out.println("Invalid");
				}

				loggedin = controller.credentials(username, password);
				System.out.println(""+loggedin+"Hello");
				if(loggedin == true){
					System.out.println("Logged in");
					resp.sendRedirect(req.getContextPath() + "/home");
					return;
				}
				else{
					req.setAttribute("username",username);
				}
			}
		}
		catch(Exception e){

		}



		req.getRequestDispatcher("/_view/login.jsp").forward(req,resp);
	}



}
