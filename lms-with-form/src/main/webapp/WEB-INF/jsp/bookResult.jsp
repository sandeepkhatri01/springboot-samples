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
	<h1>Book saved successfully.</h1>
	<form:form action="/book" method="POST" commandName="book">
		<table>
			<tr>
				<td>Title:</td>
				<td><form:input path="title" disabled="true" /></td>
				<td><form:errors path="title"> Invalid Title Name.</form:errors></td>
			</tr>

			<tr>
				<td>Publisher:</td>
				<td><form:input path="publisher" disabled="true" /></td>
				<td><form:errors path="publisher"> Invalid Publisher.</form:errors></td>
			</tr>

			<tr>
				<td>Price:</td>
				<td><form:input path="price" disabled="true" /></td>
				<td><form:errors path="price"> Invalid Price.</form:errors></td>
			</tr>

			<tr>
				<td>Quantity:</td>
				<td><form:input path="quantity" disabled="true" /></td>
				<td><form:errors path="quantity"> Invalid Quantity.</form:errors></td>
			</tr>

			<tr>
				<td colspan="3"><form:button name="submit" value="Submit"
						disabled="true">Save</form:button></td>
			</tr>

		</table>

	</form:form>
</body>
</html>