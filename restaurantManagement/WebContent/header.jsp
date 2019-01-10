<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Restaurant Management</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="css/style.css">  <link href="https://fonts.googleapis.com/css?family=Satisfy" rel="stylesheet">

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="css/style.css">
  

<style>
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
}

.button:hover {
  background-color: #f1f1f1;
}
</style>


</head>
<body>
<!-- Affix -->
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-4 text-left">
		   		<a href="index.jsp"><img src="img/logoSfondoBianco.jpg"  class="img-responsive" height="80" width="80" ></a>
			</div>
			<div class="col-sm-4 text-center">
			<h2 style= "font-family: avenir"> Restaurant Management</h2>	   		 
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