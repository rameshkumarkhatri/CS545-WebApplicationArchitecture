<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML>
<html>
<head>
<title>Save Employee</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>">
</head>
<body>
<div id="global">
    <h4><spring:message code="employeeSavedText" /></h4>
    <p>
        <h5>Details:</h5>
        <spring:message code="form.firstName" />: ${employee.firstName}<br/>
        <spring:message code="form.lastName" />: ${employee.lastName}<br/>
        <spring:message code="form.dateOfBirth" />: ${employee.birthDate}
    </p>
</div>
</body>
</html>