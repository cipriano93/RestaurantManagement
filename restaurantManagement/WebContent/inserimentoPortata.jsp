<%@ include file="header.jsp" %>	
	 <!-- Validation -->
	 <script>
  	  function verify(errore) {
  	  	document.getElementById("ver").innerHTML = errore;
  	  }
  	  
      function validateForm() {
        var name = document.form.name;
        var price = document.form.price;
        
        if(validationName(name) && validationPrice(price)){
          	return true;
        } else {
         	return false;
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
    </script>
	<!-- ./Validation -->
	
	<!-- Breadcrumb -->
	<nav aria-label="breadcrumb">
	 	<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="">Home</a></li>
			<li class="breadcrumb-item"><a href="areaPersonaleGestore.jsp">Area peronale</a></li>
			<li class="breadcrumb-item"><a href="getmenus">Gestione menù</a></li>
			<li class="breadcrumb-item"><a href="gestionePortata.jsp">Gestione portata</a></li>
			<li class="breadcrumb-item active" aria-current="page">Inserimento portata</li>
		</ol>
	</nav>
<!-- ./Breadcrumb -->

	<div class="container">
	  <h3>Inserisci una portata</h3>
	  <hr/>
	</div>
	
	<div class="container">
		<%
			String message = (String) request.getParameter("message");
			if (message != null) {
		%>
				<div class="alert alert-danger">
	  				<strong>Portata:</strong> <%= message %>
				</div>
		<%	}	%>
	
	<!-- Inserimento portata form -->
		<form  name="form" action="inserisciportata" method="POST" onsubmit="return validateForm()">
			<div class = "row">
				<div class="col-sm-4">
					<div class="form-group">
			    		<label class="dark_brown" for="name">Nome:</label>
			      		<input type="text" class="form-control light_brown" name="nameportata">
			      		<span id="ver" class="red"></span>
			    	</div>
			    </div>
			    <div class="col-sm-4">
	    			<div class="form-group">
	      				<label for="type">Tipo:</label>
						<select class="form-control" id="type" name="type">
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
				      	<span id="ver" class ="red"></span>
				    </div>
				 </div>
			</div>
			<div class="form-group">
					<label for="description">Descrizione:</label>
					<textarea class="form-control light_brown" rows="5" id="description" name="description"></textarea>
					<span id="ver" class="red"></span>
				</div>	
			<div class = "row">		
  				<div class="col-sm-3">
					<button type="submit" class="btn btn-primary">Inserisci</button>
				</div>
			</div>	
		</form>	
	<!-- ./Inserimento portata form -->
	</div>
	<br>
	<br>
	
<%@ include file="footer.jsp" %>