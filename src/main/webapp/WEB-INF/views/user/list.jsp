<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Listing User</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<h1 class="text-success text-center">Users</h1>
		    <p><a href="user/new">Add new user</a></p>
		    <p>There are ${products.size()} users in this list.</p>
		    <table class="table-info">
		        <tr>
		            <td>Code</td>
		            <td>UserName</td>
		            <td>Fullname</td>
		            <td>Display Name</td>
		        </tr>
		        <c:forEach var="user" items="${users}">
		            <tr>
		                <td>${user.id}</td>
		                 <td><a href="user/${user.getId()}"> ${user.userName}</a></td>
		                <td>${user.fullName}</td>
		                <td>${user.displayName}</td>
		            </tr>
		        </c:forEach>
		    </table>
			
		</div>
	</div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
                crossorigin="anonymous"></script>
</body>
</html>