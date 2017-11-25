<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>New Student Information</title>
</head>
<body>

<h1>Please Enter Your Profile</h1>
  <form name="studDataFormWithSession" action="./processNewStudentProfile" method="POST">
	  <table>
	  <tr>
	  	<td>Last Name</td> 
	    <td> <input type="TEXT" name="lastName" value="${sessionScope.student.lastName}"> </td>
	    </tr>
	    <tr>
	    <td>First Name: </td>
	    <td> <input type="TEXT" name="firstName" value="${sessionScope.student.firstName}"> </td>
	    </tr>
	    <tr>
	    <td>Gender</td>
	    <td><input type="radio" name="gender" value="Male" <c:if test="${sessionScope.student.gender == 'Male'}"> checked </c:if> > Male<br>
		<input type="radio" name="gender" value="Female" <c:if test="${sessionScope.student.gender == 'Female'}"> checked </c:if> > Female<br></td>
		</tr>
		<tr>
	    <td>Age: </td>
	    <td> <input type="TEXT" name="age"  value="${sessionScope.student.age}"/> </td>
	    </tr>
		<tr>
	    <td><input type="submit" value="Enter"> </td>
	    </tr>
	    </table>
  </form>
 
</body>
</html>
