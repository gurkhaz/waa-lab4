<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<%--  <script src="<c:url value="/resources/js/jquery.1.4.2.min.js" />"></script> --%>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
	<div class="container">


		<header> </header>
		<!-- <h3>Add Product</h3> -->
		<form:form modelAttribute="customer" method="post">
		<div class="row">
			<div class="col-2">
				<a class="btn btn-success" href="?locale=en"> English Language</a>
			</div>
			<div class="col-2">
				<a class="btn btn-success" href="?locale=es"> Spanish Language</a>
			</div>
			</div>
			<br/>
			<br/>

			<div class="form" style="margin: auto;">
				<div class="form-group row">
					<form:label path="userName"
						class="offset-sm-2 col-2 col-form-label">
						<spring:message code="addCustomer.form.userName.label" />
					</form:label>

					<div class="col-4">
						<form:input path="userName" class="form-control" type="text" />
					</div>
					<form:errors path="userName" cssStyle="color: red" />
				</div>
				<div class="form-group row">
					<form:label path="address" class="offset-sm-2 col-2 col-form-label"><spring:message code="addCustomer.form.address.label" /></form:label>

					<div class="col-4">
						<form:input path="address" class="form-control" type="text" />
					</div>
				</div>
				<div class="form-group row">

					<form:label path="dateOfBirth"
						class="offset-sm-2 col-2 col-form-label"><spring:message code="addCustomer.form.dateOfBirth.label" /></form:label>
					<div class="col-4">
						<form:input path="dateOfBirth" class="form-control" type="text" />
						
					</div>
					<form:errors path="dateOfBirth" cssStyle="color: red" />
				</div>
				<div class="form-group row">

					<form:label path="password"
						class="offset-sm-2 col-2 col-form-label"><spring:message code="addCustomer.form.password.label" /></form:label>
					<div class="col-4">
						<form:input path="password" class="form-control" type="password" />
					</div>
					<form:errors path="password" cssStyle="color: red" />
				</div>
				<div class="form-group row">
					<form:label path="sex" class="offset-sm-2 col-2 col-form-label"><spring:message code="addCustomer.form.sex.label" /></form:label>
					<div class="col-4">
						<form:input path="sex" class="form-control" type="text" />
					</div>
				</div>

				<div class="form-group row">
					<label for="example-number-input"
						class="offset-sm-2 col-2 col-form-label"></label>
					<div class="col-4">
						<input type="submit" value="Add Customer"
							class="btn btn-success btn-block">
					</div>
				</div>
			</div>
		</form:form>




	</div>

</body>
</html>