<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
      
<title>Home Page</title>
</head>
<body>

   <div align="center" class="container-lg">
       
       
       <table border="1">
			<tr>
				<td>ID</td>
				<td>Name</td>
				<td>Gender</td>
				<td>Policyname</td>
				<td>Photo</td>
				<td>Edit</td>
				<td>Delete</td>
			</tr>



			<c:forEach items="${users}" var="u">
				<tr>
					<td>${u.id}</td>
					<td>${u.userName}</td>
					<td>${u.userAge}</td>
					<td>${u.userCity}</td>
					<td><img alt="No Photo" width="100 height=300" src="data:image/jpg;base64,${u.userPicture}"></img></td>
					<td><a href="updateuser/${u.id}">Edit</a></td>
					<td><a href="deleteuser/${u.id}">Delete</a></td>
				</tr>
			</c:forEach>

       
   <div>

</body>
</html>