<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<!-- Head tag stores the title and the relevant libraries that are needed.-->
<head>
<title>Welcome to StuffSpot.</title>
   
<meta name="viewport" content="initial-scale=1, maximum-scale=1">
<link  rel="stylesheet" type = "text/css" href="/Ecommerce/bootstrap/css/bootstrap.min.css" >
<script type="text/javascript" src="/Ecommerce/bootstrap/js/jquery-3.1.0.js"></script>
<script type="text/javascript" src="/Ecommerce/bootstrap/js/bootstrap.min.js"></script>

<!-- Start of style, These classes are for the carousel buttons -->
<style>   
#carouselButtons {
margin-left: 100px;
position: absolute;
bottom: 0px;
}
.carousel-caption {
position: relative;
left: auto;
right: auto;
color: black;
}

.white_text
{
    color: white;
}
.classic_button_next
{ 
    position: absolute; 
    right: 700px; 
    top: 250px; 
    text-align: center;
}

.classic_button_prev 
{ 
    position: absolute;
    right: 500px;
    top: 250px;
    text-align: center;
}

.img {
    display: block;
    margin: auto;
    width: 100%;
}
   

.form
{ 
    position: absolute; 
    right: 500px; 
    top: 350px; 
}


.button_large{
    
    background-color: #000080; /* Green */
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    height:60px;
    width:100px;
}



.error{
    position: absolute; 
    right: 560px; 
    top: 600px; 
  
}




</style>
<!-- End of style -->      
</head>


<body>

<!-- This is the title message in the body that is to be displayed in all pages -->
<div class="jumbotron text-center">
<h1>Welcome to Stuff Spot.</h1>
<p>Your Economy Supermarket at your convenience.<br />
Hello! Dear ${currentUser}.
</p> 
<p color = "blue">${msg}</p>
</div>


<!-- This is the Navigation bar-->
<nav class = "navbar navbar-default" role = "navigation">

<!-- Navigation bar header -->
<div class = "navbar-header">
<button type = "button" class = "navbar-toggle" 
data-toggle = "collapse" data-target = "#example-navbar-collapse">
<span class = "sr-only">Toggle navigation</span>
<span class = "icon-bar"></span>
</button>
<a class = "navbar-brand" href = "/Ecommerce/landing">HOME</a>
</div>
<!-- End of the navigation bar header -->


<!-- Navigation bar body -->
<div class = "collapse navbar-collapse" id = "example-navbar-collapse">

<!-- navbar class to have different elements placed on it. -->	
<ul class = "nav navbar-nav">
  
<!-- A drop down list to have various sub elements in it.  -->       	
<c:if test="${!empty category1}">
<li class = "dropdown">
<a href = "#" class = "dropdown-toggle" data-toggle = "dropdown"> <c:out value="${category1Name}" /> <b class = "caret"></b>   </a>
<ul class = "dropdown-menu">
<c:forEach items="${category1}" var="categoryOne">
<li><a href = "#"><c:out value="${categoryOne}" /></a></li>
</c:forEach>
</ul>
</li>
</c:if>


<!-- A drop down list to have various sub elements in it.  -->       	
<c:if test="${!empty category2}">
<li class = "dropdown">
<a href = "#" class = "dropdown-toggle" data-toggle = "dropdown"> <c:out value="${category2Name}" /> <b class = "caret"></b>   </a>
<ul class = "dropdown-menu">
<c:forEach items="${category2}" var="categoryTwo">
<li><a href = "#"><c:out value="${categoryTwo}" /></a></li>
</c:forEach>
</ul>
</li>
</c:if>
		
<!-- A drop down list to have various sub elements in it.  -->       	
<c:if test="${!empty category3}">
<li class = "dropdown">
<a href = "#" class = "dropdown-toggle" data-toggle = "dropdown"> <c:out value="${category3Name}" /> <b class = "caret"></b>   </a>
<ul class = "dropdown-menu">
<c:forEach items="${category3}" var="categoryThree">
<li><a href = "#"><c:out value="${categoryThree}" /></a></li>
</c:forEach>
</ul>
</li>
</c:if>
			
<!-- A drop down list to have various sub elements in it.  -->       	
<c:if test="${!empty othercategory}">
<li class = "dropdown">
<a href = "#" class = "dropdown-toggle" data-toggle = "dropdown"> OTHER CATEGORIES <b class = "caret"></b>   </a>
<ul class = "dropdown-menu">
<c:forEach items="${othercategory}" var="categoryOther">
<li><a href = "#"><c:out value="${categoryOther}" /></a></li>
</c:forEach>
</ul>
</li>
</c:if>


</ul>
<!-- End of the navbar class lists to be added in the navigation bar-->

<!-- A list to add more buttons in Nav bar depending on some conditions. -->
<ul>
<c:if test="${currentUser == 'Guest'}">
<a class = "navbar-brand pull-right" href = "/Ecommerce/login">Login</a>
<a class = "navbar-brand pull-right" href = "/Ecommerce/signup">Signup</a>
</c:if>
<c:if test="${currentUser != 'Guest'}">
<a class = "navbar-brand pull-right" href = "/Ecommerce/j_spring_security_logout">Logout</a>
</c:if>
<c:if test="${isAdmin == true}">
<a class = "navbar-brand pull-right" href = "/Ecommerce/admin_add_supplier">Admin</a>
</c:if>
</ul>
<!-- End of the list -->

</div>
<!-- End of the navigation bar body -->

</nav>
</body>
</html>