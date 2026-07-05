package com.demo.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

/**
 * Servlet implementation class addStudentServlet
 */
@WebServlet("/addStudent")
public class addStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public addStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		
		
		StudentService std = new StudentServiceImpl();
		
		int n = std.addStudent(id,name,age);
		
		RequestDispatcher req1 = request.getRequestDispatcher("Dashboard.jsp");
		String msg = "";
		
		if(n > 0) {
			System.out.println("Data inserted successfully!!!");
		    msg = "Welcome";
			request.setAttribute("message", msg);
			req1.forward(request, response);
		}else {
			System.out.println("Data not Inseted!!!!");
			RequestDispatcher req2 = request.getRequestDispatcher("form.jsp");
			msg = "Please Enter values again!!";
			req2.include(request, response);
		}
		
		
		
		
		
	}

}
