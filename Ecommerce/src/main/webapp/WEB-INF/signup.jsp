<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
     <meta charset="UTF-8">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <link  rel="stylesheet" type = "text/css" href="/Ecommerce/style_property.css" >
     <link  rel="stylesheet" type = "text/css" href="/Ecommerce/bootstrap/css/bootstrap.min.css" >
     <script type="text/javascript" src="/Ecommerce/bootstrap/js/jquery-3.1.0.js"></script>
     <script type="text/javascript" src="/Ecommerce/bootstrap/js/bootstrap.min.js"></script>
     
<style type="text/css">

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
    right: 650px; 
    top: 350px; 
}

.error{
    position: absolute; 
    right: 560px; 
    top: 600px; 
  
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

<body bgcolor = "#000000">

<script>
    
 /*   function _validate_signup(){
     System.out.println("In validate signup");
	   document.getElementById("_ioutput_message").innerHTML = "";      
     var ret_value = false
     var field,pwd,validate;
     var out_text = "";
     var alpha_numeric = /^[a-zA-Z0-9]+$/;
     var alpha = /^[a-zA-Z]+$/;
     var numeric = /^[0-9]+$/;
     
     
     if(!ret_value){
      field = document.getElementById("_iusername").value;
      if(field.toString() == "" || field.toString().length < 6 || !field.match(alpha_numeric))
      {out_text = "Error! Username should have 6 characters and should be alpha numeric."   
       ret_value = true;
      }
     }
        
     if(!ret_value){
       field = document.getElementById("_ifirstname").value;
       if(field.toString() == "" || field.toString().length < 2 || !field.match(alpha))
       {out_text = "Firstname Invalid, has to have atleast 2 characters and should be alphabets only."   
        ret_value = true;
      }
     }
        
        
     if(!ret_value){
       field = document.getElementById("_ilastname").value;
       if(field.toString() == "" || field.toString().length < 2 || !field.match(alpha))
       {out_text = "Lastname Invalid, has to have atleast 2 characters and should be alphabets only."   
        ret_value = true;
      }
     }
        
        
     if(!ret_value){
       field = document.getElementById("_imiddlename").value;
       if(field.toString() == "" || field.toString().length < 2 || !field.match(alpha))
       {out_text = "Middlename Invalid, has to have atleast 2 characters and should be alphabets only."   
        ret_value = true;
      }
     }   
        
     if(!ret_value){
       field = document.getElementById("_iphone").value;
       if(field.toString().length != 10 || !field.match(numeric))
       {out_text = "Phone Invalid, has to have 10 digits only."   
        ret_value = true;
      }
     }   
    
     if(!ret_value){
       field = document.getElementById("_ipassword").value;
       if(field.toString().length < 5 || field.match(numeric) || field.match(alpha)  || !field.match(alpha_numeric) )
       {out_text = "Password Invalid, has to be alpha numeric and size greater than 5."   
        ret_value = true;
      }
     }       
        
     if(!ret_value){
       field = document.getElementById("_iconfirm_password").value;
       var match_field = document.getElementById("_ipassword").value;
      if (!(field === match_field))
       {
           out_text = "Passwords do not match."   
        ret_value = true;
         }
        }       
        
        
      if (!ret_value)
      {
      
       alert("Successfully Registered!");      
       window.location = "/Ecommerce/addUser";
            
            // Do the successful validation of form.
          
      }
      else{
           alert(out_text);      
           document.getElementById("_ioutput_message").innerHTML = out_text;      
        }
   }    
 */   
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
            <h2><font color = "black"> Enter your Credentials </font> </h2> 
        <hr>
    </div>
    
    <div class = "container"> 
    <div class = "row"> 
    <div class = "col-sm-3"></div> 
    <div class = "col-sm-3">
   
   
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
                <td><form:input path="password" id = "_ipassword"/></td>
            </tr>
            
            <tr>
            <td><font color = "black">CONFIRM PASSWORD</font></td>
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
</div>
    </body>
</html>
