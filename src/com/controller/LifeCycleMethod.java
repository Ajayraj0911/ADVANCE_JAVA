package com.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleMethod
 */
public class LifeCycleMethod extends HttpServlet {
	private static final long serialVersionUID = 1L;

		public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
			System.out.println("init method...");
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy method..");
		
	}
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	System.out.println("service method...");
	
	}

}
