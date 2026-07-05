package com.demo.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.jsp.JspWriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;


@WebServlet("/MyJspServlet/")
public class MyJspServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MyJspServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		List<Student> studentlist = new ArrayList<>();
		
		StudentService sobj = new StudentServiceImpl();
		
		
		studentlist = sobj.fetchStudent();
		for (Student student : studentlist) {
			System.out.println(student.getSid());
		}
		
		
		if(studentlist != null) {
			RequestDispatcher req = request.getRequestDispatcher("index.jsp"); 
		  	request.setAttribute("students",studentlist);
			req.forward(request, response);
		}else {
			RequestDispatcher req1 = request.getRequestDispatcher("Error.jsp");
			req1.include(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
