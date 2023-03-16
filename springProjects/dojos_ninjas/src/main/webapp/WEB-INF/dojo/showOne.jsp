<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<title>Dojo Page</title>
</head>
<body>
	<div class="container my-5">
		<div class="d-flex justify-content-between align-items-center">
			<h1>
				<c:out value="${dojo.name}"></c:out>
				Location Ninjas
			</h1>
			<a href="/" class="btn btn-light">Go Back</a>
		</div>
		<table class="table table-striped border border-5 my-5">
			<thead class="bg-warning">
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</thead>
			<tbody>
				<c:forEach items="${dojo.ninjas}" var="ninja">
					<tr>
						<td>${ninja.firstName}</td>
						<td>${ninja.lastName}</td>
						<td>${ninja.age}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>