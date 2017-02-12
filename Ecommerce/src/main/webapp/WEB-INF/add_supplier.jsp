<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>

<!-- The head tag. This tag has the normal header and the stylesheets attached to it.-->
<head>
<title>Welcome to StuffSpot!!!!! :)</title>
<meta name="viewport" content="initial-scale=1, maximum-scale=1">
<link rel="stylesheet" type="text/css" 	href="/Ecommerce/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" 	src="/Ecommerce/bootstrap/js/jquery-3.1.0.js"></script>
<script type="text/javascript" 	src="/Ecommerce/bootstrap/js/bootstrap.min.js"></script>
</head>



<!-- The body tag. This tag starts with the welcome message.-->
<body>
<div class="jumbotron text-center">
  <h1>Welcome to Stuff Spot !!!!!!!</h1>
	<p> Your Economy Supermarket at your convenience!!!! <br /> Hi !!!!! ${user} </p>
	<p color="blue">${msg}</p>
</div>


<!-- ****************Start of the navigation bar**********************-->
<nav class="navbar navbar-default" role="navigation">
<div class="navbar-header">
  <button type="button" class="navbar-toggle" data-toggle="collapse"
	data-target="#example-navbar-collapse">
	<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
	<span class="icon-bar"></span> <span class="icon-bar"></span>
  </button>
	<a class="navbar-brand" href="/Ecommerce/landing">HOME</a>
	
</div>

<div class="collapse navbar-collapse" id="example-navbar-collapse">
<ul class="nav navbar-nav">
	<a class="navbar-brand" href="/Ecommerce/admin_add_category">CATEGORY</a>
</ul>
<ul class="nav navbar-nav">
	<a class="navbar-brand" href="/Ecommerce/admin_add_supplier">SUPPLIER</a>
</ul>
<ul class="nav navbar-nav">
	<a class="navbar-brand" href="/Ecommerce/admin_add_product">PRODUCT</a>
</ul>
    
<ul>
	<a class="navbar-brand pull-right" href="/Ecommerce/j_spring_security_logout">Logout</a>
</ul>
</div>
</nav>
<!-- ****************End of the navigation bar**********************-->




<!-- ****************Start of the container**********************-->

<div class="container">
<div class="row">


<!-- ****************Start of the form**********************-->
	<div class="col-md-12">
		<h2>Add Supplier Data</h2>
		<form:form method="POST" action="/Ecommerce/admin_save_supplier">
		<table>
		<tr>
			<td><form:label path="id">Supplier ID:</form:label></td>
			<td><form:input path="id" value="${supplier.id}" /></td>
		</tr>
		<tr>
			<td><form:label path="name">Supplier Name:</form:label></td>
			<td><form:input path="name" value="${supplier.name}" /></td>
		</tr>
		<tr>
			<td><form:label path="description">Supplier Description:</form:label></td>
			<td><form:input path="description" value="${supplier.description}" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Submit" /></td>
		</tr>
		</table>
		</form:form>
     </div>
     <!-- ****************End of the form**********************-->
     
     
</div>
<hr />
<div class="row">


	  <!-- ****************Start of the Table to list**********************-->
	<div class="col-sm-5">
		<c:if test="${!empty suppliers}">
		<h2>List Suppliers</h2>
		<table align="left" border="1">
		<tr>
    		<th>Supplier ID</th>
			<th>Supplier Name</th>
			<th>Supplier Description</th>
		</tr>
		<c:forEach items="${suppliers}" var="supplier">
		<tr>
			<td><c:out value="${supplier.id}" /></td>
			<td><c:out value="${supplier.name}" /></td>
			<td><c:out value="${supplier.description}" /></td>
			<td align="center"><a href="/Ecommerce/admin_edit_supplier?id=${supplier.id}">Edit</a>
							 | <a href="/Ecommerce/admin_delete_supplier?id=${supplier.id}">Delete</a></td>
		</tr>
		</c:forEach>
		</table>
		</c:if>
	</div>
	  <!-- ****************End of the table to list**********************-->
	  
	  
</div>
</div>
  <!-- ****************End of the container**********************-->
<hr />

  <!-- ****************Start of the Navigation Bar**********************-->

<nav class="navbar navbar-default">
<div class="container-fluid">
	<div class="navbar-header">
	<a class="navbar-brand" href="#"></a>
	</div>

	<ul class="nav navbar-nav">
		<li class="active"><a href="/Ecommerce/help">HELP</a></li>
		<li><a href="#">About</a></li>
		<li><a href="#">Contact</a></li>
		<li><a href="#">Policies</a></li>
	</ul>

	<ul>
		<a class="navbar-brand pull-right" href="#">@Copyright</a>
	</ul>
</div>
</nav>

  <!-- ****************End of the Navigation Bar**********************-->


</body>
</html>