<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file = "header.jsp"  %>

<!DOCTYPE html>
<html>
<body>

<!--  Start of the container which holds all the values -->
<div class="container">


<!--  Start of the row -->
<div class="row">

    
<!--  This div will store the image for the latest deals page -->
<div class="col-sm-4">
	<h3>Get Started</h3>
	<p>Browse More latest Deals</p>
	<div class = "carousel-caption">
	<img src="/Ecommerce/images/offers.png"/>
	<br /><h3>The place for getting the best deals of the season.</h3>
	</div>
</div>
<!--  End of the latest deals div -->


<!--  This div will store the carousel for the home needs category -->
<div class="col-sm-4">
<h3>Home Needs</h3>
<p>Browse More Home Needs</p>

<!-- Start of the carousel -->
<div id="L_HomeNeedsCarousel" class="carousel slide" data-ride="carousel">

<!-- The list of carousel indicators. This stores the number of slides and how the slides are arranged. -->
<ol class="carousel-indicators">
  <li data-target="#L_HomeNeedsCarousel" data-slide-to="0" class="active"></li>
  <li data-target="#L_HomeNeedsCarousel" data-slide-to="1"></li>
  <li data-target="#L_HomeNeedsCarousel" data-slide-to="2"></li>
  <li data-target="#L_HomeNeedsCarousel" data-slide-to="3"></li>
</ol>

<!-- This div stores the details of the inner carousel -->
<div class="carousel-inner" role="listbox">

<!-- 
Details of the item. 
 The details are, 
 1. Item, the details that are stored in the item. 
 2. The caption for the carousel.
-->

<div class="item active">
  <a href = "/Ecommerce/hello">   <img src="images\homeneeds\lights_1_ecobrand.jpg" alt="ecobrand_lights"> </a>
  <div class="carousel-caption">
    <h3>Power Saving Lights</h3>
    <p>These lights save lot of electricity by using LED.<br /><del>&#8377;500</del><br />&#8377;465</p>
  </div>
  <div >
  </div>
</div>

<!-- 
Details of the item. 
 The details are, 
 1. Item, the details that are stored in the item. 
 2. The caption for the carousel.
-->

<div class="item">
  <img src="images\homeneeds\mixie_1.jpg" alt="mixie">
  <div class="carousel-caption">
    <h3>Mixer</h3>
    <p>Mixer of high quality at affordable price..<br /><del>&#8377;950</del><br />&#8377;820</p>
  </div>
</div>

<!-- 
Details of the item. 
 The details are, 
 1. Item, the details that are stored in the item. 
 2. The caption for the carousel.
-->

<div class="item">
  <img src="images\homeneeds\saucer_rajdhan_1.jpg" alt="saucer">
  <div class="carousel-caption">
    <h3>Cup and Saucer set</h3>
    <p>A Cup and Saucer set with decorative designs.<br /><del>&#8377;2100</del><br />&#8377;1900</p>
  </div>
</div>

<!-- 
Details of the item. 
 The details are, 
 1. Item, the details that are stored in the item. 
 2. The caption for the carousel.
-->

  <div class="item">
    <img src="images\homeneeds\mosqBat_1.jpg" alt="mosquitobat">
    <div class="carousel-caption">
      <h3>Mosquito Bat</h3>
      <p>Avoid diseases, eradicate mosquito with this easy to use product.<br /><del>&#8377;300</del><br />&#8377;260</p>
    </div>
  </div>
</div>
<!-- The end of the inner Carousel. -->


<!-- The details of the buttons for left and right. 
1. The type of button that is used. 
2. How the data moves when the button is pressed. 
-->
<a class="left carousel-control" href="#L_HomeNeedsCarousel" role="button" data-slide="prev">
  <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
  <span class="sr-only">Previous</span>
</a>

<a class="right carousel-control" href="#L_HomeNeedsCarousel" role="button" data-slide="next">
  <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
  <span class="sr-only">Next</span>
</a>
</div>
<!--  Above div -- End of the carousel -->
</div>
<!--  Above div -- End of the column in bootstrap home needs category -->
     
     
     
<!--  This div will store the carousel for the Electronics category --> 
<div class="col-sm-4">
<h3>Electronics</h3> 
<p>Browse More Electronics Items</p>

<!-- Start of the carousel -->
<div id="L_ElectronicsCarousel" class="carousel slide" data-ride="carousel">
<!-- The list of carousel indicators. This stores the number of slides and how the slides are arranged. -->
<ol class="carousel-indicators">
  <li data-target="#L_ElectronicsCarousel" data-slide-to="0" class="active"></li>
  <li data-target="#L_ElectronicsCarousel" data-slide-to="1"></li>
  <li data-target="#L_ElectronicsCarousel" data-slide-to="2"></li>
  <li data-target="#L_ElectronicsCarousel" data-slide-to="3"></li>
</ol>

<!-- This div stores the details of the inner carousel -->
<div class="carousel-inner" role="listbox">

<!-- 
Details of the item. 
 The details are, 
 1. Item, the details that are stored in the item. 
 2. The caption for the carousel.
-->

<div class="item active">
  <img src="images\electronics\desktop_1.jpg" alt="ecobrand_lights">
  <div class="carousel-caption">
    <h3>Desktop LP 4WA01</h3>
    <p>Desktop all basic level functionality.<br /><del>&#8377;43500</del><br />&#8377;41000</p>
  </div>
  <div >
  </div>
</div>

<!-- 
Details of the item. 
 The details are, 
 1. Item, the details that are stored in the item. 
 2. The caption for the carousel.
-->

<div class="item">
  <img src="images\electronics\desktop_2.jpg" alt="mixie">
  <div class="carousel-caption">
    <h3>Desktop BELL 7CY81</h3>
    <p>Affordable Desktop for education purposes.<br /><del>&#8377;31950</del><br />&#8377;30820</p>
  </div>
</div>

<!-- 
Details of the item. 
 The details are, 
 1. Item, the details that are stored in the item. 
 2. The caption for the carousel.
-->

<div class="item">
  <img src="images\electronics\laptop_1.jpg" alt="saucer">
  <div class="carousel-caption">
    <h3>Laptop LP PF1000</h3>
    <p>Laptop for Professional Use.<br /><del>&#8377;2100</del><br />&#8377;1900</p>
  </div>
</div>

<!-- 
Details of the item. 
 The details are, 
 1. Item, the details that are stored in the item. 
 2. The caption for the carousel.
-->

<div class="item">
  <img src="images\electronics\mobile_1.jpg" alt="mosquitobat">
  <div class="carousel-caption">
    <h3>Rokia A200</h3>
    <p>A great Camera mobile with great build quality.<br /><del>&#8377;8300</del><br />&#8377;7260</p>
  </div>
</div>

</div>
<!--  Above div -- End of the inner carousel -->

<!-- The details of the buttons for left and right. 
1. The type of button that is used. 
2. How the data moves when the button is pressed. 
-->

  <a class="left carousel-control" href="#L_ElectronicsCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#L_ElectronicsCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<!--  Above div -- End of the carousel -->
</div>
<!--  Above div -- End of the column in bootstrap electronics category -->
</div>
<!-- End of the row -->
 </div>
<!--  End of the container -->
      
</body>
</html>
<%@include file = "footer.jsp"  %>