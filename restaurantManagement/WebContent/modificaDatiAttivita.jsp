<%@ include file="header.jsp" %>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>


<script>
	function verifica(errore){
		document.getElementById("ver").innerHTML = errore;
	}	
	
 	function validateForm(){
   		var name = document.form.name;
   		var address = document.form.address;
   		var num_civ = document.form.num_civ;
   		var p_iva = document.form.iva;
   		var tel = document.form.tel;
   		if(validationName(name) && validationPartitaIVA(p_iva) && validationAddress(address) && validationNumCivico(num_civ) && validationTel(tel)){
     		return true;
   		} else {
     		return false;
		}
 	}
 	
 	function validationName(name) {
   		var nameformat = /^[a-zA-Z ]+$/;
   		if(name.value.match(nameformat)){
     		return true;
   		} else {
     		verifica("Inserire correttamente il nome");
			name.focus();
			return false;
		}
 	}
 	
 	function validationAddress(address) {
 		var addressformat = /^[a-zA-Z ]+$/;
   		if(address.value.match(addressformat)){
     		return true;
   		} else {
    		verifica("Inserire correttamente l'indirizzo");
     		address.focus();
     		return false;
		}
 	}
 	
 	function validationNumCivico(num_civ) {
 		var num_civ_format = /^[0-9]+$/;
   		if(num_civ.value.match(num_civ_format)) {
     		return true;
   		} else {
    		verifica("Inserire correttamente il numero civico");
     		num_civ.focus();
     		return false;
		}
 	}
 	
 	function validationPartitaIVA(p_iva) {
 		var p_iva_format = /^[0-9]{11}$/;
   		if(p_iva.value.match(p_iva_format)) {
     		return true;
   		} else {
    		verifica("Inserire correttamente la partita iva");
     		iva.focus();
     		return false;
		}
 	}
 	
 	function validationTel(tel) {
 		var telformat = /^[0-9]{9}$/;
   		if(tel.value.match(telformat)) {
     		return true;
   		} else {
    		verifica("Inserire correttamente il telefono");
     		tel.focus();
     		return false;
		}
 	}
</script>

<style>
/* Three image containers (use 25% for four, and 50% for two, etc) */
.column {
  float: left;
  width: 50%;
  padding: 5px;
}

/* Clear floats after image containers */
.row::after {
  content: "";
  clear: both;
  display: table;
}
button {
	margin-top:15px;
}
</style>

<!-- Breadcrumb -->
<nav aria-label="breadcrumb">
 	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="">Home</a></li>
		<li class="breadcrumb-item"><a href="areaPersonaleGestore.jsp">Area personale</a></li>
		<li class="breadcrumb-item active" aria-current="page">Modifica dati attività</li>
	</ol>
</nav>
<!-- ./Breadcrumb -->

<div class="container my_satisfy">
	<h3 class="dark_brown">Modifica dati attività</h3>
	<hr />
</div>

<%
	Boolean message = (Boolean) request.getAttribute("message");
	if (message != null) {
%>
		<div class="container my_avenir">
			<div class="alert alert-danger">
				<strong>Attenzione!</strong> Impossibile modificare i dati dell'attività.
			</div>
		</div> 
 <% } %>
	
