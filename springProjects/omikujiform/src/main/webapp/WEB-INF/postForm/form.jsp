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
		<h1>Send an Omikuji!</h1>
		<div class="border">
			<form class="form form-control" action="/omikuji/process/form" method="post">
				<label for="num" class="form-label">Pick any number from 5 to 25</label>
				<input type="number" value=5 name="num" class="form-control">
				
				<label for="city" class="form-label">Enter the name of any city:</label>
				<input type="text" name="city" class="form-control">
				
				<label for="name" class="form-label">Enter the name of any real person:</label>
				<input type="text" name="name" class="form-control">
				
				<label for="activity" class="form-label">Enter professional endeavor or hobby:</label>
				<input type="text" name="activity" class="form-control">
				
				<label for="livingThing" class="form-label">Enter any type of living thing:</label>
				<input type="text" name="livingThing" class="form-control">
				
				<label for="niceThingToSay" class="form-label">Say something nice to someone:</label>
				<input type="text" name="niceThingToSay" class="form-control">
				
				<p class="my-3">Send and show a friend</p>
				
				<input type="submit" value="Send" >
			</form>
		</div>
	</div>
</body>
</html>