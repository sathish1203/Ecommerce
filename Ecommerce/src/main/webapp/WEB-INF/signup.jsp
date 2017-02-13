<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file = "header.jsp"  %>

<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>


<body bgcolor = "#000000">



<div style="text-align:center">
<h2><font color = "black"> Enter your Credentials </font> </h2> 
<hr>
</div>

<div class = "container"> 
<div class = "row"> 
<div class = "col-sm-4"></div> 
<div class = "col-sm-4">


<form:form method="POST" action="/Ecommerce/addUser">
<fieldset>        
<table  cellspacing="5">
<tr>
<td><form:label path="uname">USERNAME</form:label></td>
<td><form:input path="uname" id ="_iusername"/></td>
</tr>

<tr>
<td><form:label path="firstname">FIRSTNAME</form:label></td>
<td><form:input path="firstname" id = "_ifirstname" /></td>
</tr>

<tr>
<td><form:label path="lastname">LASTNAME</form:label></td>
<td><form:input path="lastname" id = "_ilastname" /></td>
</tr>

<tr>
<td><form:label path="middlename">MIDDLENAME</form:label></td>
<td><form:input path="middlename" id = "_imiddlename"/></td>
</tr>

<tr>
<td><form:label path="sex">SEX</form:label></td>
<td><form:input path="sex" id = "_isex"/></td>
</tr>

<tr>
<td><form:label path="personalphone">PHONE</form:label></td>
<td><form:input path="personalphone" id = "_iphone"/></td>
</tr>

<tr>
<td><form:label path="password">PASSWORD</form:label></td>
<td><form:input type ="password" path="password" id = "_ipassword"/></td>
</tr>

<tr>
<td><label><font color = "black">CONFIRM PASSWORD</font></label></td>
<td><input type ="password" name ="_confirm_password" id = "_iconfirm_password"></td>
</tr>
        
<tr>
 <td colspan="2">
 <input type="submit" value="Submit"/>
</td>
</tr>

</table>    
</fieldset>
</form:form>
   
</div>	
<div class = "col-sm-3"></div> 
    
</div>
</div>
          
 <div>            

</div>
</body>
</html>

<%@include file = "footer.jsp"  %>