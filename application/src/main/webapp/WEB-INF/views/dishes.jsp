<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/updatedish1" method="post">
		<div class="form-group">
			<table>
				<tr align="center">
					<td>Dish Id</td>
					<td><select name="name">
							<c:forEach var="dish" items="${dish}">
								<option value="${dish.name}">${dish.name}</option>
							</c:forEach>
					</select></td>
				
				<tr>
					<td>Dish Price</td>
					<td><input type="text" id="price" name="price"></td>
				</tr>
				<tr>
					<td>Dish Rating</td>
					<td><input type="text" id="rate" name="rate"></td>
				</tr>
				

				<tr>
					<td>
						<button type="submit" value="Submit">submit</button>
					</td>
				</tr>


			</table>
		</div>