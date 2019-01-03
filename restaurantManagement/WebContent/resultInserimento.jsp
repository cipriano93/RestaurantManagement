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
			<% if(request.getAttribute("prenotazioneInserita")!=null) {%>
					<p class="green">Prenotazione inserita con successo</p>	
					<%} %>
		</div>
	</div>
</div>
<br>
<br>
<!-- ./Personal status -->

<%@ include file="footer.jsp" %>