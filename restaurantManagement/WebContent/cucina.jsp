<%@ page import="java.util.ArrayList, modelGestioneMenù.PortataBean, modelGestioneComanda.PortataComandaBean, modelGestioneComanda.ComandaBean, modelGestioneComanda.CucinaBean" %>
<%@ include file="header.jsp" %>

<div class="container">
	<div>
		<h3 class="dark_brown"  style= "font-family: satisfy">Cucina</h3>
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
				int size_portate = cb.getSizeAllPortate();
				ArrayList<PortataComandaBean> pcbs = cb.getPortateComanda();
				if (size_portate >= 1) {
					num_portate++;
					if ((num_portate % 4) == 1) {
		%>
							<div style="font-family: satisfy" class="row">
				 <% } %>
				 	<div class="col-sm-3">
				 		<div class="panel panel-default">
							<div class="panel-heading">
								<h4 class= "dark_brown my_font">Tavolo <%= cb.getTavolo().getNumeroTavolo() %></h4>
							</div>	    
							<div class="panel-body">
								<div class="row">
									<div class="col-sm-8"><strong>Portata</strong></div>
									<div class="col-sm-4"><strong>Quantità</strong></div>
								</div>
		<%		 
					for (int j = 0; j < size_portate; j++) {
						PortataComandaBean pcb = pcbs.get(j);
						PortataBean pb = pcb.getPb();
		%>
					 <% if (!(pcb.isConsegnato())) { %>
							<div class="row light_brown">
					 <% } else { %>
							<div class="row red">
					 <% } %>
						<div class="col-sm-8"><%= pb.getNome() %></div>
					 <% if (!(pcb.diversaQuantità()) && !(pcb.isConsegnato())) { %>
						 	<div class="col-sm-4 text-center" style="color:#4682B4"><%= pcb.getQuantità() %></div>
					 <% } else { %>
							<div class="col-sm-4 text-center"><%= pcb.getQuantità() %></div>
					 <% } %>
					 </div>
				   <% } %>
					</div>
					</div>
					</div>
					
			 <% }
			 	if (num_portate != 1 && (num_portate % 4) == 1) {
			 %>
			 		</div>
	<%			
				}
			}
		}
	%>
</div>

</div>

<%@ include file="footer.jsp" %>