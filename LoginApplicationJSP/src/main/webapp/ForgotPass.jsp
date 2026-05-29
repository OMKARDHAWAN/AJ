<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="ForgotPass" method="post">
     email: <input type="text" name="email"/> 
     new password: <input type="password" name="newpassword"/>
     re-enter password: <input type="password" name="repassword" />
     captcha : 1111
     <input type="number" name="captcha" id="captcha"/>
     <button type="submit">Submit</button>
 </form>
</body>
</html>