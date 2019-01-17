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
	<h3 class="dark_brown" style="font-family: satisfy">Prenota tavolo</h3>
	<hr/>
</div>


<!-- Prenotazione tavolo -->
<div class="container my_avenir">
	<form action="PrenotaTavolo" method="post">
		<div class="form-group">
			<label for="date">Seleziona data:</label>
		    <input type="date" class="form-control light_brown" id="date" name="date">
		</div> 
		<div class="form-group">
	      <label for="hour">Ora:</label>
	      <input type="time" class="form-control light_brown" id="hour" name="hour">
	    </div>
	    <div class="form-group">
	    	<label for="num_people">Numero persone:</label>
	      	<input type="number" class="form-control light_brown" id="num_people" name="num_people" min="1" max="20" value="1">
	    </div>
	    <div class="form-group">
	    	<label for="tel">Numero di cellulare:</label>
	      	<input type="tel" class="form-control light_brown" id="tel" name="tel">
	    </div>
	    <div class="form-group">
  			<label for="note">Note:</label>
  			<textarea class="form-control light_brown" rows="5" name="note"></textarea>
		</div> 

	    <button type="submit" class="btn btn-success">Prenota</button>
  </form>
</div>
<!-- ./Prenotazione tavolo -->

<br>
	
	<div class="footer">	<%@ include file="footer.jsp" %> </div>
	