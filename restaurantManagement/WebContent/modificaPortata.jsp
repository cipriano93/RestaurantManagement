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
				<div class = "row">
				<div class="col-sm-4">
				<div class="form-group">
			    	<label class="dark_brown" for="name">Nome:</label>
			      		<input type="text" class="form-control light_brown" name="name" value= "Spaghetti pomodoro">
			      		<span id="ver" class="red"></span>
			    	</div>
			    	</div>
			    	<div class="col-sm-4">
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
	    			</div>
	    			<div class="col-sm-4">
				   	<div class="form-group">
				      	<label class="dark_brown" for="price">Prezzo:</label>
				      	<input type="text" class="form-control light_brown" name="price" value = "3.00">
				      	<span id="ver" class ="red"></span>
				    </div>
				 </div>
				 </div>
				 
				    <div class="form-group">
						<label for="description">Descrizione:</label>
						<textarea class="form-control light_brown" rows="5" id="description">Vestibulum nec fringilla purus. Etiam dictum eleifend leo, eu laoreet lectus suscipit nec. Aliquam accumsan neque eu dolor tincidunt porttitor. Nulla.</textarea>
						<span id="ver" class="red"></span>
					</div>	
					
			<div class = "row">		
  				<div class="col-sm-3">
					<button type="submit" class="btn btn-primary">Modifica</button>
				</div>
			</div>	
			</form>	
	</div>
	
	<br>
	<br>
	<!-- ./Modifica portata form -->
	
<%@ include file="footer.jsp" %>