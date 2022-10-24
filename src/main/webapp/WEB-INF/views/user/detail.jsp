<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
	<%@ page isELIgnored ="false" %>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>${user.userName}</title>
	<link href="<c:url value="/resources/css/bootstrap522.min.css" />" rel="stylesheet">
</head>
<body>
	<h1>Username: ${user.userName}</h1>
	<a href="<c:url value="/users" />">Back to user list</a>
	<p>
      <c:if test="${message != null}">
          <span class="text-success">${message}</span>
      </c:if>
    </p>
    <div class="row">
		<h1 class="text-success text-center">Detail and update user</h1>
	    <form:form action="../user/${user.id}/update" method="POST" modelAttribute="user">
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
		  <form:button class="btn btn-primary">Update</form:button>
		</form:form>
		<form action="<c:url value="../user/${user.id}/delete" />" method="POST">
		  <input type="submit" class="btn btn-danger" value="Delete">
		</form>
		</div>
	    <script src="<c:url value="resources/js/bootstrap522.bundle.min.js" />"></script>

</body>
</html>