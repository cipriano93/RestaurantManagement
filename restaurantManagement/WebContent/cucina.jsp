<%@ page import="java.util.ArrayList, modelGestioneMen�.PortataBean, modelGestioneComanda.PortataComandaBean, modelGestioneComanda.ComandaBean" %>
<%@ include file="header.jsp" %>

<div class="container">
	<div>
		<h3 class="dark_brown"  style= "font-family: satisfy">Cucina</h3>
	</div>
	<hr>
	
	<%
		for (int i = 1; i<=15; i++) {
			ArrayList<ComandaBean> cbs = (ArrayList<ComandaBean>) application.getAttribute("comanda" + i);
			if (cbs != null && (cbs.size())>=0) {
				ComandaBean cb = cbs.get(i-1);
				int size = cb.getSizeAllPortate();
				ArrayList<PortataComandaBean> pcbs = cb.getPortateComanda();
				if ((i%4) == 1) {
	%>
					<div  style="font-family: satisfy" class="row">
			 <% } %>
			 	<div class="col-sm-3">
			 		<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class= "dark_brown my_font">Tavolo <%= cb.getTavolo().getNumeroTavolo() %></h4>
						</div>	    
						<div class="panel-body">
							<div class="row dark_brown">
								<div class="col-sm-8"><strong>Portata</strong></div>
								<div class="col-sm-4"><strong>Quantit�</strong></div>
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
				 <% if (!(pcb.diversaQuantit�())) { %>
					 	<div class="col-sm-4 text-center" style="color:#4682B4"><%= pcb.getQuantit�() %></div>
				 <% } else { %>
						<div class="col-sm-4 text-center"><%= pcb.getQuantit�() %></div>
				 <% } %>
				 </div>
			   <% } %>
				</div>
				</div>
				</div>
			 <% if ((i % 4) == 0) { %>
			 		</div>
	<%				
				}
			}
		}
	%>
</div>

	<!--  <div  style= "font-family: satisfy" class="row">

		<div class="col-sm-3">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class= "dark_brown my_font">Tavolo: 7</h4>
				</div>	    
				
				<div class="panel-body"> -->
				<!-- Prima riga uguale per tutti-->
					<div class="row dark_brown ">
						<div class="col-sm-8"><strong>Portata</strong></div>
						<div class="col-sm-4"><strong>Quantit�</strong></div>
					</div>
					<!--/.Prima riga uguale per tutti-->
					
					<!--  <div class="row light_brown red">
						<div class="col-sm-8">scialatelli frutti di mare</div>
						<div class="col-sm-4 text-center">45</div>
					</div>
					
					<div class="row">
						<div class="col-sm-8">scialatelli frutti di mare</div>
						<div class="col-sm-4 text-center"style ="color:#4682B4">45</div>
					</div>
				
					<div class="row ">
						<div class="col-sm-8">scialatelli frutti di mare</div>
						<div class="col-sm-4 text-center">45</div>
					</div>		
				</div>	
				</div>		
		</div>	
	</div> -->
</div>

<%@ include file="footer.jsp" %>