<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
   <form action="LoginServlet" method="post">
     uname: <input type="text" name="uname"/>
     password: <input type="password" name="password" />
     <button type="submit">Submit</button>
     <h4>Not register?</h4>
     <a href="Register.jsp">Sign Up</a>
   </form>
</body>
</html>