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
<h1>${error }</h1>
	<form:form action="/login" method="POST" commandName="user">
		<table>
			<tr>
				<td>User Name:</td>
				<td><form:input path="username" /></td>
				<td><form:errors path="username"> Invalid User Name.</form:errors></td>
			</tr>

			<tr>
				<td>Password:</td>
				<td><form:input path="password" /></td>
				<td><form:errors path="password"> Invalid Password.</form:errors></td>
			</tr>

			<tr>
				<td colspan="3"><form:button name="submit" value="Submit">Save</form:button></td>
			</tr>

		</table>

	</form:form>
</body>
</html>