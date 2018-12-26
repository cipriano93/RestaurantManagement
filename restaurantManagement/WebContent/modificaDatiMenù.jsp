<%@ include file="heading.jsp" %>

<script>
	function verifica(errore){
		document.getElementById("ver").innerHTML = errore;
	}
	
 	function validateForm(){
   		var name = document.form.name;
   		if(validationName(name)){
     		return true;
   		} else {
     		return false;
		}
 	}
 	
 	function validationName(name) {
   		var nameformat = /^[a-zA-Z0-9 ]+$/;
   		if(name.value.match(nameformat)){
     		return true;
   		} else {
     		verifica("Il nome del menù deve contenere soltanto lettere o numeri");
			name.focus();
			return false; 
		}
 	}
</script>

<!-- Breadcrumb -->
<nav aria-label="breadcrumb">
 	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="">Home</a></li>
		<li class="breadcrumb-item active" aria-current="page">Modifica dati menù</li>
	</ol>
</nav>
<!-- ./Breadcrumb -->

<div class="container">
	<h3 class="dark_brown">Modifica dati menù</h3>
	<hr/>
</div>
	
<!-- Modifica dati menù form -->
<div class="container">
	<form name="form" action="" onsubmit="return validateForm()" method="POST">
		<div class="form-group">
	    	<label class ="dark_brown" for="name">Nome:</label>
	      	<input type="text" class="form-control light_brown" id="name" placeholder="Inserisci il nome" name="name">
	      	<span class="red" id="ver"></span>
	    </div>
		<button type="submit" class="btn btn-primary">Modifica menù</button>
	</form>
</div>
<br>
<br>
<!-- ./Modifica dati menù form -->
	
<%@ include file="footer.jsp" %>