<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
  <title>Ristorante Incontro</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="css/style.css">
  <link href="https://fonts.googleapis.com/css?family=Satisfy" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Judson" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<style>

.container {  font-family: satisfy; }

.button {
  background-color: lightgrey;
  border: none;
  color: black;
  padding: 5px 10px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  margin: 4px 2px;
  cursor: pointer;
  border-radius: 16px;
  font-family:judson, serif
}

.button:hover {
  background-color: #f1f1f1;
}
h2{
color: #412E28;
font-family: 'Satisfy';
font-size: 40px;
}

</style>

<body>
<!-- Affix -->


	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-4 text_left">
		   		<a href="index.jsp"><img src="img/logoM.png"  class="img-responsive" height="80" width="80" ></a>
			</div>
			<div class="col-sm-4 text-center">
			<h2> Ristorante Incontro</h2>	   		 
	   		 </div>
	   		 <div class="col-sm-4 text-right">
	   		 <br>
      			<a href="registrazione.jsp"><button class="button"><i class="glyphicon glyphicon-user"></i> Registrati</button></a>
      			<a href="login.jsp"><button class="button"><i class="glyphicon glyphicon-log-in"></i> Accedi</button> </a>
		    </div>
   	 	</div>
	</div>	
<!-- ./Affix -->
</body>
</html>