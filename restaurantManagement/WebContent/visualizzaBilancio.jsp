<%@ include file = "header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<style>
#prenotazioni {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 96%;
  	margin:25px;

}

#prenotazioni td, #prenotazioni th {

  border: 1px solid #ddd;
  padding: 8px;
  width:10%;
}

#prenotazioni tr:nth-child(even){background-color: white;}

#prenotazioni tr:hover {background-color: #ddd;}

#prenotazioni th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #B9D3B0;
  color: white;
}
#btn{
 margin: 20px;
}
.dropbtn {
  background-color: #4CAF50;
  color: white;
  padding: 10px;
  font-size: 10px;
  border: none;
}

.dropdown {
  position: center;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {background-color: #ddd;}

.dropdown:hover .dropdown-content {display: block;}

.dropdown:hover .dropbtn {background-color: #3e8e41;}
</style>
</head>
<body>

<!-- Breadcrumb -->
	<ul class="breadcrumb">
		<li><a href="#">Home</a></li>
		<li class="breadcrumb-item"><a href="areaPersonaleGestore.jsp">Area peronale</a></li>
		<li class="breadcrumb-item active" aria-current="page">Visualizza bilancio</li>
	</ul>
<!-- Breadcrumb -->


<h3 style="margin:20px">Visualizza bilancio</h3>

<div class="container" align="center">
		<div class="row">			
			<form action="#" method="GET">
				<div class="col-sm-4"></div>
				<div class="col-sm-3">
		   			<span class="dark_brown">Filtra per:</span>
		   			<select name="orderBy" onchange="this.form.submit()">
		   				<option></option>
		  				<option value="giorno">Ultimi giorni</option>
		   				<option value="mese">Ultimo mese</option>
		    			<option value="anno">Ultimo anno</option>

		  			</select>
		  		</div>
		  		<div class="col-sm-5"></div>
  			</form>
		</div>
	</div>


<table id="prenotazioni">
  <tr>
  	
	
    <th>Data</th>
    <th>N.coperti</th>
    <th>Totale incassato</th>
  </tr>
  <tr>
    <td>11/04/2019</td>
    <td>14</td>
    <td>&euro; 790</td>
    
  </tr>
  <tr>
  	
    <td>11/04/2019</td>
    <td>26</td>
    <td>&euro; 3333</td>
  </tr>
  <tr>
  
    <td>11/04/2019</td>
    <td>50</td>
    <td>&euro; 2500</td>
  </tr>
  <tr>
    <td>11/04/2019</td>
    <td>23</td>
    <td>&euro; 1000</td>
  </tr>
  <tr>
    <td>11/04/2019</td>
    <td>7</td>
    <td>&euro; 300</td>
  </tr>
    <tr>
    <td>11/04/2019</td>
    <td>17</td>
    <td>&euro; 400</td>
  </tr>
</table>

</body>

<button id="btn" type="button" class="btn btn-danger">Annulla</button>
<button type="button" class="btn btn-info">Stampa</button>

	<%@ include file="footer.jsp" %>
</html>





