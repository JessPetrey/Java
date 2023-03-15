<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Coming+Soon&family=Roboto&family=Shadows+Into+Light&display=swap" rel="stylesheet">

 <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
 <link rel="stylesheet" type="text/css" href="/css/main.css"/>
<title>Insert title here</title>
</head>
<body class="bodyFont">
	<div class="container my-5">
	<h1 class="headers" >Save Travels</h1>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Expense</th>
					<th>Vendor</th>
					<th>Amount</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="oneExpense" items="${allExpenses}">
					<tr>
						<td><a href="/expenses/${oneExpense.id}"><c:out value="${oneExpense.expense}" /></a></td>
						<td><c:out value="${oneExpense.vendor}" /></td>
						<td>${oneExpense.amount}]</td>
						<td><a href="/expenses/edit/${oneExpense.id}">Edit</a></td>
						<td>to do: delete</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div class="container my-5">
		<h3 class="headers" >Add an expense:</h3>
		<form:form action="/expenses/process/new" method="post" modelAttribute="expense">
			<div class="form-group">
				<label>Expense Name:</label>
				<form:input type="text" path="expense" class="form-control"/>
				<form:errors class="text-danger" path="expense"/>
			</div>
			<div class="form-group">
				<label>Vendor:</label>
				<form:input type="text" path="vendor" class="form-control"/>
				<form:errors class="text-danger" path="vendor"/>
			</div>
			<div class="form-group">
				<label>Amount:</label>
				<form:input type="number" path="amount" class="form-control"/>
				<form:errors class="text-danger" path="amount"/>
			</div>
		</form:form>
	</div>
</body>
</html>