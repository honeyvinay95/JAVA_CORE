
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<meta charset="utf-8">
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
  <meta name="viewport" content="width=device-width, initial-scale=1">
   <%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <%@page isELIgnored="false" %>
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
<script>
function logoutfunction() {
document.getElementById("logout").submit();
}
</script>
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
      <a class="navbar-brand" href="http://localhost:8080/E-commerce_frontend/">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li><a href="http://localhost:8080/E-commerce_frontend/">Home</a></li>
        <li><a href="Cart"><span class="glyphicon glyphicon-new-window"></span>Cart</a></li>
        <li><a href="contact">contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        
        <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> SignIn</a></li>
        <li><a href="SignUp"><span class="glyphicon glyphicon-new-window"></span> SignUp</a></li>
        <li><a href="http://localhost:8080/E-commerce_frontend/"><span class="glyphicon glyphicon-log-out"></span> logout</a></li>
      
    <c:url value="/perform_logout" var="logout"/>
        <form action="${logout}"  method="post" id="logout">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csfr.token}"/>
       
        </form>​
       </ul>
        <c:if test="${pageContext.request.userPrincipal.name!=null}">
     
         <c:forEach var="prod" items="${listUser}">
               <font size=5 color="black">welcome:<img src = "<c:url value ='/resources/SignIn/${prod.id}.jpg'/>"height="20" width="20" class ="img img-rounded"/>${pageContext.request.userPrincipal.name}</font>
            </c:forEach> 
            <li class="scroll">  <a href="javascript:logoutfunction()">logout</a></li>
                <security:authentication var="user" property="principal.authorities"/>
                <security:authorize var="LoggedIn" access="isAuthenticated()">
                <security:authorize access="hasRole('ROLE_ADMIN')">
               ADMIN
                </security:authorize>
                 <security:authorize access="hasRole('ROLE_USER')">
                USER
                </security:authorize>
                </security:authorize>
                </c:if>
               <c:if test="${pageContext.request.userPrincipal.name==null}">       
                                    
              </c:if>           
      </div>
  </div>
</nav>     
    </div>
    </div>

</body>
</html>