<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator using MVC</title>
</head>
<body>

<c:if test="${errors != null}">
     
     <p id="errors">
         Error(s)!
        <ul>
	        <c:forEach var="error" items="${errors}">
	            <li>${error}</li>
	        </c:forEach>
	    </ul>
 
     
 </c:if>
 
<form method="post">
		<input type="text" name="add1" size="2"  value="<c:out value="${calculator.add1}"/>" />+ <input
			type="text" name="add2"  value="<c:out value="${calculator.add2}"/>" size="2" />=<input type="text"
			name="sum" value="<c:out value="${calculator.sum}"/>" size="2" readonly />
			
			<br /> 
			
			<input type="text"
			name="mult1" value="<c:out value = "${calculator.mult1}"/>" size="2" />* <input type="text" name="mult2"
			value="<c:out value = "${calculator.mult2}" />" size="2" />=<input type="text" name="product" value="<c:out value = "${calculator.product}"/>"
			size="2" readonly /><br /> <input type="submit" value="Submit" />

	</form>
</body>
</html>