<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Starbuck's Result</title>
</head>
<body>
	<h3>Starbuck's ${fn:toUpperCase(roast)} Roast Coffees:</h3>
	<table>
		<c:set var="color" value="cyan"/>
		<c:forEach var="name" items="${result}">
			<tr style="background-color:${color}">
				<td >${name}</td>
			</tr>
			<c:choose>
			<c:when test="${color eq 'cyan'}">
			<c:set var="color" value="yellow"/>
			</c:when>
			<c:when test="${color eq 'yellow'}"> <c:set var="color" value="cyan"/></c:when>
			</c:choose>
		</c:forEach>
	</table>
	
	<form action="showAdvice.do" method="get">
	<input type="submit" value="back"/></form>
</body>
</html>