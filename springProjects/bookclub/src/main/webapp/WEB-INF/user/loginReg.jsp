<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container my-5">
		<div class="my-5">
			<h1 class="text-info my-3">Welcome!</h1>
			<h3>Join our growing communtiy.</h3>
		</div>
		<div class="d-flex">

			<div class="col-sm">
				<h1>Register</h1>
				<form:form action="/users/register" method="post"
					modelAttribute="newUser">
					<div class="form-group">
						<label>User Name</label>
						<form:input path="userName" type="text" class="form-control" />
						<form:errors path="userName" class="text-danger" />
					</div>
					<div class="form-group">
						<label>Email</label>
						<form:input path="email" type="email" class="form-control" />
						<form:errors path="email" class="text-danger" />
					</div>
					<div class="form-group">
						<label>Password</label>
						<form:input path="password" type="password" class="form-control" />
						<form:errors path="password" class="text-danger" />
					</div>
					<div class="form-group">
						<label>Confirm Password</label>
						<form:input path="confirm" type="password" class="form-control" />
						<form:errors path="confirm" class="text-danger" />
					</div>

					<input type="submit" value="Submit" class="btn btn-warning my-3" />
				</form:form>
			</div>
			<div class="col-sm offset-3">
				<div>
					<h1>Login</h1>
					<form:form action="/users/login" method="post"
						modelAttribute="loginUser">
						<div class="form-group">
							<label>Email</label>
							<form:input path="email" type="email" class="form-control" />
							<form:errors path="email" class="text-danger" />
						</div>
						<div class="form-group">
							<label>Password</label>
							<form:input path="password" type="password" class="form-control" />
							<form:errors path="password" class="text-danger" />
						</div>

						<input type="submit" value="Submit" class="btn btn-warning my-3" />
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>