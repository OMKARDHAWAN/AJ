package com.demo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.demo.service.AddEmployee;
import com.demo.service.EmployeeServiceImpl;

@WebServlet("/addEmployee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public EmployeeServlet() {
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
		
		int id = Integer.parseInt(request.getParameter("id"));
		String Name = request.getParameter("Name");
		int Salary = Integer.parseInt(request.getParameter("Salary"));

	    AddEmployee emp = new EmployeeServiceImpl();	
		
	    emp.addEmployee(id ,Name, Salary);
	    
	    response.sendRedirect("/MyServlet/hello");
		
	}

}
