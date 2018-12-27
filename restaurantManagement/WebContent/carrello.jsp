
<%@ include file="header.jsp" %>	

<!-- Cart -->
<div class="container">
	<h3 class ="dark_brown">Carrello</h3>
  	<hr/>
</div>
<div class="container">
	<div class="row">
		<div class="col-md-9">
	  		
		  	<!-- Table -->		
			<div class="table-responsive">
				<table class="table table-bordered">
					<thead>
						<tr>
							<th class ="dark_brown">Immagine</th>
					        <th class ="dark_brown">Nome prodotto</th>
					        <th class ="dark_brown">Prezzo unitario</th>
					        <th class ="dark_brown">Quantità</th>
					        <th class ="dark_brown">Subtotale</th>
					        <th></th>
						</tr>
					</thead>
		     		<tbody>     
							<tr>
								<td class="col-md-2"> 
						     		<a href="" >
							        		<img src="" class="img-responsive" style="" alt="">
							    		</a>
							    	</td>
						        <td class ="light_brown">
							        	<a href="" id="headingAnchor_discount">
					
							        	</a>
							    </td>
							    <td class ="light_brown">
							    	</td>
						        <td class ="light_brown">
						    
								<!-- Update -->
									<form action="carrello.jsp" method = "post">
										<input name="update" type="number" min="1" max="" value="">
										<input type="hidden" name="id" value="">
										<button type="submit" class="btn btn-default btn-xs"><span class="glyphicon glyphicon-refresh"></span></button>
									</form>
								<!-- ./Update -->     	
						        </td> 
						        <td class ="light_brown">				        
						
						        	</td>
						        <td>
						        		<!-- Remove product -->
									<form action="carrello.jsp">
						        			<input type="hidden" name="remove" value="">
						        			<button type="submit" class="btn btn-danger">Rimuovi</button>
						        		</form>
						        		<!-- Remove product -->
						        </td> 
						      </tr>

					</tbody>
				</table>
			</div>
			<!-- ./Table -->
			<div class="text-right">
				<a href="carrello.jsp?empty=1">Svuota il carrello</a>
			</div>
			<br>
		</div>
		
		<!-- Riepilogo -->
		<div class="col-md-3">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title dark_brown">Riepilogo ordine</h3>
				</div>
				<div class="panel-body"> 	
					<h5 class = "dark_brown">Numero prodotti:<span id = "quantity"> </span></h5>
					<h4 class = "light_brown">Totale:<span id = "total"> </span></h4>
		
		
				
				 </div>		 
			</div>
		</div>
		<!-- ./Riepilogo -->	
	</div>
	<br>
	<br>		
</div>
<!-- ./Cart -->
<script>	
	$(document).ready(function(){
		var tot = $("#total").text();
		var quant = $("#quantity").text();
	    $("#cart_menu").html(tot + " &euro; (" + quant+" )")
		});
</script>
<%@ include file="footer.jsp" %>