<!-- Modifica dati attività form -->
<div class="container my_avenir">
<form name="form" action="ModificaDatiAttivita" onsubmit="return validateForm()" method="POST">
<div class="row" >
		<div class="column" >
			<label class="dark_brown" for="name">Nome:</label>
		    <input type="text" class="form-control light_brown" id="name" placeholder="Inserisci il nome" name="name">
	    </div>
	  
	   	<div class="column">
	   		<label class="dark_brown" for="address">P.IVA:</label>
	      	<input type="text" class="form-control light_brown" id="iva" placeholder="Inserisci la P. IVA" name="iva">
	   	</div>
	    
	   	</div>
	   	
	   	<div class="row">
	   	<div class="column" >
	   		<label for="address">Provincia:</label>
	      	<select class="form-control" id="provincia" name="provincia">
	      	<option></option>
	<option value="ag">Agrigento</option>
	<option value="al">Alessandria</option>
	<option value="an">Ancona</option>
	<option value="ao">Aosta</option>
	<option value="ar">Arezzo</option>
	<option value="ap">Ascoli Piceno</option>
	<option value="at">Asti</option>
	<option value="av">Avellino</option>
	<option value="ba">Bari</option>
	<option value="bt">Barletta-Andria-Trani</option>
	<option value="bl">Belluno</option>
	<option value="bn">Benevento</option>
	<option value="bg">Bergamo</option>
	<option value="bi">Biella</option>
	<option value="bo">Bologna</option>
	<option value="bz">Bolzano</option>
	<option value="bs">Brescia</option>
	<option value="br">Brindisi</option>
	<option value="ca">Cagliari</option>
	<option value="cl">Caltanissetta</option>
	<option value="cb">Campobasso</option>
	<option value="ci">Carbonia-iglesias</option>
	<option value="ce">Caserta</option>
	<option value="ct">Catania</option>
	<option value="cz">Catanzaro</option>
	<option value="ch">Chieti</option>
	<option value="co">Como</option>
	<option value="cs">Cosenza</option>
	<option value="cr">Cremona</option>
	<option value="kr">Crotone</option>
	<option value="cn">Cuneo</option>
	<option value="en">Enna</option>
	<option value="fm">Fermo</option>
	<option value="fe">Ferrara</option>
	<option value="fi">Firenze</option>
	<option value="fg">Foggia</option>
	<option value="fc">Forl&igrave;-Cesena</option>
	<option value="fr">Frosinone</option>
	<option value="ge">Genova</option>
	<option value="go">Gorizia</option>
	<option value="gr">Grosseto</option>
	<option value="im">Imperia</option>
	<option value="is">Isernia</option>
	<option value="sp">La spezia</option>
	<option value="aq">L'aquila</option>
	<option value="lt">Latina</option>
	<option value="le">Lecce</option>
	<option value="lc">Lecco</option>
	<option value="li">Livorno</option>
	<option value="lo">Lodi</option>
	<option value="lu">Lucca</option>
	<option value="mc">Macerata</option>
	<option value="mn">Mantova</option>
	<option value="ms">Massa-Carrara</option>
	<option value="mt">Matera</option>
	<option value="vs">Medio Campidano</option>
	<option value="me">Messina</option>
	<option value="mi">Milano</option>
	<option value="mo">Modena</option>
	<option value="mb">Monza e della Brianza</option>
	<option value="na">Napoli</option>
	<option value="no">Novara</option>
	<option value="nu">Nuoro</option>
	<option value="og">Ogliastra</option>
	<option value="ot">Olbia-Tempio</option>
	<option value="or">Oristano</option>
	<option value="pd">Padova</option>
	<option value="pa">Palermo</option>
	<option value="pr">Parma</option>
	<option value="pv">Pavia</option>
	<option value="pg">Perugia</option>
	<option value="pu">Pesaro e Urbino</option>
	<option value="pe">Pescara</option>
	<option value="pc">Piacenza</option>
	<option value="pi">Pisa</option>
	<option value="pt">Pistoia</option>
	<option value="pn">Pordenone</option>
	<option value="pz">Potenza</option>
	<option value="po">Prato</option>
	<option value="rg">Ragusa</option>
	<option value="ra">Ravenna</option>
	<option value="rc">Reggio di Calabria</option>
	<option value="re">Reggio nell'Emilia</option>
	<option value="ri">Rieti</option>
	<option value="rn">Rimini</option>
	<option value="rm">Roma</option>
	<option value="ro">Rovigo</option>
	<option value="sa">Salerno</option>
	<option value="ss">Sassari</option>
	<option value="sv">Savona</option>
	<option value="si">Siena</option>
	<option value="sr">Siracusa</option>
	<option value="so">Sondrio</option>
	<option value="ta">Taranto</option>
	<option value="te">Teramo</option>
	<option value="tr">Terni</option>
	<option value="to">Torino</option>
	<option value="tp">Trapani</option>
	<option value="tn">Trento</option>
	<option value="tv">Treviso</option>
	<option value="ts">Trieste</option>
	<option value="ud">Udine</option>
	<option value="va">Varese</option>
	<option value="ve">Venezia</option>
	<option value="vb">Verbano-Cusio-Ossola</option>
	<option value="vc">Vercelli</option>
	<option value="vr">Verona</option>
	<option value="vv">Vibo valentia</option>
	<option value="vi">Vicenza</option>
	<option value="vt">Viterbo</option>
