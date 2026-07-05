package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class FirstServlet extends HttpServlet {
	
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
	 res.setContentType("text/html");
	 PrintWriter out = res.getWriter();
	 out.println("<h1>Hello User</h1>");
	 
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
   	 res.setContentType("text/html");
   	 
   	 String Username = req.getParameter("uname");
   	 String Password = req.getParameter("pword");
   	  
     PrintWriter out = res.getWriter();
   	 
     
     
     if(Username.equals("admin") && Password.equals("12345")) {
    	 out.println("<h1>Login successfull!!</h1>");
     }else {
         out.println("<h2>Invalid Credentials</h2>");
     }
   	
   	  
   	  
   	  
       }
    
}
