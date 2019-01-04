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
	<a href="inserimentoMenù.jsp" class="btn btn-default">Inserisci menù</a>
</div>

<!-- Tabella menù -->
<div class="container">

	<%
		String message = (String) request.getAttribute("message");
		if (message != null) { 
	%>
			<div class="alert alert-success">
  				<strong>Menù inserito!</strong> <%= message %>.
			</div>
	<%	}
		ArrayList<MenùBean> ms = (ArrayList<MenùBean>) request.getAttribute("menùs");
		if (ms == null) {
	%>
			<h3>Nessun menù inserito</h3>
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
						<a href="rimuovi_menù" class="btn btn-danger">Rimuovi</a>
					</td>
				</tr>
			</tbody>
		<%	}	%>
	<%	}	%>
		
	</table>
</div>
<!-- ./Tabella menù -->

<%@ include file="footer.jsp" %>