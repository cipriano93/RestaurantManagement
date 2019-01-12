<%@ page import="modelGestioneUtente.UtenteBean" %>
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
			 <% if(request.getAttribute("prenotazioneInserita") != null) { %>
					<div class="alert alert-success">
						<strong>Successo!</strong> Prenotazione effettuata.
					</div>	
			 <% } %>
	<h1 class ="dark_brown">Bentornato 
		<strong><span class ="light_brown"><%= ((UtenteBean) session.getAttribute("utenteBean")).getNome() %></span></strong>
	</h1>
	<a href="modificaDatiPersonali.jsp">Modifica dati personali</a>
	<br>
	<a href="VisualizzaPrenotazioni">Visualizza prenotazioni</a>
</div>
<br>
<br>
<!-- ./Personal status -->

<%@ include file="footer.jsp" %>