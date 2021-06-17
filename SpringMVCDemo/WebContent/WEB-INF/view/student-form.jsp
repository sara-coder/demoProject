<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student registration form</title>
</head>
<body>
<form:form action ="processForm" modelAttribute="student">
First name : <form:input path="fname"/>
<BR>
Last  name : <form:input path="lname"/>
<BR>
Country : <form:select path="country">
<form:options items="${student.countryList}"/>
</form:select>
<BR>

<BR>

<BR>
<input type="submit"/>
</form:form>
</body>
</html>