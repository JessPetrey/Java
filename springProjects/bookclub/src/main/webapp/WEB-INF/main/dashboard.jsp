<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Read Share</title>
</head>
<body class="container m-5">
	<div class="d-flex justify-content-between align-items-center">
		<h1>
			Welcome,
			<c:out value="${user.userName}"></c:out>
		</h1>
		<a href="/users/logout" class="btn btn-outline-danger">Logout</a>
	</div>
	<div class="d-flex justify-content-between align-items-center">
		<p>Books from everyone's shelves:</p>
		<a href="/books/new" class="btn btn-outline-info">+ Add a book to
			my shelf!</a>
	</div>
	<div>
		<table class="table table-striped table-success my-3">
			<thead class=" border-bottom border-dark">
				<tr>
					<th>ID</th>
					<th>Title</th>
					<th>Author Name</th>
					<th>Posted By</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="oneBook" items="${allBooks}">
					<tr>
						<td><c:out value="${oneBook.id}" /></td>
						<td><a
							href="/books/${oneBook.id}"><c:out
									value="${oneBook.title}" /></a></td>
						<td><c:out value="${oneBook.author}" /></td>
						<td><c:out value="${oneBook.postedBy.userName}" /></td><!-- fix this -->
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>