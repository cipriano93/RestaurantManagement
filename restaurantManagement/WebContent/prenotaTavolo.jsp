<%@ include file="header.jsp" %>

<script type="text/javascript">
function verify(errore) {
	document.getElementById("ver").innerHTML = errore;
}

function validateForm() {
	var date = document.form.date.value;
	var time = document.form.time.value;
	var tel = document.form.tel.value;
	if (!(validateDate(date)) || !(validateTime(time)) || !(validateTel(tel)))
		return false;
	else
		return true;
}

function validateDate(date) {
	var d = new Date();
	var year_now = d.getFullYear(), month_now = d.getMonth() + 1, day_now = d.getDate();
	var year = date.substring(0, 4), month = date.substring(5, 7), day = date.substring(8, 10);
	if (year < year_now || month < month_now || day < day_now) {
		verify("Inserire una data corretta");
		return false;
	}
	return true;
}

function validateTime(time) {
	var h = new Date();
	var hour_now = h.getHours(), minutes_now = h.getMinutes();
	var hour = time.substring(0, 2), minutes = time.substring(3, 5);
	if (hour < hour_now || (hour == hour_now && minutes < minutes_now)) {
		verify("Inserire un'ora corretta");
		return false;
	}
	return true;
}

function validateTel(tel) {
	var tel_format = /^[0-9]{10}$/;
	if (!(tel.match(tel_format))) {
		verify("Inserire un numero di cellulare corretto");
		return false;
	} else
		return true;
}
</script>

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
	<form name="form" action="PrenotaTavolo" method="post" onsubmit="return validateForm()">
		<div class="form-group">
			<label for="date">Data:</label>
		    <input type="date" class="light_brown" id="date" name="date">
		</div> 
		<div class="form-group">
	      <label for="hour">Ora:</label>
	      <input type="time" class="light_brown" id="time" name="time">
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
		<p id="ver" class="red"></p>
	    <button type="submit" class="btn btn-success">Prenota</button>
  </form>
</div>
<!-- ./Prenotazione tavolo -->

<br>
	
	<div class="footer">	<%@ include file="footer.jsp" %> </div>
	