<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<title>New Ninja</title>
</head>
<body>
	<div class="container my-5">
		<div class="d-flex justify-content-between align-items-center">
			<h1 class="my-4">New Dojo</h1>
			<a href="/" class="btn btn-light">Go Back</a>
		</div>
		<form:form action="/ninjas/process/new" method="post"
			modelAttribute="newNinja">
			<div class="form-group">
				<label>Dojo:</label>
				<form:select path="dojo" class="form-select">
					<c:forEach var="dojo" items="${allDojos}">
						<form:option value="${dojo.id}" path="donor">
							<c:out value="${dojo.name}" />
						</form:option>
					</c:forEach>
				</form:select>
			</div>
			<div class="form-group">
				<label>First Name:</label>
				<form:input path="firstName" class="form-control" />
				<form:errors path="firstName" class="text-danger" />
			</div>
			<div class="form-group">
				<label>Last Name:</label>
				<form:input path="lastName" class="form-control" />
				<form:errors path="lastName" class="text-danger" />
			</div>
			<div class="form-group">
				<label>Age:</label>
				<form:input path="age" class="form-control" />
				<form:errors path="age" class="text-danger" />
			</div>
			<input type="submit" value="add ninja" class="btn btn-warning my-3" />
		</form:form>
	</div>
</body>
</html>