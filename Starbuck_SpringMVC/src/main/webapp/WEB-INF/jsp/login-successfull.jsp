<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Login Starbucks 3 MVC</title>
</head>
<body>
<h1>Login Successful Mr. ${user.userName} </h1>
<form action="advice"  method="GET">
<input type="submit" value="Get Advice"></input>
</form>

<br/>
	<form action="logout"><input type="submit" value="Logout"/></form>
</body>
</html>