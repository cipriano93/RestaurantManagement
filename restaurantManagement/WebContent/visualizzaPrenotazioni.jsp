<%@ include file="header.jsp" %>

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
</style>
</head>
<body>

<!-- Breadcrumb -->
	<ul class="breadcrumb">
		<li><a href="#">Home</a></li>
		<li>Prenotazioni</li>
	</ul>
<!-- Breadcrumb -->

<h3 align="center">Elenco prenotazioni</h3>


<table id="prenotazioni">
  <tr>
    <th>Data</th>
    <th>Ora</th>
    <th>N.coperti</th>
    <th>Opzioni</th>
  </tr>
  <tr>
    <td>11/04/2019</td>
    <td>13:00</td>
    <td>4</td>
    <td>
    <button id="btn" type="button" class="btn btn-warning">Cancella</button>
    </td>
    
  </tr>
  <tr>
    <td>11/04/2019</td>
    <td>13:00</td>
    <td>6</td>
    <td>
    <button id="btn" type="button" class="btn btn-warning">Cancella</button>
	</td>
  </tr>
  <tr>
    <td>11/04/2019</td>
    <td>13:00</td>
    <td>5</td>
    <td>
    <button id="btn" type="button" class="btn btn-warning">Cancella</button>
    </td>
  </tr>
  <tr>
    <td>11/04/2019</td>
    <td>13:00</td>
    <td>10</td>
    <td>
    <button id="btn" type="button" class="btn btn-warning">Cancella</button>
    </td>
  </tr>
  <tr>
    <td>11/04/2019</td>
    <td>13:00</td>
    <td>7</td>
    <td>
    <button id="btn" type="button" class="btn btn-warning">Cancella</button>
    </td>
  </tr>
</table>

</body>
<div align="center">
<button id="btn" type="button" class="btn btn-danger">Annulla</button>
</div>
	<%@ include file="footer.jsp" %>
</html>





