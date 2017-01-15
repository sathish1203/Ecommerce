<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
     <link  rel="stylesheet" type = "text/css" href="/Ecommerce/style_property.css" >
      <link  rel="stylesheet" type = "text/css" href="/Ecommerce/bootstrap/css/bootstrap.min.css" >
     <script type="text/javascript" src="/Ecommerce/bootstrap/js/jquery-3.1.0.js"></script>
     <script type="text/javascript" src="/Ecommerce/bootstrap/js/bootstrap.min.js"></script>
<style type="text/css">
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


</style>
   
   
</head>

<body class = "header"  bgcolor = "#000000" >
  
<script>
    
   function validate_login(){
     var uname,pwd,validate;
     var out_text = "";
     document.getElementById("_ivalidate").innerHTML = "";
     uname = document.getElementById("_iusername").value;
     pwd = document.getElementById("_ipassword").value;  
     var letterNumber = /^[a-zA-Z]+$/;
     if(uname.match(letterNumber) && pwd.match(letterNumber)){
       out_text = out_text + "Username and Password is valid";
       validate = true;
        } 
    else{
        out_text = out_text + "Invalid data data has to be alpha numeric only, Please Enter again!!";
        validate = false;
        }
       alert(out_text);
     if(validate){
       window.location="/Ecommerce/logged";
     }
    }    
   
    </script>
    
    <div class="jumbotron text-center">
  <h1>Welcome to Stuff Spot !!!!!!! </h1>
  <p>Your Economy Supermarket at your convenience!!!!</p> 
</div>
    
    <nav class = "navbar navbar-default" role = "navigation">
   
   <div class = "navbar-header">
      <button type = "button" class = "navbar-toggle" 
         data-toggle = "collapse" data-target = "#example-navbar-collapse">
         <span class = "sr-only">Toggle navigation</span>
         <span class = "icon-bar"></span>
         <span class = "icon-bar"></span>
         <span class = "icon-bar"></span>
      </button>
		
      <a class = "navbar-brand" href = "/Ecommerce/landing">LATEST OFFERS</a>
   </div>
   
   <div class = "collapse navbar-collapse" id = "example-navbar-collapse">
	
      <ul class = "nav navbar-nav">
         	
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
    
    <div style="text-align:center">
            <h2><font color = "black"> Enter the Login Credentials </font> </h1> 
            <h2><font color = "black"> Enter your Username and Password. </font> </h2> 
       <font color = "red"> ${msg} </font>
       
       <hr>
   </div>
    
    
    <div class = "container">
    <div class = "row">
    <div class = "col-sm-3"></div>
    <div class = "col-sm-3">
    <div> 
       
        <form:form method="POST" action="/Ecommerce/validateLogin">
        <fieldset>
            <table cellpadding = "10">
            <tr><th></th></tr>
            <tr>
              <td><form:label path="uname">username</form:label></td>
              <td><form:input path="uname" /></td>
           </tr>
            <tr>
              <td><form:label path="password">password</form:label></td>
              <td><form:input path="password" /></td>
            </tr>
            <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
        </table>    
           <p class = "white_text" id = "_ivalidate"></p>
        </fieldset>
        </form:form>
</div>
</div>
</div>
</div>









     <nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#"></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">HELP</a></li>
      <li><a href="#">About</a></li>
      <li><a href="#">Contact</a></li>
      <li><a href="#">Policies</a></li>
    </ul>
    <ul><a class = "navbar-brand pull-right" href="#">@Copyright</a></ul>
  </div>
</nav>
    
    
    </body>
</html>
