<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="jakarta.tags.core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 
  <table border="1">
     <thead>
      <th>Id</th>
      <th>Name</th>
      <th>Age</th>
     </thead>
     <tbody>
 <c:forEach var="student" items="${students}">
       <tr>
        <td>${student.id}</td>
        <td>${student.name}</td>
        <td>${student.age}</td>
       </tr>
 </c:forEach>
     </tbody>
    </table>
</body>
</html>