</select>
	   	</div>
	   
	   <div class="column">
	   		<label for="citta">Citta':</label>
	   		<select class="form-control" id="citta" name="citta">
	   		<option></option>
	   		<option>Aiello del Sabato</option>
	   		<option>Altavilla Irpina</option>
	   		<option>Andretta</option>
	   		<option>Aquilonia</option>
	   		<option>Ariano Irpino</option>
	   		<option>Atripalda</option>
	   		<option>Avella</option>
	   		<option>Avellino</option>
	   		<option>Bagnoli Irpino</option>
	   		<option>Baiano</option>
	   		<option>Bisaccia</option>
	   		<option>Bonito</option>
	   		<option>Cairano</option>
	   		<option>Calabritto</option>
	   		<option>Calitri</option>
	   		<option>Candida</option>
	   		<option>Caposele</option>
	   		<option>Capriglia Irpina</option>
	   		<option>Carife</option>
	   		<option>Casalbore</option>
	   		<option>Cassano Irpino</option>
	   		<option>Castel Baronia</option>
	   		<option>Castelfranci</option>
	   		<option>Castelvetere sul Calore</option>
	   		<option>Cervinara</option>
	   		<option>Cesinali</option>
	   		<option>Chianche</option>
	   		<option>Chiusano di San Domenico</option>
	   		<option>Contrada</option>
	   		<option>Conza della Campania</option>
	   		<option>Domicella</option>
	   		<option>Flumeri</option>
	   		<option>Fontanarosa</option>
	   		<option>Forino</option>
	   		<option>Frigento</option>
	   		<option>Gesualdo</option>
	   		<option>Greci</option>
	   		<option>Grottaminarda</option>
	   		<option>Grottolella</option>
	   		<option>Guardia Lombardi</option>
	   		<option>Lacedonia</option>
	   		<option>Lapio</option>
	   		<option>Lauro</option>
	   		<option>Lioni</option>
	   		<option>Luogosano</option>
	   		<option>Manocalzati</option>
	   		<option>Marzano di Nola</option>
	   		<option>Melito Irpino</option>
	   		<option>Mercogliano</option>
	   		<option>Mirabella Eclano</option>
	   		<option>Montaguto</option>
	   		<option>Montecalvo Irpino</option>
	   		<option>Montefalcione</option>
	   		<option>Monteforte Irpino</option>
	   		<option>Montefredane</option>
	   		<option>Montefusco</option>
	   		<option>Montella</option>
	   		<option>Montemarano</option>
	   		<option>Montemiletto</option>
	   		<option>Monteverde</option>
	   		<option>Montoro</option>
	   		<option>Morra De Sanctis</option>
	   		<option>Moschiano</option>
	   		<option>Mugnano del Cardinale</option>
	   		<option>Nusco</option>
	   		<option>Ospedaletto d'Alpinolo</option>
	   		<option>Pago del Vallo di Lauro</option>
	   		<option>Parolise</option>
	   		<option>Paternopoli</option>
	   		<option>Petruro Irpino</option>
	   		<option>Pietradefusi</option>
	   		<option>Pietrastornina</option>
	   		<option>Prata di Principato Ultra</option>
	   		<option>Pratola Serra</option>
	   		<option>Quadrelle</option>
	   		<option>Quindici</option>
	   		<option>Rocca San Felice</option>
	   		<option>Roccabascerana</option>
	   		<option>Rotondi</option>
	   		<option>Salza Irpina</option>
	   		<option>San Mango sul Calore</option>
	   		<option>San Martino Valle Caudina</option>
	   		<option>San Michele di Serino</option>
	   		<option>San Nicola Baronia</option>
	   		<option>San Potito Ultra</option>
	   		<option>San Sossio Baronia</option>
	   		<option>Santa Lucia di Serino</option>
	   		<option>Santa Paolina</option>
	   		<option>Sant'Andrea di Conza</option>
	   		<option>Sant'Angelo a Scala</option>
	   		<option>Sant'Angelo all'Esca</option>
	   		<option>Sant'Angelo dei Lombardi</option>
	   		<option>Santo Stefano del Sole</option>
	   		<option>Savignano Irpino</option>
	   		<option>Scampitella</option>
	   		<option>Senerchia</option>
	   		<option>Serino</option>
	   		<option>Sirignano</option>
	   		<option>Solofra</option>
	   		<option>Sorbo Serpico</option>
	   		<option>Sperone</option>
	   		<option>Sturno</option>
	   		<option>Summonte</option>
	   		<option>Taurano</option>
	   		<option>Taurasi</option>
	   		<option>Teora</option>
	   		<option>Torella dei Lombardi</option>
	   		<option>Torre Le Nocelle</option>
	   		<option>Torrioni</option>
	   		<option>Trevico</option>
	   		<option>Tufo</option>
	   		<option>Vallata</option>
	   		<option>Vallesaccarda</option>
	   		<option>Venticano</option>
	   		<option>Villamaina</option>
	   		<option>Villanova del Battista</option>
	   		<option>Volturara Irpina</option>
	   		<option>Zungoli</option>
	   		</select>
	   		
	   		</div>
	      	
	   	</div>
	   	
	   	<div class="row">
	   	<div class="column">
	   		<label class="dark_brown" for="address">Indirizzo:</label>
	      	<input type="text" class="form-control light_brown" id="address" placeholder="Inserisci l'indirizzo" name="address">
	   	</div>
	   
	   	<div class="column">
	   		<label class="dark_brown" for="num_civ">N.Civico</label>
	      	<input type="tel" class="form-control light_brown" id="num_civ" placeholder="Inserisci il numero civico" name="num_civ">
	   	</div>
	   	
	   		<div class="column">
	   		<label class="dark_brown" for="tel">Telefono:</label>
	      	<input type="tel" class="form-control light_brown" id="tel" placeholder="Inserisci il numero di telefono" name="tel">
	   	</div>
	   	
	   	</div>
	   	
	   	<p class="red" id="ver"></p>
	 	
	   	<div class="row">
	   	<div class="column" >
		<input type="submit" class="btn btn-success" value="Conferma">
		<a href="areaPersonaleGestore.jsp" class="btn btn-default">Annulla</a>
	
		</div>
		
		</div>
		</form>
		</div>
	
<br>
<br>
<!-- ./Modifica dati attività form -->
	
<%@ include file="footer.jsp" %>