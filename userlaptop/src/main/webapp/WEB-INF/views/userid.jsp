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
	<div class="form-group">
	<form action="/getlaptop" method="post" id="form1">
			<table>
				<tr align="center">
					<td>User</td>
					<td><select name="userId">
							<c:forEach var="user" items="${user}">
								<option value="${user.userId}">${user.userId}</option>
							</c:forEach>
				</select>
				</td>
				</tr>
			</table>
			<button type="submit" class="btn btn-primary">Submit</button>
			</form>
			</div>
		
</body>
</html>