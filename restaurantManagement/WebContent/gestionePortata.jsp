<%@ include file="header.jsp" %>

<!-- Breadcrumb -->
<nav aria-label="breadcrumb">
 	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="">Home</a></li>
		<li class="breadcrumb-item active" aria-current="page">Gestione portata</li>
	</ol>
</nav>
<!-- ./Breadcrumb -->

<div class="container">
	<h3 class="dark_brown">Gestione portata</h3>
	<hr/>
</div>
<div align="center">
	Menù "Mare"<a href="modificaNomeMenù.jsp">rinomina</a>
</div>
<br>
<div align="center">
	<a href="inserimentoPortata.jsp" class="btn btn-default">Inserisci portata</a>
</div>

<!-- Tabella portata -->
<div class="container">
	<table class="table">
		<thead>
			<tr>
				<th>Portata</th>
				<th>Modifica/Rimuovi</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Portata 1</td>
				<td>
					<a href="modificaPortata.jsp" class="btn btn-default">Modifica</a>
					<a href="#" class="btn btn-danger">Rimuovi</a>
				</td>
			</tr>
		</tbody>
	</table>
</div>
<!-- ./Tabella portata -->

<%@ include file="footer.jsp" %>