<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form action="addStudent" method="post">
   <div>
   <label for="id">Id :</label>
   <input type="number" name="id"/>
   </div>
     <div>
   <label for="name">Name :</label>
   <input type="text" name="name"/>
   </div>
     <div>
   <label for="age">Age :</label>
   <input type="number" name="age"/>
   </div>
   
   <button type="submit">Submit</button>
  </form>
  <a href="/MyJspServlet">Go to Dashboard</a>
</body>
</html>