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
<title>Save Travels</title>
</head>
<body class="bodyFont">
	<div class="container my-5 max-width">
	<h1 class="headers" >Save Travels</h1>
		<table class="table">
			<thead class="border-bottom border-3">
				<tr>
					<th>Expense</th>
					<th>Vendor</th>
					<th>Amount</th>
					<th colspan="2">Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="oneExpense" items="${allExpenses}">
					<tr>
						<td><a href="/expenses/${oneExpense.id}"><c:out value="${oneExpense.expenseName}" /></a></td>
						<td><c:out value="${oneExpense.vendor}" /></td>
						<td>${oneExpense.amount}</td>
						<td><a href="/expenses/edit/${oneExpense.id}">Edit</a></td>
						<td>
							<form action="/expenses/delete/${oneExpense.id}" method="post">
								<input type="hidden" name="_method" value="delete">
								<input type="submit" value="Delete" class="btn btn-danger">
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div class="container my-5 max-width">
		<h3 class="headers" >Add an expense:</h3>
		<form:form action="/expenses/process/new" method="post" modelAttribute="expense">
			<div class="form-group">
				<label>Expense Name:</label>
				<form:input type="text" path="expenseName" class="form-control"/>
				<form:errors class="text-danger" path="expenseName"/>
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
			<div class="form-group">
				<label>Description:</label>
				<form:textarea rows="5" cols="30" path="description" class="form-control"/>
				<form:errors class="text-danger" path="description"/>
			</div>
			<div class="my-2">
				<input type="submit" value="Submit" class="btn btn-primary"/>
			</div>
			
		</form:form>
	</div>
</body>
</html>