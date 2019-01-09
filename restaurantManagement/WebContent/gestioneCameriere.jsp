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

<div class="container">
	<h3 class="dark_brown">Gestione cameriere</h3>
	<hr/>
</div>
<div align="center">
	<a href="inserimentoCameriere.jsp" class="btn btn-default">Inserisci cameriere</a>
</div>
<br>

<!-- Tabella cameriere -->
<div class="container">
	<div class = "row">
	<div class = "col-sm-3"></div>
	<div class = "col-sm-6">
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
	<div class = "col-sm-3"></div>
	</div>
	
</div>
<!-- ./Tabella cameriere -->

<%@ include file="footer.jsp" %>