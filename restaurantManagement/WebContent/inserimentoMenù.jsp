<%@ include file="header.jsp" %>

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
     		verify("Il nome del men� deve contenere soltanto lettere o numeri");
			name.focus();
			return false;
		}
 	}
</script>

<!-- Breadcrumb -->
<nav aria-label="breadcrumb">
 	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="">Home</a></li>
		<li class="breadcrumb-item active" aria-current="page">Inserimento men�</li>
	</ol>
</nav>
<!-- ./Breadcrumb -->

<div class="container">
	<h3 class="dark_brown">Inserisci un men�</h3>
	<hr/>
</div>
	
<!-- Inserimento men� form -->
<div class="container">
	<form name="form" action="" onsubmit="return validateForm()" method="POST">
		<div class="form-group">
	    	<label class ="dark_brown" for="name">Nome:</label>
	      	<input type="text" class="form-control light_brown" id="name" placeholder="Inserisci il nome" name="name">
	      	<span class="red" id="ver"></span>
	    </div>
		<button type="submit" class="btn btn-primary">Crea men�</button>
	</form>
</div>
<br>
<br>
<!-- ./Inserimento men� form -->
	
<%@ include file="footer.jsp" %>