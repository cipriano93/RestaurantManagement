<%@ page import="java.util.ArrayList, model.PortataBean, model.PortataComandaBean, model.ComandaBean, model.CucinaBean" %>
<%@ include file="header.jsp" %>

<% if (ub == null || !(ub.getTipo().equals("cameriere"))) { %>
		<h3 class="red" style="font-family:avenir" align="center">Accedi come cameriere</h3>
<% } else { %>

<!-- Breadcrumb -->
	<nav aria-label="breadcrumb">
	 	<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="">Home</a></li>
			<li class="breadcrumb-item"><a href="selezionaTavolo.jsp">Disposizione tavoli</a></li>
			<li class="breadcrumb-item"><a href="gestioneComanda.jsp">Gestione comanda</a></li>
			<li class="breadcrumb-item active" aria-current="page">Cucina</li>
		</ol>
	</nav>
<!-- ./Breadcrumb -->


<div class="container my_avenir">
	<div>
		<h3 class="dark_brown my_satisfy">Cucina</h3>
	</div>
	<hr>
	
	<%
		Boolean message = (Boolean) request.getAttribute("message");
		if (message != null) {
	%>
			<div class="alert alert-success">
				<strong>Successo!</strong> La comanda è stata inviata in cucina.
			</div>
	<%
		}
		CucinaBean cucina = (CucinaBean) application.getAttribute("cucina");
		if (cucina == null || (cucina.getSize()) == 0) {
	%>
			<div class="alert alert-info">
				<strong>Info!</strong> Nessuna comanda inviata in cucina.
			</div>
	<%
		} else {
			int num_portate = 0;
			int size = cucina.getSize();
			for (int i = 0; i < size; i++) {
				ComandaBean cb = cucina.getComanda(i);
				
				ArrayList<PortataComandaBean> pcbs = cb.getPortateNonConsegnate();
				int size_portate= pcbs.size();
				int bevande = 0;
				for (int w = 0; w < size_portate; w++) {
					PortataComandaBean pcb = pcbs.get(w);
					PortataBean pb = pcb.getPb();
					if(pb.getTipo().equals("Bevanda"))
						bevande ++;
				}
				if (size_portate >= 1 && ! (bevande == size_portate)) {
					num_portate++;
					if ((num_portate % 3) == 1) {
		%>
							<div style="font-family: satisfy" class="row">
				 <% } %>
				 	<div class="col-sm-4">
				 		<div class="panel panel-default">
							<div class="panel-heading">
								<h4 class= "dark_brown my_satisfy">Tavolo <%= cb.getTavolo().getNumeroTavolo() %></h4>
							</div>	    
							<div class="panel-body my_avenir">
								<div class="row">
									<div class="col-sm-5"><strong>Portata</strong></div>
									<div class="col-sm-3"><strong>Quantità</strong></div>
									<div class="col-sm-4"><strong>Note</strong></div>
								</div>
		<%		 
					for (int j = 0; j < size_portate; j++) {
						PortataComandaBean pcb = pcbs.get(j);
						PortataBean pb = pcb.getPb();
		%>
					<%if(!pcb.getPb().getTipo().equals("Bevanda")) { %>
					 <% if (!(pcb.isConsegnato())) { %>
							<div class="row">
					 <% } else { %>
							<div class="row red">
					 <% } %>
						<div class="col-sm-5"><%= pb.getNome() %></div>
					 <% if (!(pcb.diversaQuantità()) && !(pcb.isConsegnato())) { %>
						 	<div class="col-sm-3 text-center" style="color: #C90015;"><%= pcb.getQuantità() %></div>
					 <% } else { %>
							<div class="col-sm-3 text-center"><%= pcb.getQuantità() %></div>
					 <% } %>
					 <div class="col-sm-4"><%=pcb.getNote() %></div>
					 
					 </div>
					 	
				   <% }} %>
					</div>
					</div>
					</div>
					
			 <% }
			 	if (num_portate != 1 && (num_portate % 3) == 1) {
			 %>
			 		</div>
	<%			
				}
			}
		}
	%>
</div>

</div>

<% } %>

<br>

<%@ include file="footer.jsp" %>