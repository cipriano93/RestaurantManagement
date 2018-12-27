<%@ include file="header.jsp" %>

<script>
$(document).ready(function(){
  $('[data-toggle="popover"]').popover();
});
</script>

<!-- Breadcrumb -->
<nav aria-label="breadcrumb">
 	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="">Home</a></li>
		<li class="breadcrumb-item active" aria-current="page">Anteprima conto</li>
	</ol>
</nav>
<!-- ./Breadcrumb -->

<div class="container">
	<h3 class="dark_brown">Anteprima conto</h3>
	<hr/>
</div>
<div align="center">
	<strong>Ordine tavolo n.10</strong>
</div>

<!-- Tabella menù -->
<div class="container">
	<table class="table">
		<thead>
			<tr>
				<th>Portata</th>
				<th>Quantit&agrave;</th>
				<th>Prezzo</th>
				<th>Totale</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Spaghetti buoni</td>
				<td>4</td>
				<td>&euro;9</td>
				<td>&euro;36</td>
			</tr>
		</tbody>
	</table>
	<div align="center">
		<strong>Totale &euro;98.5</strong>
	</div>
	<div align="right">
		<a href="#" class="btn btn-default" data-toggle="popover" data-content="Ottimo lavoro, Andrea. L'ordine &egrave; stato inviato alla cassa">Conferma ordine</a>
	</div>
</div>
<!-- ./Tabella menù -->

<%@ include file="footer.jsp" %>