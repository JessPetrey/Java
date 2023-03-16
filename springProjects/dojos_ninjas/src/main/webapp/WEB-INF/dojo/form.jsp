<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<title>New Dojo</title>
</head>
<body>
	<div class="container my-5">
		<div class="d-flex justify-content-between align-items-center">
			<h1 class="my-4">New Dojo</h1>
			<a href="/" class="btn btn-light">Go Back</a>
		</div>
		<form:form action="/dojos/process/new" method="post"
			modelAttribute="newDojo">
			<div class="form-group">
				<label>Name:</label>
				<form:input path="name" class="form-control"/>
				<form:errors path="name" class="text-danger" />
			</div>

			<input type="submit" value="Create" class="btn btn-warning my-3" />
		</form:form>
	</div>
</body>
</html>