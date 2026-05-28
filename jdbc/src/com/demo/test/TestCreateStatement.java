package com.demo.test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestCreateStatement {
  public static void main(String[] args) {
	  try {
		//step 1 createStatement
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
        // step 2 create connection	
		String url = "jdbc:mysql://localhost:3306/db1?useSSL=false&allowPublicKeyRetrieval=true";
        Connection conn = DriverManager.getConnection(url,"root","12345");
        
        if(conn != null) {
        	System.out.println("Connection Established!!!");
        }else {
        	System.out.println("Connection not Established");
        }
		
        //step 3 create a Statement
        Statement st = conn.createStatement();
     
         //step 4 insert data 
         
        // to insert data 
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Student rollno :");
         int rollno = sc.nextInt();
         System.out.println(" ");
         System.out.println("Enter Name Of Student :");
         String sname = sc.next();
         System.out.println("");
         System.out.println("Enter Marks of Student :");
         int marks = sc.nextInt();
         System.out.println(" ");

         System.out.println("Enter division of Student :");
         int division = sc.nextInt();
         
         
         String query = "insert into studentdata(rollno,sname,marks,division) value("+ rollno + ", '" + sname + "' ," + marks + "," + division +")";
         
        // insert data into table studentdata 
        int n = st.executeUpdate(query); 
        
        if(n>0) {
        	System.out.println("Insertion done!!!");
        }else {
        	System.out.println("Insertion not done");
        }
         
         
         
         
        
        
         
       
        
        String query1 = "delete from studentdata where rollno = 6";
        
        int n1 = st.executeUpdate(query1);
         
        if(n1>0) {
        	System.out.println("Insertion done!!!");
        }else {
        	System.out.println("Insertion not done");
        } 
        
         
      //step 4 execute the statement
        ResultSet rs = st.executeQuery("select * from studentdata");
        
        while(rs.next()) {
        	System.out.println("Id : " + rs.getInt(1));
        	System.out.println("Student Name : " + rs.getString(2));
        	System.out.println("Marks : " + rs.getInt(3));
        	System.out.println("Division : " + rs.getInt(4));
        	System.out.println("--------------------------");
        	System.out.println(" ");
        } 
         
         
		
	  } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	  
}
}
