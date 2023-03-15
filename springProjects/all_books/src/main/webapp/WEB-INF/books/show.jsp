<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>Reading Books</title>
</head>
<body class="container mt-5">
	<h1 class="my-5"><c:out value="${book.title }"/></h1>
	<p>Description: <c:out value="${book.description }"/></p>
	<p>Language: <c:out value="${book.language }"/></p>
	<p>Number of Pages: ${book.numberOfPages}</p>
</body>
</html>