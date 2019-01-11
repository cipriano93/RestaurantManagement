<%@ include file ="header.jsp" %>

<!DOCTYPE html>
<html>

	<head>
		<style>
			#prenotazioni {
			  	font-family: satisfy;
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
			
			#btn {
		 		margin: 20px;
			}
		</style>
	</head>
	
	<body>

		<!-- Breadcrumb -->
		<ul class="breadcrumb">
			<li><a href="#">Home</a></li>
			<li class="breadcrumb-item"><a href="areaPersonaleCliente.jsp">Area personale</a></li>
			<li class="breadcrumb-item active" aria-current="page">Visualizza prenotazioni</li>
		</ul>
		<!-- Breadcrumb -->
	
		<div class="container">
			<h3 class="dark_brown" style="font-family: satisfy">Accedi all'area personale</h3>
			<hr>
			
			<div class="row">
			
				<div class="col-sm-3"></div>
				
				<div class="col-sm-6">
	
					<!-- Tabella prenotazioni -->
					<table id="prenotazioni" class="text-center">
						<tr>
					    	<th style="text-align: center">Data</th>
					    	<th style="text-align: center">Ora</th>
					    	<th style="text-align: center">N.coperti</th>
					    	<th style="text-align: center">Rimozione</th>
					  	</tr>
					  	<tr>
					    	<td>11/04/2019</td>
					    	<td>13:00</td>
					    	<td>4</td>
					    	<td>
					    		<button id="btn" type="button" class="btn btn-danger">Cancella</button>
					    	</td>
					  	</tr>
					  	<tr>
					    	<td>11/04/2019</td>
					    	<td>13:00</td>
					    	<td>6</td>
					    	<td>
					    		<button id="btn" type="button" class="btn btn-danger">Cancella</button>
							</td>
					  	</tr>
					  	<tr>
					    	<td>11/04/2019</td>
					    	<td>13:00</td>
					    	<td>5</td>
					    	<td>
					    		<button id="btn" type="button" class="btn btn-danger">Cancella</button>
					    	</td>
					  	</tr>
					  	<tr>
					    	<td>11/04/2019</td>
					    	<td>13:00</td>
					    	<td>10</td>
					    	<td>
					    		<button id="btn" type="button" class="btn btn-danger">Cancella</button>
					    	</td>
					  	</tr>
					  	<tr>
					    	<td>11/04/2019</td>
					    	<td>13:00</td>
					    	<td>7</td>
					    	<td>
					    		<button id="btn" type="button" class="btn btn-danger">Cancella</button>
					    	</td>
					  	</tr>
					 </table>
					<!-- ./Tabella prenotazioni -->
			
				</div>
				
				<div class="col-sm-3"></div>
			
			</div>
	
		</div>		
	
	</body>

	<%@ include file="footer.jsp" %>

</html>