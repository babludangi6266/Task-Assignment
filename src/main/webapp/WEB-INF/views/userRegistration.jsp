<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>User Registration</title>
</head>
<body>
	<h2>User Registration</h2>
	<form action="/register" method="post">
		Name: <input type="text" name="name" required><br> Date
		Of Birth: <input type="text" id="dob" name="dob"
			pattern="\d{4}-\d{2}-\d{2}" placeholder="YYYY-MM-DD" required><br>
		Email : <input type="email" id="email" name="email" required>
		Login ID: <input type="text" name="loginId" required><br>
		Password: <input type="password" name="password" required><br>
		<input type="submit" value="Register">
	</form>
</body>
</html>
