<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>Find Student Enrollment</title>
</head>
<body> <center>
<h1>Enter the Course Name</h1>
<form name="GetCourseForm" action="./listStudents.html" method="GET">
    Course Name: <input type="TEXT" name="courseName">
    <input type="submit" value="Lookup">
</form>
</body>
</html>