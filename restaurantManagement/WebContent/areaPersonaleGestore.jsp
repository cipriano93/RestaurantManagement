<%@ include file="header.jsp" %>

<!-- Jumbotron -->
<div class="jumbotron" id = "jumbotron_login">
	<div class="container text-center">
		<h1>Area personale</h1>
	</div>
</div>
<!-- ./Jumbotron -->
	
<!-- Personal status -->
<div class="container my_avenir">
	<div class="row">
		<div class="col-md-12">
			
<<<<<<< HEAD
			<%
				Boolean message = (Boolean) request.getAttribute("message");
				if (message != null) {
			%>
					<div class="alert alert-success">
						<strong>Successo!</strong> I dati dell'attività sono stati modificati.
					</div>
			 <% } %>
			<h1 class ="dark_brown" style="font-family: satisfy">Bentornato <strong><span class ="light_brown"><%=ub.getNome() %></span></strong></h1>
			<a href="modificaDatiAttivita.jsp">Modifica dati attività</a>
			<br>
			<a href="getmenus">Gestione menù</a>
			<br>
			<a href="GetCamerieri">Gestione cameriere</a>
			<br>
			<a href="VisualizzaPrenotazioni">Visualizza prenotazioni</a>
			<br>
			<a href="visualizzaBilancio.jsp">Visualizza bilancio</a>
=======
				<a href="modificaDatiAttivita.jsp">Modifica dati attività</a>
				<br>
				<a href="getmenus">Gestione menù</a>
				<br>
				<a href="gestioneCameriere.jsp">Gestione cameriere</a>
				<br>
				<a href="VisualizzaPrenotazioni">Visualizza prenotazioni</a>
				<br>
				<a href="visualizzaBilancio.jsp">Visualizza bilancio</a>
>>>>>>> branch 'master' of https://github.com/cipriano93/RestaurantManagement.git

		</div>
	</div>
</div>
<br>
<br>
<!-- ./Personal status -->

<%@ include file="footer.jsp" %>