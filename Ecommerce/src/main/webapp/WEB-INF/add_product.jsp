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
	<div class="col-md-11">
		<h2>Add Product Data</h2>
		<form:form method="POST" action="/Ecommerce/admin_save_product"  enctype="multipart/form-data">
		<table>
		<tr> 
			<td><form:label path="id">Product ID:</form:label></td>
			<td><form:input path="id" value="${product.id}" /></td>
		</tr>
		<tr>
			<td><form:label path="name">Product Name:</form:label></td>
			<td><form:input path="name" value="${product.name}" /></td>
		</tr>
		<tr>
			<td><form:label path="supplierid">Product Supplier:</form:label></td>
			<td><form:select  path="supplierid" items="${suppliers}" itemValue="id" itemLabel="name" /></td>
		</tr>
		<tr>
			<td><form:label path="categoryid">Product Category:</form:label></td>
			<td><form:select path="categoryid" items="${categories}" itemValue="id" itemLabel="name" /></td>
		</tr>
		<tr>
			<td><form:label path="description">Product Description:</form:label></td>
			<td><form:input path="description" value="${product.description}" /></td>
		</tr>
		<tr>
			<td><form:label path="mrp">Product MRP:</form:label></td>
			<td><form:input path="mrp" value="${product.mrp}" /></td>
		</tr>
		<tr>
			<td><form:label path="offerprice">Product Offer Price:</form:label></td>
			<td><form:input path="offerprice" value="${product.offerprice}" /></td>
		</tr>
		<tr>
			<td><form:label path="quantity">Product Quantity:</form:label></td>
			<td><form:input path="quantity" value="${product.quantity}" /></td>
		</tr>
		<tr>
		    <td><form:label path="imagepath">Image Upload</form:label></td>
			<td><input name = "productImage" type = "file" id="productImage" path = "imagepath" /></td>
			
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
		<c:if test="${!empty products}">
		<h2>List Products</h2>
		<table align="left" border="1">
		<tr>
    		<th>Product ID</th>
			<th>Product Name</th>
			<th>Product SupplierId</th>
			<th>Product CategoryId</th>
			<th>Product Description</th>
			<th>Product MRP</th>
			<th>Product OfferPrice</th>
			<th>Product Quantity</th>
			<th>Product Image Path</th>
		</tr>
		<c:forEach items="${products}" var="product">
		<tr>
			<td><c:out value="${product.id}" /></td>
			<td><c:out value="${product.name}" /></td>
			<td><c:out value="${product.supplierid}" /></td>
			<td><c:out value="${product.categoryid}" /></td>
			<td><c:out value="${product.description}" /></td>
			<td><c:out value="${product.mrp}" /></td>
			<td><c:out value="${product.offerprice}" /></td>
			<td><c:out value="${product.quantity}" /></td>
			<td><c:out value="${product.imagepath}" /></td>
			<td align="center"><a href="/Ecommerce/admin_edit_product?id=${product.id}">Edit</a>
							 | <a href="/Ecommerce/admin_delete_product?id=${product.id}">Delete</a></td>
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