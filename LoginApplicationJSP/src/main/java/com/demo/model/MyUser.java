package com.demo.model;

public class MyUser {
 private String email,uname,password,role;

 
 
 public MyUser() {
	this.email = "";
	this.uname = "";
	this.password = " ";
	this.role = " ";
}



 public MyUser(String email, String uname, String password, String role) {
	this.email = email;
	this.uname = uname;
	this.password = password;
	this.role = role;
 }



 public String getEmail() {
	return email;
 }



 public void setEmail(String email) {
	this.email = email;
 }



 public String getUname() {
	return uname;
 }



 public void setUname(String uname) {
	this.uname = uname;
 }



 public String getPassword() {
	return password;
 }



 public void setPassword(String password) {
	this.password = password;
 }



 public String getRole() {
	return role;
 }



 public void setRole(String role) {
	this.role = role;
 }



 @Override
 public String toString() {
	return "MyUser [email=" + email + ", uname=" + uname + ", password=" + password + ", role=" + role + "]";
 }
 
 
 
 
 
}
