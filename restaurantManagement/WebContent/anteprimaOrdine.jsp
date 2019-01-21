<%@page import="model.PortataBean"%>
<%@page import="model.PortataComandaBean"%>
<%@page import="model.ComandaBean"%>
<%@page import="model.ComandaManager"%>
<%@page import="model.MenùBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.MenùManager"%>
<%@page import="model.TavoloBean"%>
<%@include file="header.jsp" %>
<style>
body {font-family: 'Judson', serif; background: #F8F5F1;}
</style>
<%TavoloBean tb = (TavoloBean) session.getAttribute("tavolo"); %>
<!-- Breadcrumb -->
<nav aria-label="breadcrumb" style="font-family: avenir">
	<ul class="breadcrumb">
		<li class="breadcrumb-item"><a href="">Home</a></li>
		<li class="breadcrumb-item"><a href="selezionaTavolo.jsp">Disposizione tavoli</a></li>
		<li class="breadcrumb-item"><a href="gestioneComanda.jsp">Gestione comanda</a></li>
		<li class="breadcrumb-item active" aria-current="page">Anteprima ordine</li>
	</ul>
</nav>
<!-- Breadcrumb -->

	<%ComandaBean cb = (ComandaBean) application.getAttribute("comanda"+tb.getNumeroTavolo());
	ArrayList<PortataComandaBean> portateComanda = cb.getPortateConsegnate();%>
	
	<%if(portateComanda.size() > 0) { %>
	<div class="container my_satisfy">
		<h3 class="dark_brown text-center">Anteprima ordine</h3>
		<hr>

		<%
			Boolean message = (Boolean) request.getAttribute("message");
			if (message != null) {
		%>
				<div class="alert alert-danger">
					<strong>Errore!</strong> Impossibile salvare l'ordine.
				</div>
		 <% } %>
	</div>
	
	<div class="container my_avenir">
		<div class="row">
<!-- Table -->
			<div class = "col-sm-3"></div>
			<div class = "col-sm-6">
				<div class="table-responsive">
					<table class = "table">
						<thead class ="my_font">
							<tr>
								<th>Nome portata</th>
								<th>Prezzo unitario</th>
								<th>Quantità</th>
								<th>SubTotale</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>Coperto</td>
								<% double prezzoCoperto = 2.0;
								int persone = tb.getNumeroPersone();
								double totaleCoperti = prezzoCoperto * persone;
								double totaleConto= totaleCoperti;
								%>
								<td><%=prezzoCoperto%><span> &euro;</span></td>
								<td><%=persone%></td>
								<td><%=totaleCoperti%><span> &euro;</span></td>	
							</tr>
							<%for(PortataComandaBean pcb: portateComanda){ %>
							<tr>
								<td><%=pcb.getPb().getNome()%></td>
								<td><%=pcb.getPb().getPrezzo()%><span> &euro;</span></td>
								<% double prezzo = Double.parseDouble(pcb.getPb().getPrezzo());
								int q = pcb.getQuantità();
								double totaleRiga = prezzo * q;
								totaleConto += totaleRiga;
								%>
								<td><%=q%></td>
								<td><%=totaleRiga %><span> &euro;</span></td>
							</tr>
							<% } %>
						</tbody>
			
					</table>
				</div>
			</div>
			<div class = "col-sm-3"></div>
		</div>
	
		<div class="row">
			<div class = "col-sm-7"></div>
			<div class = "col-sm-2 text-right">
				<div><strong><span>Totale <%=totaleConto %> &euro;</span></strong></div>
				<% session.setAttribute("totale_ordine", totaleConto); %>
			</div>
			<div class = "col-sm-3"></div>
			
		</div>
			<!-- Bottone conferma ordine -->
			<div class="col-md-12">
				<form  name="form" action="ConfermaOrdine" method="POST">
					<div class="text-center"> 
			    			<button id="conferma_ordine" class="btn btn-success my_font">Conferma ordine</button> 
					</div>
				</form>
			<br>
			</div>
		<!-- Bottone conferma ordine -->
		
	<% } %>

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
