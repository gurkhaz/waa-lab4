<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product list</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<%--  <script src="<c:url value="/resources/js/jquery.1.10.2.min.js" />"></script> --%>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>

	<div class="container">


		<header> </header>
		<caption><a href="customer"
							class="btn btn-success right ">Add Customer</a></caption><br/>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>User Name</th>
					<th>Address</th>
					<th>Date Of Birth</th>
					<th>category</th>
					
					<th>Sex</th>
					<th></th>
				</tr>
			</thead>
			

			<c:forEach items="${customers}" var="customer">
				<tr>
					<div class="boxed">
						<td><a href="getProduct/${customer.userName}">
								${customer.userName} </a></td>
						<td><p>${customer.address}</p></td>
						<td><p>${customer.dateOfBirth}</p></td>
						
						<td><p>${customer.sex}</p></td> 
						
						<td><a href="edit/${customer.userName}"
							class="btn btn-warning ">Edit</a>
							<a href="deleteUser/${customer.userName}"
							class="btn btn-danger ">Delete</a>
					</div>
				</tr>
			</c:forEach>
		</table>

	</div>
</body>
</html>