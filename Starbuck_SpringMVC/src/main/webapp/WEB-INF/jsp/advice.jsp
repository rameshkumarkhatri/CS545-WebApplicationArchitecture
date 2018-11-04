
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Starbuck's Advice</title>
</head>
<body>
	<h1>Ask for advise about your favorite roast</h1>
	<form action="advice" method="post">
	<select name="roastKey">
		<c:forEach var="name" items="${roasts}">
			<option value="${name.key}" > ${name.value}</option>
		</c:forEach>
	</select>
	<input type="submit" value="Get Advice"/>
	</form>
	<br/>
	<form action="logout"><input type="submit" value="Logout"/></form>
</body>
</html>