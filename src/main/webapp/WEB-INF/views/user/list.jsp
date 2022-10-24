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
	<link href="<c:url value="/resources/css/bootstrap522.min.css" />" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row">
			<h1 class="text-success text-center">Users</h1>
		    <p><a href="<c:url value="user/new" />">Add new user</a></p>
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
		                 <td><a href="<c:url value="user/${user.getId()}" />"> ${user.userName}</a></td>
		                <td>${user.fullName}</td>
		                <td>${user.displayName}</td>
		            </tr>
		        </c:forEach>
		    </table>
			
		</div>
	</div>
    <script src="<c:url value="resources/js/bootstrap522.bundle.min.js" />"></script>
</body>
</html>