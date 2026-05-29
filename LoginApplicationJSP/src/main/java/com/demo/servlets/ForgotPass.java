package com.demo.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.demo.dao.LoginDao;
import com.demo.services.LoginServices;
import com.demo.services.LoginServicesImpl;


@WebServlet("/ForgotPass")
public class ForgotPass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String email = request.getParameter("email");
		String newpassword = request.getParameter("newpassword");
		String repassword = request.getParameter("repassword");
		int captcha = Integer.parseInt(request.getParameter("captcha"));
		LoginServices lservice = new LoginServicesImpl();
		PrintWriter out = response.getWriter();
		
		if(captcha == 1111) {
			Boolean status = lservice.updatePassword(email,newpassword);	
			if(status) {
				System.out.println("password updated!!!!");
				response.sendRedirect("LoginForm.jsp");
			}else{
				System.out.println("Password not updated!!!!");
				RequestDispatcher rs = request.getRequestDispatcher("ForgotPass.jsp");
				rs.include(request, response);
				out.println("Password not updated,Please enter Password again!!!");
			}
		}else {
			RequestDispatcher rs = request.getRequestDispatcher("ForgotPass.jsp");
			rs.include(request, response);
			out.println("Enter Captcha is not correct!!!");
		}
		
		
		
		
		
		
		doGet(request, response);
	}

}
