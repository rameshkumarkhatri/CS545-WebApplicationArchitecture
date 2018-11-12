<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE HTML>
<html>
<head>
<%-- <title><spring:message code="title.addEmployeeForm" /></title> --%>

<title>Add Employee Form</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>">
</head>
<body>
<section>
		<div class="pull-right" style="padding-right:50px">
			<a href="?language=en">English</a>|<a href="?language=fr">French</a>
		</div>
	</section>
	<div id="global">
		<form:form commandName="employee" action="employee_save" method="post">
			<fieldset>
				<legend><spring:message code="addAnEmployee" text="Add"/></legend>
				<p>
					<form:errors path="*" cssStyle="color : red;" />
				</p>
				<p>
					<label for="id"><spring:message code="form.id" /></label>
					<form:input path="id" id="id" />
					<div style="text-align: center;">
						<form:errors path="id" cssStyle="color : red;" />
					</div>
				</p>
				<p>
					<label for="firstName"><spring:message code="form.firstName" /> </label>
					<form:input path="firstName" />
					<div style="text-align: center;">
						<form:errors path="firstName" cssStyle="color : red;" />
					</div>
				</p>
				<p>
					<label for="lastName"><spring:message code="form.lastName" /> </label>
					<form:input path="lastName" />
					<div style="text-align: center;">
						<form:errors path="lastName" cssStyle="color : red;" />
					</div>
				</p>

				<p>
					<label for="birthDate"><spring:message code="form.dateOfBirth" /></label>
					<form:input path="birthDate" id="birthDate" />
					<form:errors path="birthDate" cssStyle="color : red;" />
				</p>
				<p>
					<label for="salaryLevel"><spring:message code="form.salary"/> </label>
					<form:input path="salaryLevel" id="salaryLevel" />
					<div style="text-align: center;">
						<form:errors path="salaryLevel" cssStyle="color : red;" />
					</div>
				</p>
				<h4><spring:message code="form.address"/></h4>
				<p>
					<label for="street"><spring:message code="form.street" /></label>
					<form:input path="address.street" id="street" />
					<div style="text-align: center;">
						<form:errors path="address.street" cssStyle="color : red;" />
					</div>
				</p>
				<p>
					<label for="state"><spring:message code="form.state" /></label>
					<form:input path="address.state" id="state" />
					<div style="text-align: center;">
						<form:errors path="address.state" cssStyle="color : red; " />
					</div>
				</p>
				<p>
					<label for="zipCode"><spring:message code="form.zip" /> </label>
					<form:input path="address.zipCode" id="zipCode" />
					<div style="text-align: center;">
						<form:errors path="address.zipCode" cssStyle="color : red; " />
					</div>
				</p>
				<p>
					<label for="image"><spring:message code="form.image" /> </label>
					<form:input path="image" id="image" type="file"/>
					<div style="text-align: center;">
						<form:errors path="image" cssStyle="color : red; " />
					</div>
				</p>
				<p id="buttons">
					<input id="reset" type="reset" tabindex="4" value="<spring:message code="reset"/>"/> 
					<input id="submit" type="submit" tabindex="5" value="<spring:message code="form.addEmployee" />">
				</p>
			</fieldset>
		</form:form>
	</div>
</body>
</html>
