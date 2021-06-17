<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<h1>Teacher Registration Form</h1>
<form:form action="showDetails" modelAttribute ="teacher">
First Name :<form:input path = "fname"></form:input>
Last Name :<form:input path = "lname"></form:input>
<input type="submit" value= "Submit" />
</form:form>
</body>
</html>