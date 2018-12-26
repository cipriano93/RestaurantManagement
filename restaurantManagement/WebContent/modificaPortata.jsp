<%@ include file="heading.jsp" %>	
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
			<li class="breadcrumb-item active" aria-current="page">Modifica portata</li>
		</ol>
	</nav>
<!-- ./Breadcrumb -->

	<div class="container">
	  <h3>Modifica portata</h3>
	  <hr/>
	</div>
	
	<!-- Modifica portata form -->
	<div class="container">
	   		<form  name="form" action="" method="POST" onsubmit="return validateForm()">
				<div class="form-group">
			    	<label class="dark_brown" for="name">Nome:</label>
			      		<input type="text" class="form-control light_brown" name="name">
			      		<span id="ver" class="red"></span>
			    	</div>
	    			<div class="form-group">
	      				<label for="type">Tipo:</label>
						<select class="form-control" id="type">
							<option>Antipasto</option>
							<option>Primo</option>
							<option>Secondo</option>
							<option>Contorno</option>
							<option>Frutta</option>
							<option>Dessert</option>
							<option>Bevande</option>
						</select>
	    			</div>
				   	<div class="form-group">
				      	<label class="dark_brown" for="price">Prezzo:</label>
				      	<input type="text" class="form-control light_brown" name="price">
				      	<span id="ver" class ="red"></span>
				    </div>
				    <div class="form-group">
						<label for="description">Descrizione:</label>
						<textarea class="form-control" rows="5" id="description"></textarea>
						<span id="ver" class="red"></span>
					</div> 
					<button type="submit" class="btn btn-primary">Modifica portata</button>
			</form>	
	</div>
	<br>
	<br>
	<!-- ./Modifica portata form -->
	
<%@ include file="footer.jsp" %>