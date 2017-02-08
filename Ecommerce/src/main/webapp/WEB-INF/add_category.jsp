<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Spring MVC Form Handling</title>
 </head>
 <body>
  <h2>Add Employee Data</h2>
  <form:form method="POST" action="/sdnext/save.html">
      <table>
       <tr>
           <td><form:label path="id">Category ID:</form:label></td>
           <td><form:input path="id" value="${category.id}" readonly="true"/></td>
       </tr>
       <tr>
           <td><form:label path="name">Category Name:</form:label></td>
           <td><form:input path="name" value="${category.name}"/></td>
       </tr>
       <tr>
           <td><form:label path="age">Category Description:</form:label></td>
           <td><form:input path="age" value="${category.description}"/></td>
       </tr>
        <tr>
         <td colspan="2"><input type="submit" value="Submit"/></td>
        </tr>
   </table> 
  </form:form>
  
  <c:if test="${!empty categories}">
  <h2>List Categories</h2>
 <table align="left" border="1">
  <tr>
   <th>Category ID</th>
   <th>Category Name</th>
   <th>Category Description</th>
  </tr>

  <c:forEach items="${categories}" var="category">
   <tr>
    <td><c:out value="${category.id}"/></td>
    <td><c:out value="${category.name}"/></td>
    <td><c:out value="${category.description}"/></td>
    <td align="center"><a href="edit.html?id=${category.id}">Edit</a> | <a href="delete.html?id=${category.id}">Delete</a></td>
   </tr>
  </c:forEach>
 </table>
</c:if>
 </body>
</html>