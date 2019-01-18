<%@page import="model.UtenteBean"%>
<%@ page import="java.util.ArrayList, java.util.GregorianCalendar, model.PrenotazioneBean" %>
<%@ include file ="header.jsp" %>

<style>
	#prenotazioni {
	  	font-family: satisfy;
	  	border-collapse: collapse;
		width: 96%;
		margin:25px;
	}

	#prenotazioni td, #prenotazioni th {
		border: 1px solid #ddd;
	  	padding: 8px;
	  	width:10%;
	}

	#prenotazioni tr:nth-child(even){ background-color: white; }

	#prenotazioni tr:hover { background-color: #ddd; }

	#prenotazioni th {
  		padding-top: 12px;
  		padding-bottom: 12px;
  		text-align: left;
  		background-color: #B9D3B0;
  		color: white;
	}
	
	#btn {
 		margin: 20px;
	}
</style>

<!-- Breadcrumb -->
<nav aria-label="breadcrumb">
	<ul class="breadcrumb">
		<li><a href="#">Home</a></li>
		
		<%if (ub.getTipo().equals("gestore")) { %>
			<li class="breadcrumb-item"><a href="areaPersonaleGestore.jsp">Area personale</a></li>
		<%} else { %>
			<li class="breadcrumb-item"><a href="areaPersonaleCliente.jsp">Area personale</a></li>
		<% } %>
		<li class="breadcrumb-item active" aria-current="page">Visualizza prenotazioni</li>
	</ul>
</nav>
<!-- Breadcrumb -->

<div class="container my_avenir">
	<h3 class="dark_brown "style="font-family: satisfy">Prenotazioni</h3>
	<hr>
	
	<%
		Boolean message = (Boolean) request.getAttribute("message_danger");
		if (message != null) {
	%>
			<div class="alert alert-danger">
				<strong>Errore!</strong> Impossibile rimuovere la prenotazione.
			</div>
	<%
		}
		message = (Boolean) request.getAttribute("message_success");
		if (message != null) {
	%>
			<div class="alert alert-success">
				<strong>Successo!</strong> Prenotazione rimossa.
			</div>
	<%
		}
		ArrayList<PrenotazioneBean> pbs = (ArrayList<PrenotazioneBean>) session.getAttribute("prenotazioni");
		if (pbs == null || (pbs.size()) == 0) {
	%>
			<div class="alert alert-info">
				<strong>Info!</strong> Nessuna prenotazione effettuata finora.
			</div>
	 <% } else { %>
		<div class ="container my_avenir">
			<div class="row">
			
				<div class="col-sm-3"></div>
				
				<div class="col-sm-6">
	
					<!-- Tabella prenotazioni -->
					<table id="prenotazioni" class="text-center">
						<tr>
					    	<th style="text-align: center">Data</th>
					    	<th style="text-align: center">Ora</th>
					    	<th style="text-align: center">N.coperti</th>
					    	<th style="text-align: center">Rimozione</th>
					  	</tr>
					  	<%
					  		int size = pbs.size();
					  		for (int i = 0; i < size; i++) {
					  			PrenotazioneBean pb = pbs.get(i);
					  			GregorianCalendar gc = pb.getData();
					  	%>
					  			<tr>
					  				<td><%= gc.get(gc.DAY_OF_MONTH) + "/" %>
					  				<%
					  					int month = gc.get(gc.MONTH) + 1;
					  				   	if (month >= 1 && month <= 9) { %>
					  						<%= "0" %>
					  				 <% } %>
					  				<%= month + "/" + gc.get(gc.YEAR) %></td>
					  				<td><%= gc.get(gc.HOUR_OF_DAY) + ":" %>
					  				<%
					  					int minute = gc.get(gc.MINUTE);
					  					if (minute >= 0 && minute <= 9) {
					  				%>
					  						 <%= "0" %>
					  				 <% } %>
					  				<%= gc.get(gc.MINUTE) %></td>
					  				<td><%= pb.getNumPersone() %></td>
					  				<td>
					    				<a href=<%= "RimozionePrenotazione?idprenotazione=" + pb.getIdPrenotazione() %> class="btn btn-danger">Rimuovi</a>
					    			</td>
					  			</tr>
					  	 <% } %>
					 </table>
					<!-- ./Tabella prenotazioni -->
			
				</div>
				
				<div class="col-sm-3"></div>
			
			</div>
	</div>
	 <% } %>

</div>		

<%@ include file="footer.jsp" %>