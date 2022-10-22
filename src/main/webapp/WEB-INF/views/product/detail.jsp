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
	<title>${product.name}</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
	<h1>Product name: ${product.name}</h1>
	<a href="../products">Back to product list</a>
	<p>
      <c:if test="${message != null}">
          <span class="text-success">${message}</span>
      </c:if>
    </p>
    <div class="row">
		<h1 class="text-success text-center">Detail and update product</h1>
	    <form:form action="../product/${product.id}/update" method="POST" modelAttribute="product">
		  <div class="mb-3">
		    <form:label path="name">Name:</form:label>
		    <form:input path="name"/>
		  </div>
		<div class="mb-3">
		    <form:label path="price">Price:</form:label>
		    <form:input path="price"/>
		  </div>
		  <form:button class="btn btn-primary">Update</form:button>
		</form:form>
		<form action="../product/${product.id}/delete" method="POST">
		  <input type="submit" class="btn btn-danger" value="Delete">
		</form>
		</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
                crossorigin="anonymous"></script>
</body>
</html>