package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.demo.services.LoginServices;
import com.demo.services.LoginServicesImpl;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public  class LoginServlet extends HttpServlet{
 
	String username = null , password = null,companyname = null;
	public void init(ServletConfig config) throws ServletException {
	  username = config.getInitParameter("username");
	  password = config.getInitParameter("password");
	  companyname = config.getInitParameter("Company name");
	  
	  
	  System.out.println(username);
	  System.out.println(password);
	  System.out.println(companyname);
	  
	  
	  
	  
	}
	
	
	
	
	
	
	
	
	
	@Override
 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub  
		
		String uname = req.getParameter("uname");
		String pword = req.getParameter("pword");
		
		PrintWriter out = resp.getWriter();
		
		System.out.println(username);
		System.out.println(password);
		if(uname.equals(username) && pword.equals(password)){
		  out.println("Valid User");	
		}else {
			out.println("User not Valid");
		}
		
		
}
}
