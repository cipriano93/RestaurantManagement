<%@ include file="header.jsp" %>

<!-- Jumbotron -->
<div class="jumbotron" id = "jumbotron_login">
	<div class="container text-center">
		<h1>Area personale</h1>
	</div>
</div>
<!-- ./Jumbotron -->
	
<!-- Personal status -->
<div class="container">
	<div class="row">
		<div class="col-md-12">
			<h1 class ="dark_brown">Bentornato <strong><span class ="light_brown">Andrea</span></strong></h1>
			
				<a href="modificaDatiAttivita.jsp">Modifica dati attività</a>
				<br>
				<a href="getmenus">Gestione menù</a>
				<br>
				<a href="gestioneCameriere.jsp">Gestione cameriere</a>
				<br>
				<a href="visualizzaPrenotazioniGestore.jsp">Visualizza prenotazioni</a>
				<br>
				<a href="visualizzaBilancio.jsp">Visualizza bilancio</a>

		</div>
	</div>
</div>
<br>
<br>
<!-- ./Personal status -->

<%@ include file="footer.jsp" %>