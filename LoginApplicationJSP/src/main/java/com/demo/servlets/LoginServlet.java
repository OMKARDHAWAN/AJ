package com.demo.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
		 System.out.println("role value in loginservlet" + role);
         if(role != null){
        	 if(role.equals("admin")) {
        		 RequestDispatcher rst = request.getRequestDispatcher("Home.jsp");
        		 rst.forward(request, response);
        		 out.println("Hello admin");
        		 System.out.println("<h1>hello admin</h1>");
        	 }else if(role.equals("user")){
        		 RequestDispatcher rst = request.getRequestDispatcher("Home.jsp");
        		 rst.forward(request, response);
        		 out.println("<h1>Hello user</h1>");
        		 System.out.println("login");
        	 }else {
        		 RequestDispatcher rst = request.getRequestDispatcher("Login.jsp");
        		 rst.include(request, response);
        		 out.println("Error!!!!");
        		 System.out.println("Error");
        	 }
         }
		 
		 
	}



}
