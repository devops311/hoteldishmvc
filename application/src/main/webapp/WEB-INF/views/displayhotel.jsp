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

<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>HOTEL ID</th>
			<th>HOTEL AVG RATING</th>
			
			
		</tr>
		<c:forEach items="${hotel}" var="hotel">
			<tr>
				<td><c:out value="${hotel.getHotelId()}" /></td>
				<td><c:out value="${hotel.getAvgRate()}" /></td>
				
				
			
			</tr>

		</c:forEach>
		<button type="submit" onclick="location.href='/'">Home</button>
	</table>

</body>
</html>