<%@ page import="java.util.ArrayList, modelGestioneMenù.PortataBean, modelGestioneComanda.PortataComandaBean, modelGestioneComanda.ComandaBean" %>
<%@ include file="header.jsp" %>

<div class="container">
	<div>
		<h3 class="dark_brown"  style= "font-family: satisfy">Cucina</h3>
	</div>
	<hr>
	
	<%
		int num_comande = 0;
		for (int i = 1; i<=15; i++) {
			ComandaBean cb = (ComandaBean) application.getAttribute("comanda" + i);
			if (cb != null && (cb.getSizeAllPortate())>=0) {
				num_comande++;
				int size = cb.getSizeAllPortate();
				ArrayList<PortataComandaBean> pcbs = cb.getPortateComanda();
				if ((num_comande % 4) == 1) {
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
				for (int j = 0; j<size; j++) {
					PortataComandaBean pcb = pcbs.get(j);
					PortataBean pb = pcb.getPb();
	%>
				 <% if (!(pcb.isConsegnato())) { %>
						<div class="row light_brown">
				 <% } else { %>
						<div class="row red">
				 <% } %>
					<div class="col-sm-8"><%= pb.getNome() %></div>
				 <% if (!(pcb.diversaQuantità())) { %>
					 	<div class="col-sm-4 text-center" style="color:#4682B4"><%= pcb.getQuantità() %></div>
				 <% } else { %>
						<div class="col-sm-4 text-center"><%= pcb.getQuantità() %></div>
				 <% } %>
				 </div>
			   <% } %>
				</div>
				</div>
				</div>
			 <% if ((num_comande % 4) == 0) { %>
			 		</div>
	<%				
				}
			}
		}
	%>
</div>

</div>

<%@ include file="footer.jsp" %>