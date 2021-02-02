package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String studentName = request.getParameter("sName");
		String studentEmail = request.getParameter("sEmail");
		String studentPassword = request.getParameter("sPassword");
		
		System.out.println(studentName+"--"+studentEmail+"-"+studentPassword);
		
		
	}

}
