<%@ include file="header.jsp" %>

<% if (ub == null || !(ub.getTipo().equals("gestore"))) { %>
		<h3 class="red" style="font-family:avenir" align="center">Accedi come gestore</h3>
<% } else { %>

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
     		verifica("Il nome del men� deve contenere soltanto lettere o numeri");
			name.focus();
			return false;
		}
 	}
</script>

<!-- Breadcrumb -->
<nav aria-label="breadcrumb">
 	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="">Home</a></li>
		<li class="breadcrumb-item"><a href="areaPersonaleGestore.jsp">Area peronale</a></li>
		<li class="breadcrumb-item"><a href="gestioneMen�.jsp">Gestione men�</a></li>
		<li class="breadcrumb-item active" aria-current="page">Inserimento men�</li>
	</ol>
</nav>
<!-- ./Breadcrumb -->

<div class="container my_satisfy">
	<h3 class="dark_brown">Inserisci un men�</h3>
	<hr/>
</div>

	
<!-- Inserimento men� form -->
<div class="container my_avenir">
	<%
		String message = (String) request.getAttribute("message");
		if (message != null) {
	%>
			<div class="alert alert-warning">
  				<strong>Errore!</strong> <%= message %>.
			</div>
	 <% } %>
	<form name="form" action="inseriscimenu" onsubmit="return validateForm()" method="POST">
		<div class="form-group">
	    	<label class ="dark_brown" for="name">Nome:</label>
	      	<input type="text" class="form-control light_brown" id="name" placeholder="Inserisci il nome" name="namemenu">
	      	<span class="red" id="ver"></span>
	    </div>
		<button type="submit" class="btn btn-primary">Inserisci men�</button>
	</form>
</div>
<!-- ./Inserimento men� form -->

<% } %>

<br>
<br>
	
<%@ include file="footer.jsp" %>