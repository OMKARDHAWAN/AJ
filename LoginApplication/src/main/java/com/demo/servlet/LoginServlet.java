package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.demo.services.LoginServices;
import com.demo.services.LoginServicesImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
   resp.setContentType("text/html");
   String uname = req.getParameter("uname");
   String psword = req.getParameter("password");
   
   PrintWriter out = resp.getWriter();
   LoginServices Login = new LoginServicesImpl();
   String role = Login.checkValidation(uname,psword);
   
   
   
   
//   
//   if(role != null){
//	   if(role.equals("admin")){
//	     out.println("<h1>Hello admin</h1>");
//	   }else if(role.equals("user")){
//	     out.println("<h1>Hello user</h1>");
//	   }else {
//		  out.println("Login Failed!!!");
//	   }
//   }else {
//	   System.out.println("Connection not established!!!!");
//   }
   
}
}
