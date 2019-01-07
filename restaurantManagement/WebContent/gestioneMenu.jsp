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
<div class="container">
	<%
		String message = (String) request.getAttribute("message_danger");
		if (message != null) { 
	%>
			<div class="alert alert-danger">
		  		<strong>Errore!</strong> <%= message %>
			</div>
	<%	}
		message = (String) request.getAttribute("message_success");
		if (message != null) { 
	%>
			<div class="alert alert-success">
		  		<strong>Successo!</strong> <%= message %>
			</div>
	<%	}
		ArrayList<Men�Bean> mbs = (ArrayList<Men�Bean>) request.getAttribute("men�s");
		if (mbs == null || (mbs.size()) == 0) {
	%>
			<div class="alert alert-info">
	  			<strong>Info!</strong> Nessun men� inserito.
			</div>
			
<!-- Tabella men� -->
	<%	} else {	%>
			<table class="table">
				<thead>
					<tr>
						<th>Men�</th>
						<th>Modifica/Rimuovi</th>
					</tr>
				</thead>
				<% 
					int size = mbs.size();
					for (int i = 0; i < size; i++) {
						int id = mbs.get(i).getIdMen�();
				%>
						<tbody>
							<tr>
								<td><%= mbs.get(i).getNome() %></td>
								<td>
									<a href="<%= "getportate?idmenu=" + id + "&namemenu=" + mbs.get(i).getNome()  %>" class="btn btn-default">Modifica</a>
									<a href="<%= "rimuovimenu?idmenu=" + id %>" class="btn btn-danger">Rimuovi</a>
								</td>
							</tr>
						</tbody>
				<%	}	%>	
			</table>
	<%	}	%>
<!-- ./Tabella men� -->
</div>

<%@ include file="footer.jsp" %>