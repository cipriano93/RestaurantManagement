<%@ include file="heading.jsp" %>

<!-- Breadcrumb -->
<nav aria-label="breadcrumb">
 	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="">Home</a></li>
		<li class="breadcrumb-item active" aria-current="page">Gestione menù</li>
	</ol>
</nav>
<!-- ./Breadcrumb -->

<div class="container">
	<h3 class="dark_brown">Gestione menù</h3>
	<hr/>
</div>

<!-- Table menù -->
<div class="container">
	<table class="table">
		<thead>
			<tr>
				<th>Menù</th>
				<th>Modifica/Rimuovi</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Test</td>
				<td>
					<a href="#" class="btn btn-default">Modifica dati</a>
					<a href="#" class="btn btn-default">Modifica</a>
					<a href="#" class="btn btn-default">Rimuovi</a>
				</td>
			</tr>
		</tbody>
	</table>
</div>
<!-- ./Table menù -->

<%@ include file="footer.jsp" %>