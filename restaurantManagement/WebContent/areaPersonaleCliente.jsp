<%@ page import="model.UtenteBean" %>
<%@ include file="header.jsp" %>

<!-- Jumbotron -->
<div class="jumbotron" id = "jumbotron_login">
	<div class="container text-center my_satisfy">
		<h1>Area personale</h1>
	</div>
</div>
<!-- ./Jumbotron -->
	
<!-- Personal status -->
<div class="container my_avenir">
			 <%
			 	Boolean message = (Boolean) request.getAttribute("message");
			 	if (message != null) {
			 %>
					<div class="alert alert-success">
						<strong>Successo!</strong> Dati modificati.
					</div>	
			 <%
			 	}
			 	if(request.getAttribute("prenotazioneInserita") != null) {
			 %>
					<div class="alert alert-success">
						<strong>Successo!</strong> Prenotazione effettuata.
					</div>	
			 <% } %>
			 
		<h1 class ="dark_brown" style="font-family: satisfy">Bentornato <strong><span class ="light_brown"><%=ub.getNome() %></span></strong></h1>
	<a href="modificaDatiPersonali.jsp">Modifica dati personali</a>
	<br>
	<a href="VisualizzaPrenotazioni">Visualizza prenotazioni</a>
</div>
<br>
<br>
<!-- ./Personal status -->

<%@ include file="footer.jsp" %>