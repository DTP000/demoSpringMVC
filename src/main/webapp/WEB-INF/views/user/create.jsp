<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Create user</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
	<div class="container">
	    <a href="../users">Back to users list</a>
		<p>
	      <c:if test="${message != null}">
	          <span class="text-success">${message}</span>
	      </c:if>
	    </p>
		<div class="row">
			<h1 class="text-success text-center">Add new user</h1>
		    <form:form action="new" method="post" modelAttribute="user">
			  <div class="mb-3">
			    <form:label path="userName">UserName:</form:label>
			    <form:input path="userName"/>
			  </div>
			<div class="mb-3">
			    <form:label path="password">Password:</form:label>
			    <form:input path="password" type="password"/>
			  </div>
			<div class="mb-3">
			    <form:label path="displayName">DisplayName:</form:label>
			    <form:input path="displayName"/>
			  </div>
			<div class="mb-3">
			    <form:label path="fullName">Fullname:</form:label>
			    <form:input path="fullName"/>
			  </div>
			  <form:button>Create user</form:button>
			</form:form>
			
		</div>
	</div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
                crossorigin="anonymous"></script>
</body>
</html>