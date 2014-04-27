<%@ include file="include.jsp"%>
<html>
<head>
<title>View All Persons</title>
<style type="text/css">
table,th,td {
	border: 1px solid black;
}

th {
	background-color: lightgray;
}
</style>
</head>

<body>
	<table>
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Gender</th>
				<th>Birth Date</th>
				<th>Email</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${persons}" var="person">
				<tr>
					<td>${person.firstName}</td>
					<td>${person.lastName}</td>
					<td>${person.gender}</td>
					<td><fmt:formatDate value="${person.birthDate}"
							pattern="yyyy-MM-dd" />
					</td>
					<td>${person.email}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="new.htm">Add New Person</a>
</body>
</html>