<%@ include file="header.jsp" %>

<%@ page import="java.util.ArrayList, modelGestioneMen�.Men�Bean" %>

<!-- Breadcrumb -->
<nav aria-label="breadcrumb">
 	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="">Home</a></li>
		<li class="breadcrumb-item"><a href="areaPersonaleGestore.jsp">Area peronale</a></li>
		<li class="breadcrumb-item active" aria-current="page">Gestione men�</li>
	</ol>
</nav>
<!-- ./Breadcrumb -->

<div class="container">
	<h3 class="dark_brown">Gestione men�</h3>
	<hr/>
</div>
<div align="center">
	<a href="inserimentoMenu.jsp" class="btn btn-default">Inserisci men�</a>
</div>
<br>

<!-- Tabella men� -->
<div class="container">

	<%
		String message = (String) request.getAttribute("message");
		if (message != null) { 
	%>
			<div class="alert alert-success">
  				<strong>Men�:</strong> <%= message %>
			</div>
	<%	}
		ArrayList<Men�Bean> ms = (ArrayList<Men�Bean>) request.getAttribute("men�s");
		if (ms == null || (ms.size()) == 0) {
	%>
			<div class="alert alert-info">
  				<strong>Info!</strong> Nessun men� inserito.
			</div>
	<%	} else {	%>
			<table class="table">
				<thead>
					<tr>
						<th>Men�</th>
						<th>Modifica/Rimuovi</th>
					</tr>
				</thead>
	<% 
			int size = ms.size();
			for (int i = 0; i < size; i++) {
	%>
				<tbody>
				<tr>
					<td><%= ms.get(i).getNome() %></td>
					<td>
						<a href="gestionePortata.jsp" class="btn btn-default">Modifica</a>
						<a href="<%= "rimuovimenu?id=" + ms.get(i).getIdMen�() %>" class="btn btn-danger">Rimuovi</a>
					</td>
				</tr>
			</tbody>
		<%	}	%>
	<%	}	%>
		
	</table>
</div>
<!-- ./Tabella men� -->

<%@ include file="footer.jsp" %>