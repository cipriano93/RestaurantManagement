<%@ page import="modelGestioneUtente.UtenteBean" %>

<%@ include file="header.jsp" %>	
	 <!-- Validation -->
	 <script>
  	  function verify(errore){
  	  		document.getElementById("ver").innerHTML = errore;
  	  }
  	  
      function validateForm(){
        var name = document.form.name;
        var surname = document.form.surname;
        var password = document.form.pwd; 
        var passwordConfirm = document.form.pwd_confirm; 
        
        if (validationName(name) && validationSurname(surname) && validationPassword(password) && validationConfirmPassword(passwordConfirm, password)){
          	return true;
        } else {
         	return false;
        }
      }
      
      function validationName(name){
  	  	var nameformat = /^[A-Z a-z]{3,}$/;
    	if (name.value.match(nameformat)){
      		return true;
      	} else {
      		verify("Inserire correttamente il nome");
         	name.focus();
         	return false;
      	}
	  }
      
   	  function validationSurname(surname){
	  	var surnameformat = /^[A-Za-z]{3,}$/;
 	 	if (surname.value.match(surnameformat)){
    			return true;
   	 	} else {
    		verify("Inserire correttamente il cognome");
      	 	surname.focus();
       		return false;
    	}
	  }

      function validationPassword(password){
    	var passwordformat = /^[A-Za-z0-9]{5,}$/;
        if (password.value.match(passwordformat)){
      	  	return true;
        } else {
	    	verify("Inserire correttamente la password");
         	password.focus();
         	return false;
        }
      }
      
      function validationConfirmPassword(confirmPassword, password){
        if (confirmPassword.value == password.value){
      	  	return true;
        } else {
        	verify("Le due password devono coincidere");
         	confirmPassword.focus();
         	return false;
        }
      }
     
    </script>
	<!-- ./Validation -->
	
	<!-- Breadcrumb -->
	<nav aria-label="breadcrumb">
 		<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="">Home</a></li>
			<li class="breadcrumb-item"><a href="areaPersonaleCliente.jsp">Area personale</a></li>
			<li class="breadcrumb-item active" aria-current="page">Modifica dati personali</li>
		</ol>
	</nav>
	<!-- ./Breadcrumb -->
	
	<!-- Modifica dati personali form -->
	<div class="container my_avenir">
	
		<%
			Boolean message = (Boolean) request.getAttribute("message");
			if (message != null) {
		%>
				<div class="alert alert-danger">
					<strong>Errore!</strong> Impossibile modificare i dati.
				</div>
		 <% } %>
	
		<div class="row">
		<div class="col-md-12">		
			<h3 class ="dark_brown" style="font-family: satisfy">Modifica i tuoi dati</h3>
			<hr/>
			<br>
		<form  name="form" action="ModificaDatiPersonali" method="POST" onsubmit="return validateForm()">
				<!-- Username -->
				<div class="row">
			    		<label class="col-sm-2 control-label dark_brown">Username</label>
			    		<div class="col-sm-3">
			    			<input class="form-control light_brown" type="text" value="<%=ub.getUsername()%>" disabled>
			    			<input type="hidden" value="" name="username">
			   	 	</div>
			    		<div class="col-sm-7"></div>
			  	</div>
				<!-- ./Username -->
				<br>
				<!-- Password -->
				<div class="row">
			    		<label class="col-sm-2 control-label dark_brown">Nuova password</label>
			    		<div class="col-sm-3">
			      		<input type="password" class="form-control light_brown" name="pwd">
			    		</div>
			  	  	<label class="col-sm-2 control-label dark_brown">Conferma la password</label>
			  	  	<div class="col-sm-3">
			      		<input type="password" class="form-control light_brown" name="pwd_confirm">
			   	 	</div>
			    		<div class="col-sm-2"></div>
			  	</div>
				<!-- ./Password -->
				<br>
				<!-- Nome and cognome -->
				<div class="row">
			   	 	<label class="col-sm-2 control-label dark_brown">Nome</label>
			   	 	<div class="col-sm-3">
			      		<input type="text" class="form-control light_brown" name="name">
			    		</div>
			    		<label class="col-sm-2 control-label dark_brown">Cognome</label>
			   	 	<div class="col-sm-3">
			      		<input type="text" class="form-control light_brown" name="surname">
			    		</div>
			    		<div class="col-sm-2"></div>
			  	</div>
				<!-- ./Nome and cognome -->
						<br>
				<button type="submit" class="btn btn-success">Modifica</button>
			</form>
				<p id="ver" class ="red" ></p> 
				</div>
				</div>
				</div>
	
<%@ include file="footer.jsp" %>