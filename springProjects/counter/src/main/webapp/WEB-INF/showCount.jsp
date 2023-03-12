<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Current visit count</title>
</head>
<body>
	<h3>You have visited <a href="http://localhost:8081/your_server">http://localhost:8081/your_server</a> <c:out value="${count}"/> times.</h3>
	<a href="http://localhost:8081/your_server">Test another visit?</a>
</body>
</html>