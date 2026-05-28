package com.demo.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.demo.dao.RegisterDaoImpl;
import com.demo.model.MyUser;
import com.demo.services.RegisterService;
import com.demo.services.RegisterServiceImpl;


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
	    PrintWriter out = response.getWriter();
	    
	    RegisterService RService = new RegisterServiceImpl();
	    
		MyUser user  = RService.registerUser(email,uname,password,role);
         
		if(user != null) {
			System.out.println("Data inserted Successfully!!!");
			out.println("User Register Successfully!!!");
			RequestDispatcher rst = request.getRequestDispatcher("LoginForm.jsp"); 
			rst.forward(request, response);
			
		}else {
			System.out.println("Data not inserted Successfully!!!");
			out.println("User not register,Please Enter Again!!!");
			RequestDispatcher rst = request.getRequestDispatcher("Register.jsp");
			rst.include(request, response);
		}
	    
        
	    

	    
	    
	}

}
