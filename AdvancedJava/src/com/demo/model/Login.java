package com.demo.model;

public class Login {
 private String uname;
 private int password;
 private String role;
 
 public Login() {
	super();
 }
 
 public Login(String uname, int password, String role) {
	super();
	this.uname = uname;
	this.password = password;
	this.role = role;
 }

 public String getUname() {
	return uname;
 }

 public void setUname(String uname) {
	this.uname = uname;
 }

 public int getPassword() {
	return password;
 }

 public void setPassword(int password) {
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
	return "Login [uname=" + uname + ", password=" + password + ", role=" + role + "]";
 }
 
 
 
}
