<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Coming+Soon&family=Roboto&family=Shadows+Into+Light&display=swap"
	rel="stylesheet">

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/css/main.css" />
<title>Show Expense</title>
</head>
<body class="bodyFont">
	<div class="container my-5 max-width">
		<div class=" my-5 d-flex justify-content-between align-items-center">
			<h1 class="headers">Expense Details</h1>
			<a href="/expenses">Go Back</a>
		</div>
		<table class="table table-borderless">
			<tbody>
				<tr>
					<td>Expense Name:</td>
					<td><c:out value="${oneExpense.expenseName}" /></td>
				</tr>
				<tr>
					<td>Expense Description:</td>
					<td><c:out value="${oneExpense.description}" /></td>
				</tr>
				<tr>
					<td>Vendor:</td>
					<td><c:out value="${oneExpense.vendor}" /></td>
				</tr>
				<tr>
					<td>Amount:</td>
					<td>$${oneExpense.amount}</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>