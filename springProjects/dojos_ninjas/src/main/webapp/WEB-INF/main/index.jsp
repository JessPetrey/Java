<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">

<title>Dashboard</title>
</head>
<body>
	<div class="container my-5">
		<h1>Dashboard</h1>
		<a href="/dojos/new" class="btn btn-warning">Create Dojo</a>
		<a href="/ninjas/new" class="btn btn-warning">Create Ninja</a>
	</div>
	<div class="container my-5">
		<table>
			<tbody>
				<c:forEach items="${allDojos}" var="dojo">
					<tr>
						<td><a href="/dojos/${dojo.id}"><c:out
									value="${dojo.name}" /></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>