<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />

<meta charset="UTF-8">
<title>Read Share</title>
</head>
<body>
	<div class="container my-5">
		<div class="d-flex justify-content-between align-items-center">
			<h1 class="my-5">
				<c:out value="${book.title}" />
			</h1>
			<a href="/books" class="btn btn-outline-info">Back to the shelves</a>
		</div>
		<div>
			<h4>
				<c:out
					value="${book.postedBy.userName} read ${book.title} by ${book.author}." />
			</h4>
			<h4>
				<c:out value="Here are ${book.postedBy.userName}'s thoughts:" />
			</h4>
		</div>
		<div class="m-4">
			<hr class="my-5">
			<p class="fst-italic">
				<c:out value="${book.description}" />
			</p>
			<hr class="my-5">
			<div class="d-flex justify-content-end">
				<a href="/books/${book.id}/edit"
					class="btn btn-outline-warning mx-4">edit</a>
				<form action="/books/${book.id}/delete" method="post">
					<input type="hidden" name="_method" value="delete" /> <input
						type="submit" value="delete" class="btn btn-outline-danger" />
				</form>
			</div>
		</div>
	</div>
</body>
</html>