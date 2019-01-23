<%@page import="model.PortataBean"%>
<%@page import="model.PortataComandaBean"%>
<%@page import="model.ComandaBean"%>
<%@page import="model.ComandaManager"%>
<%@page import="model.MenùBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.MenùManager"%>
<%@page import="com.sun.glass.ui.Menu"%>
<%@page import="model.TavoloBean"%>
<%@ include file="header.jsp" %>

<% if (ub == null || !(ub.getTipo().equals("cameriere"))) { %>
		<h3 class="red" style="font-family:avenir" align="center">Accedi come cameriere</h3>
	<% } else { %>

<%TavoloBean tb = (TavoloBean) session.getAttribute("tavolo"); %>
	 <!-- Validation -->
	 <script>
  	  function verify(errore) {
  	  	document.getElementById("ver").innerHTML = errore;
  	  }
  	  
      function validateForm() {
        var note = document.form.note;
        var tipo = document.form.tipo_portata;
        var portata = document.form.nome_portata;
        
        if(validationTipo(tipo) && validationPortata(portata) && validationNote(note)){
          	return true;
        } else {
         	return false;
        }
      }
      
      function validationTipo(tipo) {
    	  	var string = tipo.value;
    	  	var string2 = "seleziona tipo";
      	if (string == string2){
      		verify("Seleziona il tipo");
      		tipo_portata.focus();
        		return false;
        	} else {
           	return true;
        	}
  	  }
      
      function validationPortata(portata) {
  	  	var string = portata.value;
  	  	var string2 = "seleziona portata";
    	if (string == "" || string == string2){
    		verify("Selezionare la portata");
    		portata.focus();
      		return false;
      	} else {
         	return true;
      	}
	  }
      
      function validationNote(note) {
    	  
   	 	if (note.value.length > 0){
      		return true;
      	} else {
      		verify("Inserire correttamente le note");
         	note.focus();
         	return false;
      	}
	  }
      
      	$(document).ready(function() {
			$("#form").submit(function() {
				if (($("#menu").val()) == "none") {
			 		verify("Selezionare un menù");
			 		$("#menu").focus();
				}
			});
			
			$(".fist").on('click', function() {
				$(this).parent().submit();
			});
		});
      
    </script>
	<!-- ./Validation -->

	<script type="text/javascript">
	function chooseMenu(tipo){
		var xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange = function(){
			if(xhttp.readyState == 4 && xhttp.status == 200){
				//riferimento alla select con id "comuni"
				document.getElementById("nome_portata").innerHTML = xhttp.responseText;
			}
		};
		//URL lato server
		var menu = document.getElementById("menu").value;
		xhttp.open("GET","SelectMenu?tipo="+tipo+"&menu="+menu,true);
		xhttp.send();
	}
	</script>
	
	
	
	<!-- Breadcrumb -->
	<nav aria-label="breadcrumb">
	 	<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="">Home</a></li>
			<li class="breadcrumb-item"><a href="selezionaTavolo.jsp">Disposizione tavoli</a></li>
			<li class="breadcrumb-item active" aria-current="page">Gestione comanda</li>
		</ol>
	</nav>
<!-- ./Breadcrumb -->

	<div class="container my_satisfy">
		<div class="row">
			<div class="col-sm-6">
				<h3>Gestione comanda</h3>
			</div>
			<br>
			<div class="col-sm-6 text-right">
				<a href="cucina.jsp"><button class="button"><i class="glyphicon glyphicon-list-alt"></i> Cucina</button></a>
			</div>
		</div>
			<hr/>
	</div>
	
	<%
		Boolean message = (Boolean) request.getAttribute("message_cucina");
		if (message != null) {
	%>
			<div class="alert alert-danger">
				<strong>Errore!</strong> Impossibile inviare la comanda in cucina.
			</div>
	
	<%
		}
		if(tb != null) {
	%>

	<div class="row">
		<div class="container text-center my_avenir">
			<div class="col-md-4"></div>
			<div class="col-md-2">
				<!-- Numero tavolo -->
				<h4 class= "dark_brown"> Numero tavolo: <span class= "light_brown"><%= tb.getNumeroTavolo() %></span></h4>
				<!-- \.Numero tavolo -->
			</div>
			<div class="col-md-2">
				<!-- Numero persone -->
				<h4 class= "dark_brown"> Numero persone: <span class= "light_brown"><%=tb.getNumeroPersone() %></span></h4s>
				<!-- \.Numero persone -->
			</div>
			<div class="col-md-4"></div>
		</div>
	</div>
	<br>
	<!-- Inserimento portata comanda form -->
	<div class="container" style="font-family: avenir">
   		<form id="form" name="form" action="InserimentoPortataComanda" method="POST" onsubmit="return validateForm()">
			<div class = "row">
			<!-- Menù -->
				<div class="col-sm-2">
    					<div class="form-group dark_brown">
      					<label for="type">Menù:</label>
      						<% MenùManager mm = new MenùManager();
      							ArrayList<MenùBean> menus = new ArrayList<MenùBean>();
      							menus = mm.getMenùs();
      						%>
							<select class="form-control light_brown" id="menu">
								<option value="none">seleziona menù</option>
								<%for(int i = 0; i < menus.size(); i++){%>
									<option><%=menus.get(i).getNome()%></option>
								<%}%>
							</select>
    					</div>
    				</div>
			<!-- ./Menù --> 
				
			<!-- Tipo portata -->
				<div class="col-sm-3">
    					<div class="form-group dark_brown">
      					<label for="type">Tipo:</label>
							<select class="form-control light_brown" id="tipo_portata" value="tipo_portata" onchange ="chooseMenu(this.value)">
								<option>seleziona tipo</option>
								<option>Antipasto</option>
								<option>Primo</option>
								<option>Secondo</option>
								<option>Contorno</option>
								<option>Frutta</option>
								<option>Dessert</option>
								<option>Bevanda</option>
							</select>
   						</div>
    				</div>
			<!-- ./Tipo portata --> 
								
    			<!-- Portata -->
				<div class="col-sm-3">
    					<div class="form-group dark_brown">
      					<label for="type">Nome portata:</label>
							<select class="form-control light_brown" id="nome_portata" name ="nome_portata" value="nome_portata">
								<option>seleziona portata</option>
							</select>
							
   						</div>
    				</div>
			<!-- ./Portata --> 
			
			<!-- Quantità -->
				<div class="col-sm-1">
					<div class="form-group dark_brown">
	   				 	<label for="num_people">Quantità:</label>
	    					<input type="number" class="form-control light_brown" id="num_portate" name="num_portate" min="1" max="20" value="1">
				   </div>	
			   </div>						
    			<!-- \.Quantità -->	
				
			<!-- Note -->
				<div class="col-sm-3">
					<div class="form-group dark_brown">
						<label for="hour">Note:</label>
						<textarea class="form-control light_brown" rows="2" id="note" name ="notes"></textarea>
						<br>
						<span id="ver" class="red"></span>
	   				 </div>
	   			 </div>
			<!-- \.Note -->
			<input type = "hidden" name ="tavolo" value ="<%= tb.getNumeroTavolo() %>">
			</div>
			<br>
			<br>
			<!-- Bottone inserimento portata nella comanda -->
			<div class = "row">
				<div class="col-sm-5"></div>
				<div class="text-center col-sm-2">
					<div class=" text-center"> 
				    	<button  type="submit" id="inserimento_portata_comanda" class="btn btn-success">Inserisci portata</button> 
					</div>
				</div>
				<!-- /.Bottone inserimento portata nella comanda -->
				<%
					message = (Boolean) request.getAttribute("message_inserimento");
					if (message != null) {
				%>
					<div class="col-sm-2"></div>
						<div class="col-sm-3">
								<div class="alert alert-success">
			  						<strong>Successo!</strong> Portata inserita.
								</div>
						</div>
						
				 <% } %>
				 	<%
					message = (Boolean) request.getAttribute("message_modifica");
					if (message != null) {
				%>
					<div class="col-sm-2"></div>
						<div class="col-sm-3">
								<div class="alert alert-success">
			  						<strong>Successo!</strong> Portata modificata.
								</div>
						</div>
						
				 <% } %>
				 	<%
					message = (Boolean) request.getAttribute("message_rimozione");
					if (message != null) {
				%>
					<div class="col-sm-2"></div>
						<div class="col-sm-3">
								<div class="alert alert-success">
			  						<strong>Successo!</strong> Portata rimossa.
								</div>
						</div>
						
				 <% } %>
				 
				 
				 
			</div>
				
				
					
			
		</form>	
	</div>					
	<br>
	<!-- ./Inserimento portata comanda form -->
	
	<div class="container" style="font-family: avenir">
	<h3 class="dark_brown my_satisfy">Lista portate</h3>
	<hr>
	</div>
	
	<%ComandaBean cb = (ComandaBean) application.getAttribute("comanda"+tb.getNumeroTavolo());
		ArrayList<PortataComandaBean> portateComanda = cb.getPortateComanda();%>
		
	<%if(portateComanda.size() == 0) { %>
		<div class="container" style="font-family: avenir">
			<div class="alert alert-info">
	  			<strong>Info!</strong> Nessuna portata inserita.
			</div>
		</div>
	<% } else { %>
	<!-- Gestione ordine form form -->
	<div class="container text-centered" style="font-family: avenir">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
			<!-- Table -->
				<div class="table-responsive">
					<table class="table table-bordered">
						<thead>
							<tr>
								<th class="dark_brown text-center">Nome portata</th>
								<th class="dark_brown text-center">Quantita'</th>
								<th class="dark_brown text-center">Consegnato</th>
								<th class="dark_brown text-center"></th>
							</tr>
						</thead>
						
						<!--  Corpo table -->
						<tbody>
						
						<%for(PortataComandaBean pcb: portateComanda) { 
							int id = pcb.getPb().getIdPortata(); %>
							<tr>
								<!-- Nome portata comanda -->
								<td class="text-center"><%= pcb.getPb().getNome() %> </td>
								<!-- /.Nome portata comanda -->
								
								<!-- Quantità portata comanda -->
								<td class="text-center">
								<form action="ModificaPortataComanda" method="post">
									<input name="quantity" type="number" min="1" max="10" value="<%= pcb.getQuantità()%>">
									<button type="submit" class="btn btn-default btn-xs"><span class="glyphicon glyphicon-refresh"></span></button>
								<input type="hidden" name = "cliccatoQuantity" value= "1">
								<input type ="hidden"  name ="idPortata" value ="<%= id %>">
								</form>
								</td>
								
								<!-- /.Quantità portata comanda -->
								
								<!-- Stato portata comanda -->
								<td class="text-center">
								<form action ="ModificaPortataComanda" method="post">
							<%if(pcb.isConsegnato()){ %>						
										<span class = "fist"><input type="checkbox"   checked data-toggle="toggle" data-onstyle="success" data-offstyle="danger" data-on="si" data-off="no">	</span>	
										<input type="hidden" name ="green"  value="green">
									<%} else { %>	
										<span class = "fist"><input type="checkbox" data-toggle="toggle" data-onstyle="success" data-offstyle="danger" data-on="si" data-off="no"></span>
										<input type="hidden" name = "red" value="red">
									<%} %>
									<input type="hidden" name = "cliccatoStato" value= "1">
									<input type ="hidden"  name ="idPortata" value ="<%= id %>">
								</form>
								
								</td>
								<!-- /.Stato portata comanda -->
								
								<!-- Rimozione portata comanda -->
								<td class="text-center">
									<form action="RimozionePortataComanda" method="post">
						        			<input type="hidden" name="remove" value="<%= id %>">
						        			<button type="submit" class="btn btn-danger">Rimuovi</button>
						        		</form>
								</td>
								<!-- /.Rimozione portata comanda -->
								
							</tr>
							<% } %>
						</tbody>
						<!--  /.corpo table -->
				
					</table>
				</div>
			<!-- Table -->
			</div>
		</div>
		<div class="col-md-2"></div>
	</div>
	
		
	<div class ="row style="font-family: avenir"">
		<div class="col-md-2"></div>
		<!-- Bottone conferma ordine -->
			<div class="col-md-4">
				<form action="anteprimaOrdine.jsp" method="POST">
					<div class="text-center"> 
			    			<button id="anteprima_ordine" class="btn btn-success">Anteprima ordine</button> 
			    			<input type="hidden" name ="tavolo" value = "<%= tb.getNumeroTavolo()%>">
					</div>
				</form>
			<br>
		<!-- Bottone conferma ordine -->
			</div>
		<!-- Bottone invia comanda -->
		<div class="col-md-4">
			<form action="InviaComanda" method="POST">
				<div class=" text-center"> 
		    			<button id="invia_comanda" class="btn btn-success">Invia comanda</button> 
				</div>
			</form>
		<!-- Bottone invia comanda -->
		</div>
		<div class="col-md-2"></div>
	</div>
	<!-- ./Gestione ordine form form -->
			<% } %>
	<%
			}
		}
	%>
	<br>
	<br>
<%@ include file="footer.jsp" %>