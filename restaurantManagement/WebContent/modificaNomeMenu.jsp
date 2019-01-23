<%@ include file="header.jsp" %>

<% if (ub == null || !(ub.getTipo().equals("gestore"))) { %>
		<h3 class="red" style="font-family:avenir" align="center">Accedi come gestore</h3>
<% } else { %>

<script>
	function verify(errore){
		document.getElementById("ver").innerHTML = errore;
	}
	
 	function validateForm(){
   		var name = document.form.namemenu;
   		if(validationName(name)){
     		return true;
   		} else {
     		return false;
		}
 	}
 	
 	function validationName(name) {
   		var nameformat = /^[a-z A-Z]{4,}$/;
   		if(name.value.match(nameformat)){
     		return true;
   		} else {
     		verify("Inserisci correttamente il nome del menù");
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

<div class="container my_satisfy">
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
<div class="container my_avenir">
	<form name="form" action="modificanomemenu" onsubmit="return validateForm()" method="POST">
		<div class="form-group">
	    	<label class ="dark_brown" for="name">Nome:</label>
	      	<input type="text" class="form-control light_brown" id="namemenu" placeholder="Inserisci il nome" name="namemenu">
	    </div>
		<button type="submit" class="btn btn-primary">Modifica nome</button>
	</form>
	<br>
	<span class="red" id="ver"></span>
</div>
<!-- ./Modifica nome menù form -->

<% } %>

<br>
<br>
	
<%@ include file="footer.jsp" %>