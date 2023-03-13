<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>Omikuji</title>
</head>
<body>
	<div class="container text-center">
		<h1>Here's Your Omikuji!</h1>
		<div class="border border-3 border-dark bg-primary bg-opacity-50 mb-5">
			<h3 class="m-5">In ${num} years, you will live in <c:out value="${city}"/> 
				with <c:out value="${name}"/> as your roommate, selling 
				<c:out value="${activity}"/> for a living. The next time 
				you see a <c:out value="${livingThing}"/>, you will have 
				good luck. Also, <c:out value="${niceThingToSay}"/>.
			</h3>
		</div>
		<a href="http://localhost:8081/omikuji">Go Back</a>
	</div>
</body>
</html>