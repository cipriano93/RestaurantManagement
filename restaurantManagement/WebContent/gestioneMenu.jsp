<%@ include file="header.jsp" %>

<%@ page import="java.util.ArrayList, modelGestioneMenù.MenùBean" %>

<!-- Breadcrumb -->
<nav aria-label="breadcrumb">
 	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="">Home</a></li>
		<li class="breadcrumb-item"><a href="areaPersonaleGestore.jsp">Area peronale</a></li>
		<li class="breadcrumb-item active" aria-current="page">Gestione menù</li>
	</ol>
</nav>
<!-- ./Breadcrumb -->

<div class="container">
	<h3 class="dark_brown">Gestione menù</h3>
	<hr/>
</div>
<div align="center">
	<a href="inserimentoMenu.jsp" class="btn btn-default">Inserisci menù</a>
</div>
<br>

<!-- Tabella menù -->
<div class="container">

	<%
		String message = (String) request.getAttribute("message");
		if (message != null) { 
	%>
			<div class="alert alert-success">
  				<strong>Menù:</strong> <%= message %>
			</div>
	<%	}
		ArrayList<MenùBean> ms = (ArrayList<MenùBean>) request.getAttribute("menùs");
		if (ms == null || (ms.size()) == 0) {
	%>
			<div class="alert alert-info">
  				<strong>Info!</strong> Nessun menù inserito.
			</div>
	<%	} else {	%>
			<table class="table">
				<thead>
					<tr>
						<th>Menù</th>
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
						<a href="<%= "rimuovimenu?id=" + ms.get(i).getIdMenù() %>" class="btn btn-danger">Rimuovi</a>
					</td>
				</tr>
			</tbody>
		<%	}	%>
	<%	}	%>
		
	</table>
</div>
<!-- ./Tabella menù -->

<%@ include file="footer.jsp" %>