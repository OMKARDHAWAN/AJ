package com.demo.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/RegisterServlet")
public class RegisterSerlvet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RegisterSerlvet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    response.setContentType("text/html");
	    String email = request.getParameter("email");
	    String uname = request.getParameter("uname");
	    String password = request.getParameter("password");
	    String role = request.getParameter("role");
	    System.out.println("email :" + " " + email);
	    System.out.println("uname : " + " " + uname);
	    System.out.println("password: " + " " + password);
	    
	    
//	    
//	    PrintWriter out = response.getWriter();
//	    out.println(email);
//	    out.println(uname);
	    
	    
	    
	}

}
