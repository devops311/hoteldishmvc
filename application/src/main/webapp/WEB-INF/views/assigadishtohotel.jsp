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
<form action="/assignit" method="post">
<div class="form-group">
			<table>
				<tr align="center">
					<td>Dish Id</td>
					<td><select name="dishId">
							<c:forEach var="dish" items="${dish}">
								<option value="${dish.dishId}">${dish.dishId}</option>
							</c:forEach>
				</select>
				</td>
				</tr>
			</table>
			</div>
			<div class="form-group">
			<table>
				<tr align="center">
					<td>Hotel ID</td>
					<td><select name="hotelId">
							<c:forEach var="hotel" items="${hotel}">
								<option value="${hotel.hotelId}">${hotel.hotelId}</option>
							</c:forEach>
				</select>
				</td>
				</tr>
			</table>
			</div>
		
			<button type="submit" class="btn btn-primary">ASSIGN</button>
			</form>

</body>
</html>