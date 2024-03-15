<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Welcome</title>
</head>
<body>
	<h2>Welcome, ${user.name}!</h2>
	<p>Hello, you are logged in!</p>

	<h3>List of Registered Users:</h3>
	<table border="1">
		<thead>
			<tr>
				<th>Name</th>
				<th>Date of Birth</th>
				<th>Email</th>
				<th>Login ID</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${registeredUsers}">
				<tr>
					<td>${user.name}</td>
					<td>${user.dob}</td>
					<td>${user.email}</td>
					<td>${user.loginId}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
