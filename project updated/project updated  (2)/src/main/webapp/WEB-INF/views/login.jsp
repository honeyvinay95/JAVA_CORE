<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <jsp:include page="header.jsp"></jsp:include>
<style>
body 
{
    background-image: url("");
    }
    .sign
    {
    color:blue;
    }
    </style>
</head>

<body>
<header class="page-header">
<h1>
<center style="padding:20px"><span class="sign">Sign In Page</span></center>
</h1>
</header>

<div class="container col-lg-offset-4">

<form:form  action="perform_login" method="POST" commandName="validate" >

<div class="form-group col-xs-5">
<div class="form-group">
<input type="username" class="form-control" id="name" placeholder="username" required>
<input type="password" class="form-control" id="pass" placeholder="password" required>

<div class="col-sm-10 ">
<div class="checkbox col-lg-offset-4">
<h4>
<label>
<input type="checkbox"style="padding:20px"><span class="sign"> Remember me</span>
</label>
</h4>
</div>
<div class="col-sm-10 col-lg-offset-2">
<button type="submit" class="btn btn-primary"href="http://localhost:8080/E-commerce_frontend/index">Submit</button>
</div>
</div>
</div>
</div>
</form:form>
 </div>
</body>
</html>
