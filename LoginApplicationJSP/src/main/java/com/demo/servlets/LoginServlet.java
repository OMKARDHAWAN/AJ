package com.demo.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.demo.services.LoginServices;
import com.demo.services.LoginServicesImpl;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String uname = request.getParameter("uname");
		 String password = request.getParameter("password");
		 LoginServices lservice = new LoginServicesImpl();
         PrintWriter out = response.getWriter(); 
		 String role = lservice.authenticateUser(uname,password);

         System.out.println(role);	 
        	
         if(role != null) {
        	 switch(role){
        	 case "admin"->{
        		 HttpSession session = request.getSession();
        		 session.setAttribute("user", uname);
        		 session.setAttribute("password", password);
        		 session.setAttribute("role", role);
        		 response.sendRedirect("Home.jsp");
        		 
        	 }case "user"->{
        		 System.out.println("username" + uname);
          		 System.out.println("password"+ password);
        		 response.sendRedirect("Home.jsp");
        	 }
        	 default ->{
            		 RequestDispatcher rst = request.getRequestDispatcher("LoginForm.jsp");
            		 rst.include(request, response);
        			 out.println("Error!!!!");
        		 }
        	 }
        	 
        	 
         }else {
        	 out.println("Invalid Login!!!!");
        	 RequestDispatcher rst = request.getRequestDispatcher("LoginForm.jsp");
    		 rst.include(request, response);
         }
         }
		 
		 
	}



