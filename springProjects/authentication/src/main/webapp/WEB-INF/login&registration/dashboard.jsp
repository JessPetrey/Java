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
<body class="containe m-5">
	<h1>Welcome, <c:out value="${user.userName}"></c:out></h1>
	<p>This is your dashboard. Nothing to see here yet.</p>
	
	<a href="/users/logout" class="btn btn-outline-danger">Logout</a>
</body>
</html>