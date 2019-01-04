<%@ include file="header.jsp" %>

<%@ page import="java.util.ArrayList, modelGestioneMenù.PortataBean" %>

<!-- Breadcrumb -->
<nav aria-label="breadcrumb">
 	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="">Home</a></li>
		<li class="breadcrumb-item"><a href="areaPersonaleGestore.jsp">Area peronale</a></li>
		<li class="breadcrumb-item"><a href="getmenus">Gestione menù</a></li>
		<li class="breadcrumb-item active" aria-current="page">Gestione portata</li>
	</ol>
</nav>
<!-- ./Breadcrumb -->

<div class="container">
	<h3 class="dark_brown">Gestione portata</h3>
	<hr/>
</div>
<div align="center">
	Menù "<%= session.getAttribute("name_menù") %>" <a href="modificaNomeMenu.jsp">rinomina</a>
</div>
<br>
<div align="center">
	<a href="inserimentoPortata.jsp" class="btn btn-default">Inserisci portata</a>
</div>
<br>
<div class="container">
	<%
		String message = (String) request.getAttribute("message_danger");
		if (message != null) { 
	%>
			<div class="alert alert-danger">
	  			<strong>Portata:</strong> <%= message %>
			</div>
	<%	}
		message = (String) request.getAttribute("message_success");
		if (message != null) { 
	%>
			<div class="alert alert-success">
	  			<strong>Portata:</strong> <%= message %>
			</div>
	<%	}
		message = (String) request.getAttribute("message");
		if (message != null) { 
	%>
			<div class="alert alert-success">
	  			<strong>Portata:</strong> <%= message %>
			</div>
	<%	}
		String menù = (String) request.getAttribute("menù");
		if (menù != null) {
			%>
			<div class="alert alert-success">
	  			<strong>Menù:</strong> <%= menù %>
			</div>
	<%	}
		ArrayList<PortataBean> pbs = (ArrayList<PortataBean>) request.getAttribute("portate");
		if (pbs == null || (pbs.size()) == 0) {
	%>
			<div class="alert alert-info">
	  			<strong>Info!</strong> Nessuna portata inserita.
			</div>

<!-- Tabella portata -->
	<%	} else {	%>
			<table class="table">
				<thead>
					<tr>
						<th>Portata</th>
						<th>Modifica/Rimuovi</th>
					</tr>
				</thead>
				<% 
					int size = pbs.size();
					for (int i = 0; i < size; i++) {
						int id = pbs.get(i).getIdPortata();
				%>
						<tbody>
							<tr>
								<td><%= pbs.get(i).getNome() %></td>
								<td>
									<a href="<%= "modificaPortata.jsp?idportata=" + id %>" class="btn btn-default">Modifica</a>
									<a href="<%= "rimuoviportata?idportata=" + id %>" class="btn btn-danger">Rimuovi</a>
								</td>
							</tr>
						</tbody>
				<%	}	%>
			</table>
	<%	}	%>
<!-- ./Tabella portata -->
</div>

<%@ include file="footer.jsp" %>