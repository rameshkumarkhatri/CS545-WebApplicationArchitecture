<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="calculator.do" method="post">
		<input type="text" name="add1" size="2"  value="<c:out value="${add1}"/>" />+ <input
			type="text" name="add2"  value="<c:out value="${add2}"/>" size="2" />=<input type="text"
			name="sum" value="<c:out value="${sum}"/>" size="2" readonly />
			
			<br /> 
			
			<input type="text"
			name="mult1" value="<c:out value = "${mult1}"/>" size="2" />* <input type="text" name="mult2"
			value="<c:out value = "${mult2}" />" size="2" />=<input type="text" name="product" value="<c:out value = "${product}"/>"
			size="2" readonly /><br /> <input type="submit" value="Submit" />

	</form>
</body>
</html>