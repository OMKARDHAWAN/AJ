package com.demo.test;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.model.Student;
import com.demo.service.StudentService;

public class TestStudent {
  public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	
	StudentService studentService =  context.getBean(StudentService.class);
	
	Scanner scanner = new Scanner(System.in);
    boolean running = true;

    System.out.println("=== Welcome to Student Management System ===");

    while (running) {
        System.out.println("\nMENU:");
        System.out.println("1. Add Student");
        System.out.println("2. Exit");
        System.out.print("Enter your choice: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        switch (choice) {
            case 1:
                System.out.print("Enter Student ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                System.out.print("Enter Student Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Student Age: ");
                int age = scanner.nextInt();

                // Create object and pass it down the layers
                Student newStudent = new Student(id, name, age);
                try {
                    studentService.addStudent(newStudent);
                    System.out.println(">>> Student added successfully! <<<");
                } catch (Exception e) {
                    System.out.println(">>> Error saving student: " + e.getMessage() + " <<<");
                }
                break;

            case 2:
                System.out.println("Exiting application. Goodbye!");
                running = false;
                break;

            default:
                System.out.println("Invalid choice! Please select 1 or 2.");
        }
    }
	
}
}
