<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file = "header_admin.jsp"  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<!-- ****************Start of the container**********************-->
<div class="container">
<div class="row">

<!-- ****************Start of the form**********************-->
<div class="col-md-12">
<h2>Add Category Data</h2>
<form:form method="POST" action="/Ecommerce/admin_save_category">
<table>
<tr>
<td><form:label path="id">Category ID:</form:label></td>
<td><form:input path="id" value="${category.id}" /></td>
</tr>
<tr>
<td><form:label path="name">Category Name:</form:label></td>
<td><form:input path="name" value="${category.name}" /></td>
</tr>
<tr>
<td><form:label path="subcategory">Sub-category Name:</form:label></td>
<td><form:input path="subcategory" value="${category.subcategory}" /></td>
</tr>
<tr>
<td><form:label path="description">Category Description:</form:label></td>
<td><form:input path="description" value="${category.description}" /></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Submit" /></td>
</tr>
</table>
</form:form>
</div>
<!-- ****************End of the form**********************-->

</div>

<!-- The List of all categories that are to be displayed -->
<hr />
<div class="row">
<!-- ****************Start of the Table to list**********************-->
<div class="col-sm-5">
<c:if test="${!empty categories}">
<h2>List Categories</h2>
<table align="left" border="1">

<tr>
<th>Category ID</th>
<th>Category Name</th>
<th>Sub-Category Description</th>
<th>Category Description</th>
</tr>

<c:forEach items="${categories}" var="category">
<tr>
<td><c:out value="${category.id}" /></td>
<td><c:out value="${category.name}" /></td>
<td><c:out value="${category.subcategory}" /></td>
<td><c:out value="${category.description}" /></td>
<td align="center"><a href="/Ecommerce/admin_edit_category?id=${category.id}">Edit</a>
|<a href="/Ecommerce/admin_delete_category?id=${category.id}">Delete</a></td>
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

</body>
</html>
<%@include file = "footer.jsp"  %>