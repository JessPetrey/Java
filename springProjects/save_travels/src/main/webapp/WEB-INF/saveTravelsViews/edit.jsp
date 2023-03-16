<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

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
<title>Edit Expense</title>
</head>
<body class="bodyFont">
	<div class="container my-5 max-width">
		<div class=" my-5 d-flex justify-content-between align-items-center">
			<h1 class="headers">Edit Expense</h1>
			<a href="/expenses">Go Back</a>
		</div>
		<form:form action="/expenses/process/${expense.id}" method="post" modelAttribute="expense">
			<input type="hidden" name="_method" value="put"/>
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
			<input type="submit" value="Submit" class="btn btn-primary"/>
		</form:form>
	</div>

</body>
</html>