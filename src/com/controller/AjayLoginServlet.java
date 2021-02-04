package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AjayLoginServlet
 */
public class AjayLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String UserName[] = {"lemon","orange","apple","pineaple"};
		String uName = request.getParameter("txtUserName");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		boolean flag=false;
		for(int i=0;i<UserName.length;i++) {
			if(UserName[i].equals(uName)){
				flag=true;
				request.getRequestDispatcher("AjaySucess").forward(request, response);			
				} 
		}
		
		if(flag==false){
			out.print("LOGIN FAILED");
			request.getRequestDispatcher("AjayLoginPage.html").include(request, response);
		}
		
		
		
	}

}
