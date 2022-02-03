<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${msg}</h1>

	<p>${users}</p>

	<h1>Users Data</h1>
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Password</th>
				<th>Age</th>
				<th>Delete</th>
			</tr>
		</thead>


		<tbody>
			<c:forEach var="u" items="${users}">
				<tr>
					<td><c:out value="${u.userId}"/></td>
					<td><c:out value="${u.name}"/></td>
					<td><c:out value="${u.password}"/></td>
					<td><c:out value="${u.age}"/></td>
					<td><input type="button" value="Delete" name="id" href="spring/user/delete"><c:out value="${u.age}"/></td>
				</tr>
			</c:forEach>
		</tbody>

	</table>

</body>
</html>