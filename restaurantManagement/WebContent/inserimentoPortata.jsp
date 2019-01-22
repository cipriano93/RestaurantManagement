<%@ include file="header.jsp" %>	
	 <!-- Validation -->
	 <script>
  	  function verify(errore) {
  	  	document.getElementById("ver").innerHTML = errore;
  	  }
  	  
      function validateForm() {
        var name = document.form.nameportata;
        var tipo = document.form.type;
        var price = document.form.price;
        var note = document.form.description;
        
        if(validationName(name) && validationTipo(tipo) && validationPrice(price) && validationNote(note) ){
          	return true;
        } else {
         	return false;
        }
      }
      function validationTipo(tipo) {
  	  	var string = tipo.value;
  	  	var string2 = "seleziona tipo";
    	if (string == string2){
    		verify("Seleziona il tipo");
    		tipo.focus();
      		return false;
      	} else {
         	return true;
      	}
	  }
      
      function validationName(name) {
  	  	var nameformat = /^[A-Z a-z]{3,}$/;
    		if (name.value.match(nameformat)){
      		return true;
      	} else {
      		verify("Inserire correttamente il nome");
         	name.focus();
         	return false;
      	}
	  }
      
   	  function validationPrice(price) {
   		var priceformat=/^[0-9]{1,2}\.[0-9]{1,2}$/;
 	 	if (price.value.match(priceformat)){
    		return true;
   	 	} else {
   	 		verify("Inserire correttamente il prezzo");
    		price.focus();
       		return false;
    	}
	  }
   	  
      function validationNote(note) {
    	  	var noteformat = /^[A-Z a-z]{4,}$/;
      		if (note.value.match(noteformat)){
        		return true;
        	} else {
        		verify("Inserire correttamente la descrizione");
           	note.focus();
           	return false;
        	}
  	  }
   	  
    </script>
	<!-- ./Validation -->
	
	<!-- Breadcrumb -->
	<nav aria-label="breadcrumb">
	 	<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="">Home</a></li>
			<li class="breadcrumb-item"><a href="areaPersonaleGestore.jsp">Area personale</a></li>
			<li class="breadcrumb-item"><a href="getmenus">Gestione menù</a></li>
			<li class="breadcrumb-item"><a href="gestionePortata.jsp">Gestione portata</a></li>
			<li class="breadcrumb-item active" aria-current="page">Inserimento portata</li>
		</ol>
	</nav>
<!-- ./Breadcrumb -->

	<div class="container my_satisfy">
	  <h3>Inserisci una portata</h3>
	  <hr/>
	</div>
	
	<div class="container my_avenir">
		<%
			String message = (String) request.getAttribute("message");
			if (message != null) {
		%>
				<div class="alert alert-warning">
	  				<strong>Attenzione!</strong> <%= message %>
				</div>
		<%	}	%>
	
	<!-- Inserimento portata form -->
		<form  name="form" action="inserisciportata" method="POST" onsubmit="return validateForm()">
			<div class = "row">
				<div class="col-sm-4">
					<div class="form-group">
			    		<label class="dark_brown" for="name">Nome:</label>
			      		<input type="text" class="form-control light_brown" name="nameportata">
			    	</div>
			    </div>
			    <div class="col-sm-4">
	    			<div class="form-group">
	      				<label for="type">Tipo:</label>
						<select class="form-control ligth_brown" id="type" name="type">
							<option>seleziona tipo</option>
							<option>Antipasto</option>
							<option>Primo</option>
							<option>Secondo</option>
							<option>Contorno</option>
							<option>Frutta</option>
							<option>Dessert</option>
							<option>Bevanda</option>
						</select>
	    			</div>
	    		</div>
	    		<div class="col-sm-4">
				   	<div class="form-group">
				      	<label class="dark_brown" for="price">Prezzo:</label>
				      	<input type="text" class="form-control light_brown" name="price">
				    </div>
				 </div>
			</div>
			<div class="form-group">
					<label for="description">Descrizione:</label>
					<textarea class="form-control light_brown" rows="5" id="description" name="description"></textarea>
				</div>	
			<div class = "row">		
  				<div class="col-sm-3">
					<button type="submit" class="btn btn-primary">Inserisci</button>
				</div>
			</div>	
			<br>
			<span id="ver" class="red"></span>
		</form>	
		
	<!-- ./Inserimento portata form -->
	</div>
	<br>
	<br>
	
<%@ include file="footer.jsp" %>