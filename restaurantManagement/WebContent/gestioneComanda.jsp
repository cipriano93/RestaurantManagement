<%@ include file="header.jsp" %>	
	 <!-- Validation -->
	 <script>
  	  function verify(errore) {
  	  	document.getElementById("ver").innerHTML = errore;
  	  }
  	  
      function validateForm() {
        var note = document.form.note;
       
        if(validationNome(note)){
          	return true;
        } else {
         	return false;
        }
      }
      
      function validationNote(note) {
  	  	var noteformat = /^[A-Z a-z]{3,}$/;
    	if (name.value.match(nameformat)){
      		return true;
      	} else {
      		verify("Inserire correttamente le note");
         	name.focus();
         	return false;
      	}
	  }
      
    </script>
	<!-- ./Validation -->
	
	<!-- Breadcrumb -->
	<nav aria-label="breadcrumb">
	 	<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="">Home</a></li>
			<li class="breadcrumb-item active" aria-current="page">Disposizione tavoli</li>
			<li class="breadcrumb-item active" aria-current="page">Gestione comanda</li>
		</ol>
	</nav>
<!-- ./Breadcrumb -->

	<div class="container">
	  <h3>Gestione comanda</h3>
	  <hr/>
	</div>
	
	<!-- Numero persone -->
	<div class="container" >
	  <h4 class= "dark_brown"> Numero persone: <span class= "light_brown">10</span></h4>
	</div>
	<!-- \.Numero persone -->
	
	<!-- Inserimento portata comanda form -->
	<div class="container">
   		<form  name="form" action="" method="POST" onsubmit="return validateForm()">
			<div class = "row">
			<!-- Menù -->
				<div class="col-sm-2">
    					<div class="form-group dark_brown">
      					<label for="type">Menù:</label>
							<select class="form-control light_brown" id="type">
								<option>" "</option>
							</select>
    					</div>
    				</div>
			<!-- ./Menù --> 
				
			<!-- Tipo portata -->
				<div class="col-sm-3">
    					<div class="form-group dark_brown">
      					<label for="type">Tipo:</label>
							<select class="form-control light_brown" id="type">
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
			<!-- ./Tipo portata --> 
								
    			<!-- Portata -->
				<div class="col-sm-3">
    					<div class="form-group dark_brown">
      					<label for="type">Nome portata:</label>
							<select class="form-control light_brown" id="type">
								<option>Spaghetti</option>
								<option>Acqua</option>
							</select>
   						</div>
    				</div>
			<!-- ./Portata --> 
			
			<!-- Quantità -->
				<div class="col-sm-1">
					<div class="form-group dark_brown">
	   				 	<label for="num_people">Quantità:</label>
	    					<input type="number" class="form-control light_brown" id="num_people" name="num_people" min="1" max="20">
				   </div>	
			   </div>						
    			<!-- \.Quantità -->	
				
			<!-- Note -->
				<div class="col-sm-3">
					<div class="form-group dark_brown">
						<label for="hour">Note:</label>
						<textarea class="form-control light_brown" rows="5" id="note"></textarea>
						<span id="ver" class="red"></span>
	   				 </div>
	   			 </div>
			<!-- \.Note -->
			</div>
			<!-- Bottone inserimento portata nella comanda -->
				<div class="text-center">
					<div class=" text-center"> 
				    	<button id="inserimento_portata_comanda" class="btn btn-success" onclick="">Inserisci portata</button> 
					</div>
				</div>
				<!-- /.Bottone inserimento portata nella comanda -->
					
			
		</form>	
	</div>					
	<br>
	<!-- ./Inserimento portata comanda form -->
	
	
	<!-- Gestione ordine form form -->
	<div class="container">
	<h3 class="dark_brown">Lista portate</h3>
	<hr>
	</div>

	<div class="container text-centered">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
			<!-- Table -->
				<div class="table-responsive">
					<table class="table table-bordered">
						<thead>
							<tr>
								<th class="dark_brown text-center">Nome portata</th>
								<th class="dark_brown text-center">Quantita'</th>
								<th class="dark_brown text-center">Consegnato</th>
								<th class="dark_brown text-center"></th>
							</tr>
						</thead>
						<!--  Corpo table -->
						<tbody>
							<tr>
								<!-- Nome portata comanda -->
								<td>
									Spaghetti
								</td>
								<!-- /.Nome portata comanda -->
								
								<!-- Quantità portata comanda -->
								<td>
									<form action="" method = "post">
										<input name="update" type="number" placeholder="2" min="1" max="" value="">
										<input type="hidden" name="id" value="">
										<button type="submit" class="btn btn-default btn-xs"><span class="glyphicon glyphicon-refresh"></span></button>
									</form>
								</td>
								<!-- /.Quantità portata comanda -->
								
								<!-- Stato portata comanda -->
								<td>
									
									
										
										<span id ="fist" style="color:green"  class=" btn btn-default btn-md glyphicon glyphicon-ok"></span>
			
								</td>
								<!-- /.Stato portata comanda -->
								
								<!-- Rimozione portata comanda -->
								<td>
									<form action="">
						        			<input type="hidden" name="remove" value="">
						        			<button type="submit" class="btn btn-danger">Rimuovi</button>
						        		</form>
								</td>
								<!-- /.Rimozione portata comanda -->
								
							</tr>
							
							
							<tr>
								<!-- Nome portata comanda -->
								<td>
									Spaghetti
								</td>
								<!-- /.Nome portata comanda -->
								
								<!-- Quantità portata comanda -->
								<td>
									<form action="" method = "post">
										<input name="update" type="number" min="1" max="" value="">
										<input type="hidden" name="id" value="">
										<button type="submit" class="btn btn-default btn-xs"><span class="glyphicon glyphicon-refresh"></span></button>
									</form>
								</td>
								<!-- /.Quantità portata comanda -->
								
								<!-- Stato portata comanda -->
								<td>
									<a  href="#">
										<span style="color:red"  class=" btn btn-default btn-md glyphicon glyphicon-remove"></span>
									</a>
								</td>
								<!-- /.Stato portata comanda -->
								
								<!-- Rimozione portata comanda -->
								<td>
									<form action="">
						        			<input type="hidden" name="remove" value="">
						        			<button type="submit" class="btn btn-danger">Rimuovi</button>
						        		</form>
								</td>
								<!-- /.Rimozione portata comanda -->
								
							</tr>
							
							
							
						
						</tbody>
						<!--  /.corpo table -->
					</table>
				</div>
			<!-- Table -->
			</div>
		</div>
		<div class="col-md-2"></div>
	</div>
	
		
	<div class ="row">
		<div class="col-md-2"></div>
		<!-- Bottone conferma ordine -->
			<div class="col-md-4">
				<form  name="form" action="" method="POST" onsubmit="">
					<div class="text-center"> 
			    			<button id="conferma_ordine" class="btn btn-success">Conferma ordine</button> 
					</div>
				</form>
			<br>
		<!-- Bottone conferma ordine -->
			</div>
		<!-- Bottone invia comanda -->
		<div class="col-md-4">
			<form  name="form" action="" method="POST" onsubmit="">
				<div class=" text-center"> 
		    			<button id="invia_comanda" class="btn btn-success">Invia comanda</button> 
				</div>
			</form>
		<!-- Bottone invia comanda -->
		</div>
		<div class="col-md-2"></div>
	</div>
	<!-- ./Gestione ordine form form -->
	<br>
	<br>
	
<%@ include file="footer.jsp" %>