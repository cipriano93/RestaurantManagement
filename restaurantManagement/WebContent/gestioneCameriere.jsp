<%@ include file="header.jsp" %>

<!-- Breadcrumb -->
<nav aria-label="breadcrumb">
 	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="">Home</a></li>
		<li class="breadcrumb-item active" aria-current="page">Gestione cameriere</li>
	</ol>
</nav>
<!-- ./Breadcrumb -->

<div class="container">
	<h3 class="dark_brown">Gestione cameriere</h3>
	<hr/>
</div>
<div align="center">
	<a href="inserimentoPortata.jsp" class="btn btn-default">Inserisci cameriere</a>
</div>

<!-- Tabella cameriere -->
<div class="container">
	<table class="table">
		<thead>
			<tr>
				<th>Cameriere</th>
				<th>Modifica/Rimuovi</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Cameriere x</td>
				<td>
					<a href="modificaCameriere.jsp" class="btn btn-default">Modifica</a>
					<a href="#" class="btn btn-danger">Rimuovi</a>
				</td>
			</tr>
		</tbody>
	</table>
</div>
<!-- ./Tabella cameriere -->

<%@ include file="footer.jsp" %>