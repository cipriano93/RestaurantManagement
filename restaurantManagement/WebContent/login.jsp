<%@page import="modelGestioneUtente.UtenteBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%if(session.getAttribute("utenteBean") == null){ %>    
    
<script>
	function verify(errore){
		document.getElementById("ver").innerHTML = errore;
	}	
 	function validateForm(){
   		var username = document.form1.usr;
   		var password = document.form1.pswd; 
   		if(validationUsername(username) && validationPassword(password)){
     		return true;
   		} else {
     		return false;
		}
 	}
 	function validationUsername(username) {
   		var username_format=/^[0-9a-zA-Z]+$/;
   		if (username.value.match(username_format))
   			return true;
   		else {
   			verify("La username può contenere soltanto numeri e lettere");
   			username.focus();
   			return false;
   		}
   	}
 	function validationPassword(password){
   		if(password.value.length >= 5){
     		return true;
   		} else {
    			verify("Inserire correttamente la password");
     		password.focus();
     		return false;
		}
 	}
</script>


    
	
	<link rel="stylesheet" href="css/styles.css">   
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="login-block my_avenir">

<br>
<br>
<br>
    <div class="container">
	<div class="row">

		<div class="col-md-4 login-sec">
		<a href="index.jsp"><img src="img/logoSfondoBianco.jpg"  class="img-responsive" height="100" width="100" ></a>
		    <h2 class="text-center">Login</h2>
		    <form class="login-form" name ="form1" action ="Login" onsubmit = "return validateForm()" method ="POST">
  <div class="form-group">
    <label for="exampleInputEmail1">Username</label>
    <input type="text" class="form-control" style = "color: #B49566" placeholder="" id="usr" name ="usr">
    
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" style = "color: #B49566" placeholder="" id="pwd"  name ="pswd">
  </div>
	  <p class ="red" id="ver"></p>
  
    <button type="submit" class="btn btn-primary float-right">Login</button>

  
	</form>

		</div>
		<div class="col-md-8 banner-sec">
            <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                 <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                  </ol>
            <div class="carousel-inner">
            
    <div class="carousel-item active">
      <img class="d-block w-100" src="img/1.jpg" alt="First slide">
 
    </div>
    
    <div class="carousel-item">
      <img class="d-block img-fluid" src="img/2.jpg" alt="First slide">
    </div>
    
    <div class="carousel-item">
      <img class="d-block w-100" src="img/3.jpeg" alt="First slide">
  </div>
 </div>	  
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a> 
		</div>
	</div>
</div>
</div>
</div>
<%}else{ %>
<% UtenteBean ub = (UtenteBean) session.getAttribute("utenteBean");
	String tipo = ub.getTipo();
	switch(tipo){
		case "cliente":
			response.sendRedirect("index.jsp");
			break;
		case "gestore":
			response.sendRedirect("areaPersonaleGestore.jsp");
			break;
		case "cameriere":
			response.sendRedirect("selezionaTavolo.jsp");
			break;
	}
} %>
