package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee name:- ");
		String eName=sc.next();
		System.out.println("Enter Employee age:- ");
		String eAge=sc.next();
		System.out.println("Enter Employee gender:- ");
		String gender=sc.next();
		
		//MIME TYPE
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1>Name ="+eName+"</h1>");
		out.print("<h2>Age ="+eAge+"</h2>");
		out.print("<font color = 'red' size='4'>Gender ="+gender+"</font>");
		out.print("</body></html>");
		out.close();
	}

}
