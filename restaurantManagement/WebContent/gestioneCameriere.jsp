<%@ page import="java.util.ArrayList" %>

<%@ include file="header.jsp" %>

<!-- Breadcrumb -->
<nav aria-label="breadcrumb">
 	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="index.jsp">Home</a></li>
		<li class="breadcrumb-item"><a href="areaPersonaleGestore.jsp">Area personale</a></li>
		<li class="breadcrumb-item active" aria-current="page">Gestione cameriere</li>
	</ol>
</nav>
<!-- ./Breadcrumb -->

<div class="container my_satisfy">
	<h3 class="dark_brown">Gestione cameriere</h3>
	<hr/>
</div>
<div align="center" class = "my_avenir">
	<a href="inserimentoCameriere.jsp" class="btn btn-default">Inserisci cameriere</a>
</div>
<br>

<%
	String message = (String) request.getAttribute("message");
	if (message != null) {
%>		
		<div class="container my_avenir">
			<div class="alert alert-success">
				<strong>Successo!</strong> <%= message %>
			</div>
		</div>
 <% } %>

<%
	Boolean message_rimozione = (Boolean) request.getAttribute("message_rimozione");
	if (message_rimozione != null) {
%>		
		<div class="container my_avenir">
	<% if (!message_rimozione) { %>
			<div class="alert alert-danger">
				<strong>Errore!</strong> Impossibile eliminare il cameriere.
			</div>
	<% } else { %>
			<div class="alert alert-success">
				<strong>Successo!</strong> Cameriere eliminato correttamente.
			</div>
	<% } %>
		</div>
 <% } %>

<!-- Tabella cameriere -->
<div class="container my_avenir">
	<div class = "row">
	<div class = "col-sm-3"></div>
	<div class = "col-sm-6">
		<%
			ArrayList<UtenteBean> camerieri = (ArrayList<UtenteBean>) request.getAttribute("camerieri");
			if (camerieri != null && (camerieri.size()) >= 1) {
		%>
			<table class="table">
				<thead>
					<tr>
						<th>Cameriere</th>
						<th>Modifica/Rimuovi</th>
					</tr>
				</thead>
				<tbody>
				<%
					int size = camerieri.size();
					for (int i = 0; i < size; i++) {
						UtenteBean cameriere = camerieri.get(i);
				%>
						<tr>
							<td><%= cameriere.getNome() + " " + cameriere.getCognome() %></td>
							<td>
								<a href=<%= "modificaCameriere.jsp?usr=" + cameriere.getUsername() %> class="btn btn-default">Modifica</a>
								<a href=<%= "RimozioneCameriere?usr=" + cameriere.getUsername() %> class="btn btn-danger">Rimuovi</a>
							</td>	
						</tr>
				 <% } %>
				</tbody>
			</table>
		 <% } %>
	</div>
	<div class = "col-sm-3"></div>
	</div>
	
</div>
<!-- ./Tabella cameriere -->

<%@ include file="footer.jsp" %>