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
    <h4>The Member details have been saved.</h4>
    <p>
        <h5>Details:</h5>
        <spring:message code="form.firstName" /> ${member.firstName}<br/>
        <spring:message code="form.laststName" /> ${member.lastName}<br/>
        Age: ${member.age}
    </p>
</div>
</body>
</html>