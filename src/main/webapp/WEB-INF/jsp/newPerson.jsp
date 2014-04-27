<%@ include file="include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>New Person</title>
</head>
<body>
	<div>
		<form:form action="add.htm" method="POST" modelAttribute="person">
			<span style="display: block;">
				<label for="firstName">First Name:</label>
				<form:input path="firstName" />
			</span>
			<span style="display: block;">
				<label for="lastName">Last Name:</label>
				<form:input path="lastName" />
			</span>
			<span style="display: block;">
				<label for="gender">Gender:</label>
				<form:select path="gender" items="${genders}" />
			</span>
			<span style="display: block;">
				<label for="birthDate">Birth Date:</label>
				<form:input path="birthDate" />
			</span>
			<span style="display: block;">
				<label for="email">Email:</label>
				<form:input path="email" />
			</span>
			<span style="display: block;">
				<input type="submit" value="Add" />
			</span>
		</form:form>
	</div>
</body>
</html>