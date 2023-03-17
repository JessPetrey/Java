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
	<h1>Welcome, <c:out value="${session.userName}"></c:out></h1>
	
	<a href="/users/logout" class="btn btn-outline-danger">Logout</a>
</body>
</html>