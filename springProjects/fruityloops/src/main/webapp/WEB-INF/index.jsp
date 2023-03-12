<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>Fruit Store</title>
</head>
<body>
	<div class="container m-5 p-2">
		<h1 class="text-danger text-opacity-75 mb-4">Fruit Store</h1>
		<div class="bg-danger bg-opacity-50 p-4">
			<table class="table bg-white m-1 border border-danger border-opacity-50">
				<thead class="fw-bold">
					<tr>
						<td>Name</td>
						<td>Price</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="oneItem" items="${allItems}">
						<tr>
							<td><c:out value="${oneItem.name}"/></td>
							<td><c:out value="${oneItem.price}"/></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>