<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>EZone</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
 </head>
<script>
function logoutfunction() {
document.getElementById("logout").submit();
}
</script>
<body>
<ul class ="nav navbar-nav navbar-inverse">
<li><a id="E-zone" class ="navbar-brand" href ="http://localhost:8080/E-commerce_frontend/AdminHome/">E-Zone</a></li>
<li><a id ="z" href ="http://localhost:8080/E-commerce_frontend/AdminHome/">Home</a></li>
<li> <a href="${session.getContextPath()}/E-commerce_frontend/AdminHome/manageCategories">category</a></li>
<li> <a href="${session.getContextPath()}/E-commerce_frontend/AdminHome/manageProducts">product</a></li>
<li> <a href="${session.getContextPath()}/E-commerce_frontend/AdminHome/manageSuppliers">supplier</a></li>
<li><a href="http://localhost:8080/E-commerce_frontend/SignIn"><span class="glyphicon glyphicon-log-in"></span>logout</a></li>  
      
</ul>
 <ul class="nav navbar-nav navbar-inverse">
<c:if test="${pageContext.request.userPrincipal.name != null }">
<li><a id="log"href="javascript:logoutfunction()">logout</a></li>
</c:if>
</ul>
</body>
</html>€‹
