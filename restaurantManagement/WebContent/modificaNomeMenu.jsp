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
     		verify("Il nome del menù deve contenere soltanto lettere o numeri");
			name.focus();
			return false; 
		}
 	}
</script>

<!-- Breadcrumb -->
<nav aria-label="breadcrumb">
 	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="">Home</a></li>
		<li class="breadcrumb-item"><a href="areaPersonaleGestore.jsp">Area personale</a></li>
		<li class="breadcrumb-item"><a href="gestioneMenu.jsp">Gestione menù</a></li>
		<li class="breadcrumb-item"><a href="gestionePortata.jsp">Gestione portata</a></li>
		<li class="breadcrumb-item active" aria-current="page">Modifica nome menù</li>
	</ol>
</nav>
<!-- ./Breadcrumb -->

<div class="container">
	<h3 class="dark_brown">Modifica nome menù</h3>
	<hr/>
</div>

<div class="container" align="center">
	<%
		String message = (String) request.getAttribute("message");
		if (message != null) { 
	%>
			<div class="alert alert-warning">
	  			<strong>Attenzione!</strong> <%= message %>
			</div>
	<%	}	%>
</div>
	
<!-- Modifica nome menù form -->
<div class="container">
	<form name="form" action="modificanomemenu" onsubmit="return validateForm()" method="POST">
		<div class="form-group">
	    	<label class ="dark_brown" for="name">Nome:</label>
	      	<input type="text" class="form-control light_brown" id="name" placeholder="Inserisci il nome" name="namemenu">
	      	<span class="red" id="ver"></span>
	    </div>
		<button type="submit" class="btn btn-primary">Modifica nome</button>
	</form>
</div>
<br>
<br>
<!-- ./Modifica nome menù form -->
	
<%@ include file="footer.jsp" %>