package com.demo.test;

import java.sql.Statement;
import java.util.Scanner;

import com.demo.service.LoginService;
import com.demo.service.LoginServiceImp;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImp;

public class test {
   public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);
	   int choice = 0;
	   
   do {
       System.out.println("Enter username : ");
       String name = sc.next();
       System.out.println("Enter password : ");
       String password = sc.next();
       
       LoginService login = new LoginServiceImp();
       String role = login.validateUser(name, password);
       
       ProductService Pd = new ProductServiceImp();
       
       
       if(role.equals("admin")){
    	   System.out.println("\n 1.Add Product\n 2.Delete product by id 3.Update product by id \n");
    	   System.out.println("\n 4.Display All \n 5.Display By id \n  6.Display in sorted order \n 7.exit \n");
    	   
    	   
       }else if(role.equals("user")){
    	   System.out.println("You are user!!!");
       }else {
    	   System.out.println("Not Found!!!!");
       }
         
       
       
   }while(choice !=8);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
}
