<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Control Number Check</title>
</head>
<body>
	<c:choose>
	<c:when test="${num1 < control }">
	<p style="color: pink; font-weight: bold">First number is less than “control” number</p>
	</c:when>
	
	<c:when test="${num2 > control }">
	<p style="color: blue; font-weight: bold">Second Number is greater than “control” number 
	</c:when>
	
	<c:when test="${num3 == control }">
	<p style="color: cyan; font-weight: bold">Third Number is equal to the “control” number</p>
	</c:when>
	
	<c:otherwise>
	<p style="color: cyan; font-weight: bold">T Control Number: ${control}</p>
	<p style="color: gray; font-weight: bold">T First Number: ${num1}</p>
	<p style="color: blue; font-weight: bold">TSecond Number: ${num2}</p>
	<p style="color: aqua; font-weight: bold">TThird Number: ${num3}</p>
	</c:otherwise>
	</c:choose>
	<%-- <p style="color: cyan; font-weight: bold">T Control Number: ${control}</p>
	<p style="color: gray; font-weight: bold">T First Number: ${num1}</p>
	<p style="color: blue; font-weight: bold">TSecond Number: ${num2}</p>
	<p style="color: aqua; font-weight: bold">TThird Number: ${num3}</p> --%>
</body>
</html>