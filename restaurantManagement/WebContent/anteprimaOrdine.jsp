<%@page import="modelGestioneMen�.PortataBean"%>
<%@page import="modelGestioneComanda.PortataComandaBean"%>
<%@page import="modelGestioneComanda.ComandaBean"%>
<%@page import="modelGestioneComanda.ComandaManager"%>
<%@page import="modelGestioneMen�.Men�Bean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelGestioneMen�.Men�Manager"%>
<%@page import="modelGestioneComanda.TavoloBean"%>
<%@ include file="header.jsp" %>

<%TavoloBean tb = (TavoloBean) session.getAttribute("tavolo"); %>
<!-- Breadcrumb -->
	<ul class="breadcrumb">
		<li class="breadcrumb-item"><a href="">Home</a></li>
		<li class="breadcrumb-item"><a href="selezionaTavolo.jsp">Disposizione tavoli</a></li>
		<li class="breadcrumb-item"><a href="gestioneComanda.jsp">Gestione comanda</a></li>
		<li class="breadcrumb-item active" aria-current="page">Anteprima ordine</li>
	</ul>
<!-- Breadcrumb -->
	<%ComandaBean cb = (ComandaBean) application.getAttribute("comanda"+tb.getNumeroTavolo());
	ArrayList<PortataComandaBean> portateComanda = cb.getPortateConsegnate();%>
	
	<%if(portateComanda.size() > 0){ %>
	<div class="container">
		<h3 class="dark_brown text-center" style="font-family: satisfy" >Anteprima ordine</h3>
		<div>
			<h4 class="dark_brown text-center" style="font-family: satisfy">Tavolo n. <%=tb.getNumeroTavolo() %></h4>
		</div>
	<hr>
	</div>

	
	<div class="container">
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
								<th>Quantit�</th>
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
								int q = pcb.getQuantit�();
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
			</div>
			<div class = "col-sm-3"></div>
			
		</div>
			<!-- Bottone conferma ordine -->
			<div class="col-md-12">
				<form  name="form" action="ConfermaOrdine" method="POST" onsubmit="">
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
