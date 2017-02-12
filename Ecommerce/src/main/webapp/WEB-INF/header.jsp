<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<title>StuffSpot</title>

<meta name="viewport" content="initial-scale=1, maximum-scale=1">
<link  rel="stylesheet" type = "text/css" href="/Ecommerce/bootstrap/css/bootstrap.min.css" >
<script type="text/javascript" src="/Ecommerce/bootstrap/js/jquery-3.1.0.js"></script>
<script type="text/javascript" src="/Ecommerce/bootstrap/js/bootstrap.min.js"></script>

<style>   
<!-- Custom Styles declared for this page -->
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
}</style>

</head>

<body>
<!-- The starting part of the page inviting user to the website. -->
<div class="jumbotron text-center">
  <h1>Stuff Spot</h1>
  <p>A place for all remote shopping needs</p>
  <p>Your Economy Supermarket at your convenience!!!! <br />  Welcome to our page dear ${user}. </p> 
  <p  style="color:blue">${msg}</p>
</div>


<!-- 
Navigation Bar of the web page. 
1. Tag the product with the database
2. Tag the categories and product

-->

<nav class = "navbar navbar-default" role = "navigation">
<div class = "navbar-header">

<!-- Navigation Bar class for the buttons -->
 <button type = "button" class = "navbar-toggle" data-toggle = "collapse" data-target = "#example-navbar-collapse">
 <span class = "sr-only">Toggle navigation</span>
 <span class = "icon-bar"></span>
 </button>

<!-- Individual buttons in the web page -->

<a class = "navbar-brand" href = "#">LATEST OFFERS</a> 

</div>
<!-- End of the Navigation top bar -->


<!-- Individual buttons in the navigation bar -->
<div class = "collapse navbar-collapse" id = "example-navbar-collapse">
<ul class = "nav navbar-nav">

<!-- Individual buttons in the navigation bar -->
<li class = "dropdown">
<a href = "#" class = "dropdown-toggle" data-toggle = "dropdown"> ELECTRONICS <b class = "caret"></b>   </a>
  <ul class = "dropdown-menu">
  <li><a href = "#">Desktops</a></li>
  <li><a href = "#">Laptops</a></li>
  <li><a href = "#">Mobiles</a></li>
  <li class = "divider"></li>
  <li><a href = "#">Miscellaneous</a></li>
  <li class = "divider"></li>
  <li><a href = "#">Imported ELectronics</a></li>
  </ul>
</li>
		
<li class = "dropdown">
<a href = "#" class = "dropdown-toggle" data-toggle = "dropdown"> HOME NEEDS <b class = "caret"></b>   </a>
  <ul class = "dropdown-menu">
  <li><a href = "#">Kitchen</a></li>
  <li><a href = "#">Furniture</a></li>
  <li><a href = "#">Home Theatre</a></li>
  <li><a href = "#">Tools</a></li>
  </ul>
</li>
		
<li class = "dropdown">
 <a href = "#" class = "dropdown-toggle" data-toggle = "dropdown"> BOOKS <b class = "caret"></b>   </a>
  <ul class = "dropdown-menu">
  <li><a href = "#">Fiction</a></li>
  <li><a href = "#">Romance</a></li>
  <li><a href = "#">Sci-fi</a></li>
  <li><a href = "#">Competetive</a></li>
  <li><a href = "#">School & College</a></li>
  </ul>
</li>
		
</ul>

<ul>
<a class = "navbar-brand pull-right" href = "/Ecommerce/login">Login</a>
<a class = "navbar-brand pull-right" href = "/Ecommerce/signup">Signup</a>
</ul>
     
</div>
</nav>
</body>