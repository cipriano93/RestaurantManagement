<%@ page import="java.util.ArrayList, modelGestioneComanda.OrdineBean" %>

<%@ include file = "header.jsp" %>

<style>
		#prenotazioni {
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
		
		.dropbtn {
			background-color: #4CAF50;
		  	color: white;
		  	padding: 10px;
		  	font-size: 10px;
		  	border: none;
		}
		
		.dropdown {
			position: center;
			display: inline-block;
		}
		
		.dropdown-content {
			display: none;
		  	position: absolute;
		  	background-color: #f1f1f1;
		  	min-width: 160px;
		  	box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
		  	z-index: 1;
		}
		
		.dropdown-content a {
			color: black;
		  	padding: 12px 16px;
		  	text-decoration: none;
		  	display: block;
		}
		
		.dropdown-content a:hover { background-color: #ddd; }
		
		.dropdown:hover .dropdown-content { display: block; }
		
		.dropdown:hover .dropbtn { background-color: #3e8e41; }
</style>

<!-- Breadcrumb -->
	<ul class="breadcrumb">
		<li><a href="#">Home</a></li>
		<li class="breadcrumb-item"><a href="areaPersonaleGestore.jsp">Area personale</a></li>
		<li class="breadcrumb-item active" aria-current="page">Visualizza bilancio</li>
	</ul>
<!-- Breadcrumb -->


<div class="container">
	<h3 class="dark_brown">Visualizza bilancio</h3>
	<hr>
	
	<%
		ArrayList<OrdineBean> ordini = (ArrayList<OrdineBean>) session.getAttribute("ordini");
		if (ordini == null) {
	%>
			<div class="alert alert-info">
				<strong>Info!</strong> Nessun ordine effettuato finora.
			</div>
	 <% } else { %>
		
			<form action="#" method="GET">
				<div align="center">
		   			<span class="dark_brown">Filtra per:</span>
		   			<select name="orderBy" onchange="this.form.submit()">
		   				<option></option>
		  				<option value="giorno">Ultimi giorni</option>
		   				<option value="mese">Ultimo mese</option>
		    			<option value="anno">Ultimo anno</option>
		
		  			</select>
		  		</div>
			</form>
			
			<table id="prenotazioni" class="text-center">
						<tr>
							<th style="text-align: center">Data</th>
							<th style="text-align: center">N.coperti</th>
							<th style="text-align: center">Totale</th>
						</tr>
			
			<%
				int size = ordini.size();
				for (int i = 0; i < size; i++) {
					OrdineBean ob = ordini.get(i);
			%>
					<tr>
						<td><%= ob.getData() %></td>
						<td><%= ob.getNumCoperti() %></td>
						<td><%= ob.getTotale() %></td>
					</tr>
					
			<% } %>
			</table>
	 <% } %>
</div>

<%@ include file="footer.jsp" %>