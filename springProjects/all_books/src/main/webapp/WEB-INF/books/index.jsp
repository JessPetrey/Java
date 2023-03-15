<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>Reading Books</title>
</head>
<body class="container mt-5">
	<h1 class="my-5">All Books</h1>
	<table class="table table-striped table-success">
		<thead class=" border-bottom border-dark">
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Language</th>
				<th># Pages</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="oneBook" items="${allBooks}">
				<tr scope="row">
					<td><c:out value="${oneBook.id}" /></td>
					<td><a href="http://localhost:8081/books/${Long.valueOf(oneBook.id)}"><c:out value="${oneBook.title}" /></a></td>
					<td><c:out value="${oneBook.language}" /></td>
					<td><c:out value="${oneBook.numberOfPages}" /></td>
				</tr>
			</c:forEach>

		</tbody>

	</table>
</body>
</html>