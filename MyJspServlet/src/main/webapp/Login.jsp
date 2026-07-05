<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="LoginServlet" method="Post">
  <h1>Login</h1>
 
     <div>
   <label for="username">Username :</label>
   <input type="text" name="username"/>
   </div>
     <div>
   <label for="password">Password :</label>
   <input type="number" name="password"/>
   </div>
   
   <button type="submit">Submit</button>
 </form>
</body>
</html>