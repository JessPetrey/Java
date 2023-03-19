<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Book Share</title>
</head>
<body>
	<div class="container my-5">
		<div class="d-flex justify-content-between align-items-center">
			<h1 class="text-info my-3">Add a book to your shelf!</h1>
			<a href="/books" class="btn btn-outline-info">Back to the shelves</a>
		</div>

		<form:form action="/books/process/new" method="post" modelAttribute="book">
			<form:hidden path="postedBy" value="${user_id}" />

			<div class="form-group">
				<label>Title</label>
				<form:input path="title" type="text" class="form-control" />
				<form:errors path="title" class="text-danger" />
			</div>
			<div class="form-group">
				<label>Author</label>
				<form:input path="author" type="text" class="form-control" />
				<form:errors path="author" class="text-danger" />
			</div>
			<div class="form-group">
				<label>My Thoughts</label>
				<form:textarea path="description" rows="5" cols="30" class="form-control" />
				<form:errors path="description" class="text-danger" />
			</div>

			<input type="submit" value="Submit" class="btn btn-warning my-3" />
		</form:form>
	</div>

</body>
</html>