<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form action="/login" method="POST" commandName="user">
		<table>
			<tr>
				<td>User Name:</td>
				<td><form:input path="username" /></td>
			</tr>

			<tr>
				<td>Password:</td>
				<td><form:input path="password" /></td>
			</tr>

			<tr>
				<td colspan="2"><form:button name="submit" /></td>
			</tr>

		</table>

	</form:form>
</body>
</html>