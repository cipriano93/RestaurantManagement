<%@ include file="header.jsp" %>

<!-- Breadcrumb -->
<nav aria-label="breadcrumb">
 	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="">Home</a></li>
		<li class="breadcrumb-item active" aria-current="page">Prenotazione tavolo</li>
	</ol>
</nav>
<!-- ./Breadcrumb -->

<div class="container">
	<h3 class="dark_brown">Prenota tavolo</h3>
	<hr/>
</div>

<!-- Prenotazione tavolo -->
<div class="container">
	<form action="">
		<div class="form-group">
			<label for="date">Seleziona data:</label>
		    <input type="date" id="date" name="date">
		</div>
		<div class="form-group">
	      <label for="hour">Ora:</label>
	      <input type="time" id="hour" name="hour">
	    </div>
	    <div class="form-group">
	    	<label for="num_people">Numero persone:</label>
	      	<input type="number" id="num_people" name="num_people" min="1" max="20">
	    </div>
	    <div class="form-group">
	    	<label for="tel">Numero di cellulare:</label>
	      	<input type="tel" id="tel" name="tel">
	    </div>
	    <div class="form-group">
  			<label for="note">Note:</label>
  			<textarea class="form-control" rows="5" id="note"></textarea>
		</div> 
	    <button type="submit" class="btn btn-default">Prenota</button>
  </form>
</div>
<!-- ./Prenotazione tavolo -->