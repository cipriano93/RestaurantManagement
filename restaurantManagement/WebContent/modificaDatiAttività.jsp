<%@ include file="header.jsp" %>

<script>
	function verifica(errore){
		document.getElementById("ver").innerHTML = errore;
	}	
	
 	function validateForm(){
   		var name = document.form.name;
   		var address = document.form.address; 
   		var p_iva = document.form.iva;
   		var tel = document.form.tel;
   		if(validationName(name) && validationAddress(address) && validationPartitaIVA(p_iva) && validationTel(tel)){
     		return true;
   		} else {
     		return false;
		}
 	}
 	
 	function validationName(name) {
   		var nameformat = /^[a-zA-Z ]+$/;
   		if(name.value.match(nameformat)){
     		return true;
   		} else {
     		verify("Inserire correttamente il nome");
			name.focus();
			return false;
		}
 	}
 	
 	function validationAddress(address) {
 		var addressformat = /^[a-zA-Z ]+,[0-9]{2}$/;
   		if(address.value.match(addressformat)){
     		return true;
   		} else {
    		verify("Inserire correttamente l'indirizzo");
     		address.focus();
     		return false;
		}
 	}
 	
 	function validationPartitaIVA(p_iva) {
 		var p_iva_format = /^[0-9]{11}$/;
   		if(p_iva.value.match(p_iva_format)) {
     		return true;
   		} else {
    		verify("Inserire correttamente la partita iva");
     		iva.focus();
     		return false;
		}
 	}
 	
 	function validationTel(tel) {
 		var telformat = /^[0-9]{9}$/;
   		if(tel.value.match(telformat)) {
     		return true;
   		} else {
    		verify("Inserire correttamente il telefono");
     		tel.focus();
     		return false;
		}
 	}
</script>

<!-- Breadcrumb -->
<nav aria-label="breadcrumb">
 	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="">Home</a></li>
		<li class="breadcrumb-item"><a href="areaPersonaleGestore.jsp">Area personale</a></li>
		<li class="breadcrumb-item active" aria-current="page">Modifica dati attività</li>
	</ol>
</nav>
<!-- ./Breadcrumb -->

<div class="container">
	<h3 class="dark_brown">Modifica dati attività</h3>
	<hr />
</div>
	
<!-- Modifica dati attività form -->
<div class="container">
	<form name="form" action="" onsubmit="return validateForm()" method="POST">
		<div class="form-group">
			<label class="dark_brown" for="name">Nome:</label>
		    <input type="text" class="form-control light_brown" id="name" placeholder="Inserisci il nome" name="name">
		      <span class="red" id="ver"></span>
	    </div>
	   	<div class="form-group">
	   		<label class="dark_brown" for="address">Address:</label>
	      	<input type="text" class="form-control light_brown" id="address" placeholder="Inserisci l'indirizzo" name="address">
	      	<span class="red" id="ver"></span>
	   	</div>
	   	<!-- Provincia e città? -->
	   	<div class="form-group">
	   		<label class="dark_brown" for="tel">Telefono:</label>
	      	<input type="tel" class="form-control light_brown" id="tel" placeholder="Inserisci il numero di telefono" name="tel">
	      	<span class="red" id="ver"></span>
	   	</div>
		<button type="submit" class="btn btn-primary">Modifica dati attività</button>
	</form> 		
</div>
<br>
<br>
<!-- ./Modifica dati attività form -->
	
<%@ include file="footer.jsp" %>