<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>New Student Information</title>
</head>
<body>

<h1>Please review the information you entered</h1>

  <form name="editOrSubmitStudDataForm" action="./editOrStoreStudentProfile" method="POST">
  <table>
  <tr>
  	<td>Last Name:</td> 
    <td> ${sessionScope.student.lastName} </td>
    </tr>
    <tr>
    <td>First Name: </td>
    <td> ${sessionScope.student.firstName}</td>
    </tr>
    <tr>
    <td>Gender:</td>
    <td>${sessionScope.student.gender}</td>
	</tr>
	<tr>
    <td>Age:</td>
    <td>${sessionScope.student.age}</td>
	</tr>
	<tr>
    <td><input type="submit" name="editProfile" value="Edit"> </td>
    <td><input type="submit" name="createProfile" value="Create Profile"> </td>
    </tr>
    </table>
  </form>
 
</body>
</html>
