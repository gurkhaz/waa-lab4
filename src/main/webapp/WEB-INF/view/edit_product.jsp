<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
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
		<form:form modelAttribute="product" method="post">


			<div class="form" style="margin: auto;">
				<div class="form-group row">
					<form:label path="productId"
						class="offset-sm-2 col-2 col-form-label">Product Id</form:label>

					<div class="col-4">
						<form:input path="productId" class="form-control" type="text" value="${product.productId}"/>
					</div>
				</div>
				<div class="form-group row">
					<form:label path="name" class="offset-sm-2 col-2 col-form-label">Product Name</form:label>

					<div class="col-4">
						<form:input path="name" class="form-control" type="text" value="${product.name}" />
					</div>
				</div>
				<div class="form-group row">

					<form:label path="name" class="offset-sm-2 col-2 col-form-label">Description</form:label>
					<div class="col-4">
						<form:input path="description" class="form-control" type="text" value="${product.description}" />
					</div>
				</div>
				<div class="form-group row">

					<form:label path="name" class="offset-sm-2 col-2 col-form-label">Manufacturer</form:label>
					<div class="col-4">
						<form:input path="manufacturer" class="form-control" type="text" value="${product.manufacturer}" />
					</div>
				</div>
				<div class="form-group row">
					<form:label path="name" class="offset-sm-2 col-2 col-form-label">Price</form:label>
					<div class="col-4">
						<form:input path="unitPrice" class="form-control" type="text" value="${product.unitPrice}" />
					</div>
				</div>
				<div class="form-group row">
					<form:label path="name" class="offset-sm-2 col-2 col-form-label">Category</form:label>
					<div class="col-4">
						<form:input path="category" class="form-control" type="text"  value="${product.category}"/>
					</div>
				</div>
				<div class="form-group row">
					<form:label path="name" class="offset-sm-2 col-2 col-form-label">Quantity</form:label>
					<div class="col-4">
						<form:input path="unitsInStock" class="form-control" type="text"  value="${product.unitsInStock}"/>
					</div>
				</div>



				<div class="form-group row">
					<form:label path="name" class="offset-sm-2 col-2 col-form-label">Condition</form:label>
					<div class="col-4">
						<form:input path="condition" class="form-control" type="text"  value="${product.condition}"/>
					</div>
				</div>

				<div class="form-group row">
					<label for="example-number-input"
						class="offset-sm-2 col-2 col-form-label"></label>
					<div class="col-4">
						<input type="submit" value="Save Product"
							class="btn btn-success btn-block">
					</div>
				</div>
		</form:form>



	</div>
	</div>

</body>
</html>