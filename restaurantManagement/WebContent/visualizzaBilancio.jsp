<%@ page import="java.util.ArrayList, model.OrdineBean" %>

<%@ include file = "header.jsp" %>

<style>
		#ordini {
		  	border-collapse: collapse;
		  	width: 96%;
			margin:25px;
		}
		
		#ordini td, #ordini th {
			border: 1px solid #ddd;
		  	padding: 8px;
		  	width:10%;
		}
		
		#ordini tr:nth-child(even){ background-color: white; }
		
		#ordini tr:hover { background-color: #ddd; }
		
		#ordini th {
			padding-top: 12px;
		  	padding-bottom: 12px;
		  	text-align: left;
		  	background-color: #B9D3B0;
		  	color: white;
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
		
		.dropdown-content a:hover { background-color: #ddd; }
		
		.dropdown:hover .dropdown-content { display: block; }
		
		.dropdown:hover .dropbtn { background-color: #3e8e41; }
</style>

<script type="text/javascript">
	function orderBy(value) {
		var xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange = function() {
			if(xhttp.readyState == 4 && xhttp.status == 200) {
				//riferimento alla tabella con id "ordini"
				document.getElementById("ordini").innerHTML = xhttp.responseText;
			}
		};
		//URL lato server
		var item = document.getElementById("orderBy").value;
		xhttp.open("GET","VisualizzaBilancio?orderBy=" + item, true);
		xhttp.send();
	}
</script>

<!-- Breadcrumb -->
	<ul class="breadcrumb">
		<li><a href="index.jsp">Home</a></li>
		<li class="breadcrumb-item"><a href="areaPersonaleGestore.jsp">Area personale</a></li>
		<li class="breadcrumb-item active" aria-current="page">Visualizza bilancio</li>
	</ul>
<!-- Breadcrumb -->


<div class="container my_satisfy">
	<h3 class="dark_brown">Visualizza bilancio</h3>
	<hr>
	
		<div align="center">
   			<span class="dark_brown">Filtra per:</span>
   			<select id="orderBy" onchange="orderBy(this.value)">
   				<option></option>
   				<option value="all">Tutti</option>
  				<option value="giorno">Ultimi giorni</option>
   				<option value="mese">Ultimo mese</option>
    			<option value="anno">Ultimo anno</option>
  			</select>
  		</div>
		
		<table id="ordini" class="text-center">
		</table>

</div>

<%@ include file="footer.jsp" %>