<%@ include file="header.jsp" %>

<!-- Breadcrumb -->
	<ul class="breadcrumb">
		<li><a href="#">Home</a></li>
		<li><a href="#">Disposizione tavoli</a></li>
		<li><a href="#">Tavolo n.</a></li>
		<li>Anteprima ordine</li>
	</ul>
<!-- Breadcrumb -->

	<div class="container">
	<h3 class="dark_brown" align="center">Anteprima ordine</h3>
	<hr>
	</div>

	<div class="container">
	<div class="row">
	<div class="col-md-12">

	
<!-- Table -->
	<div class="table-responsive">
	<table class="table table-bordered">
	<thead>
		<tr>
			<th class="dark_brown text-center">Nome portata</th>
			<th class="dark_brown text-center">Prezzo unitario</th>
			<th class="dark_brown text-center">Quantita'</th>
			<th class="dark_brown text-center">Subtotale</th>
		</tr>
	</thead>
	</table>

<!-- Table -->

	
	<h5 class="dark_brown" align="center"> Totale &euro;</h5>
	

	<!-- Bottone conferma ordine -->
			<div class="col-md-4">
				<form  name="form" action="ConfermaOrdine" method="POST" onsubmit="">
					<div class="text-center"> 
			    			<button id="anteprima_ordine" class="btn btn-success">Conferma ordine</button> 
			    			<input type="hidden" name ="tavolo" value = "<%= request.getParameter("tavolo")%>">
					</div>
				</form>
			<br>
		<!-- Bottone conferma ordine -->
	
	</div>
	</div>
	</div>
	
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>

	
	</div>
	<div class="footer">	<%@ include file="footer.jsp" %> </div>
