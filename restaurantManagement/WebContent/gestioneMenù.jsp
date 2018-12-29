<%@ include file="header.jsp" %>

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
	<a href="inserimentoMen�.jsp" class="btn btn-default">Inserisci men�</a>
</div>

<!-- Tabella men� -->
<div class="container">
	<table class="table">
		<thead>
			<tr>
				<th>Men�</th>
				<th>Modifica/Rimuovi</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Men� 1</td>
				<td>
					<a href="gestionePortata.jsp" class="btn btn-default">Modifica</a>
					<a href="#" class="btn btn-danger">Rimuovi</a>
				</td>
			</tr>
		</tbody>
	</table>
</div>
<!-- ./Tabella men� -->

<%@ include file="footer.jsp" %>