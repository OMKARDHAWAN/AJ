<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Form</title>
</head>
<body>
    <form action="RegisterServlet" method="post">
     email: <input type="text" name="email" />
     uname: <input type="text" name="uname"/>
     password: <input type="password" name="password" />
     role : <input type="text" name="role" />
     <button type="submit">Submit</button>
     <h4>Already register?</h4>
     <a href="LoginForm.jsp">Login</a>
    </form>
</body>
</html>