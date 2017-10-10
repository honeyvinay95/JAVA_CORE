<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
.container
{
width:100%;

}
</style>

</head>
<body>
<div class="container">
<div class="row">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="index">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li><a href="index">Home</a></li>
        <li><a href="about">About</a></li>
        <li><a href="contact">Contact</a></li>
       <li class="dropdown">
      <a class="dropdown-toggle" data-toggle="dropdown" href="#">Categories <span class="caret"></span></a>
      <ul class="dropdown-menu">
        <li><a href="#">Women's Clothing & Accessories</a></li>
        <li><a href="#">Men's Clothing & Accessories</a></li>
        <li><a href="#">Cellphones & Computer</a></li>    
                            
      </ul>
    </li>
      
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="SignIn"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        <li><a href="SignUp"><span class="glyphicon glyphicon-bell"></span> SignUp</a></li>
      </ul>
    </div>
    </div>
   </nav>
  </div>
</div>

</body>
</html>