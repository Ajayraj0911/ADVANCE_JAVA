package com.controller.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login1
 */
public class Login1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String username = request.getParameter("Username");
		String password = request.getParameter("Password");
		String User = (String) session.getAttribute("username");
		String Pass = (String) session.getAttribute("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if(User.equals(username) && Pass.equals(password)) {
			
			out.println("Login Successful");
			response.sendRedirect("Logout.html");
		}
		else {
			out.println("Login Failed Invalid Ceredancial");
			request.getRequestDispatcher("Login1.html").include(request,response);
		}
		
		
	}

}
