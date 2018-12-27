<%@ include file="header.jsp" %>

<script>
	function verifica(errore){
		document.getElementById("ver").innerHTML = errore;
	}	
 	function validateForm(){
   		var email = document.form1.email;
   		var password = document.form1.pswd; 
   		if(validationEmail(email) && validationPassword(password)){
     		return true;
   		} else {
     		return false;
		}
 	}
 	function validationEmail(umail) {
   		var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w+)+$/;
   		if(umail.value.match(mailformat)){
     		return true;
   		} else {
     		verifica("Inserire correttamente l'email");
			umail.focus();
			return false;
		}
 	}
 	function validationPassword(password){
   		if(password.value.length >= 5){
     		return true;
   		} else {
    			verifica("Inserire correttamente la password");
     		password.focus();
     		return false;
		}
 	}
</script>

<!-- Breadcrumb -->
<nav aria-label="breadcrumb">
 	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="">Home</a></li>
		<li class="breadcrumb-item active" aria-current="page">Login</li>
	</ol>
</nav>
<!-- ./Breadcrumb -->

<div class="container">
	<h3 class="dark_brown">Accedi all'area personale</h3>
	<hr />
</div>
	
<!-- Login form -->
<div class="container">
	   		<form name ="form1" action ="Login" onsubmit = "return validateForm()" method ="POST">
	    			<div class="form-group">
	      			<label class ="dark_brown" for="email">Email:</label>
	      			<input type="text" class="form-control light_brown" id="email" placeholder="Inserisci l'email" name ="email">
	    			</div>
	   			<div class="form-group">
	      			<label class ="dark_brown" for="pwd">Password:</label>
	      			<input type="password" class="form-control light_brown" id="pwd" placeholder="Inserisci la password" name ="pswd">
	   			</div>
				<button type="submit" class="btn btn-primary">Accedi</button>
			</form> 		
	<p class ="red" id="ver"></p>
</div>
<br>
<br>
<!-- ./Login form -->
	
<%@ include file="footer.jsp" %>