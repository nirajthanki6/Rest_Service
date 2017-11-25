<%@ include file="./include.jsp"%>

<html>
<head>
   <title>Student Enrollment</title>
</head>
<body>
  <h1>Students Enrolled in ${courseName}:</h1>
  <table BORDER="8" bgcolor="#FAEBD7" cellspacing="10" cellpadding="15">
<tr>
	<th>Last Name</th>
	<th>First Name</th>
</tr>
	<c:forEach var="curStudent" items="${studentList}">
		<tr>
		   <td>${curStudent.lastName}</td><td>${curStudent.firstName}</td>
		</tr>
	</c:forEach>
</table>

<br><br><h2>
<a href="${context}">Home</a>
</h2>
</body>
</html>