<!DOCTYPE html>
<%@include file="heading.jsp" %>
<html>
<head>
<style>
.grid-container {
  display: grid;
  grid-gap: 50px;
  grid-template-columns: auto auto auto;
  background-color: WHITE;
  padding: 20px;
}

.grid-item {
  background-color: rgba(255, 255, 255, 0.8);
  border: 2px solid rgba(0, 0, 0, 0.8);
  padding: 20px;
  font-size: 30px;
  text-align: center;
}
.label {
  color: white;
  padding: 8px;
  margin: 5px;
}
.success {background-color: #4CAF50;}
.danger {background-color: #f44336;}
</style>
</head>
<body>

<!-- Breadcrumb -->
	<ul class="breadcrumb">
		<li><a href="#">Home</a></li>
		<li>Disposizione tavoli</li>	
	</ul>
<!-- Breadcrumb -->


<hr>
<h3 style="font-family:avenir" align="center">Seleziona tavolo</h3>
<span class="label success">libero</span>
<span class="label danger">prenotato</span>
<hr>




<div class="grid-container">
  <div class="grid-item"> <button type="button" class="btn btn-danger">1</button></div>
  <div class="grid-item"><button type="button" class="btn btn-success">2</button></div>
  <div class="grid-item"><button type="button" class="btn btn-success">3</button></div>  
  <div class="grid-item"><button type="button" class="btn btn-success">4</button></div>
  <div class="grid-item"><button type="button" class="btn btn-success">5</button></div>
  <div class="grid-item"><button type="button" class="btn btn-danger">6</button></div>  
  <div class="grid-item"><button type="button" class="btn btn-danger">7</button></div>
  <div class="grid-item"><button type="button" class="btn btn-danger">8</button></div>
  <div class="grid-item"><button type="button" class="btn btn-danger">9</button></div>
  <div class="grid-item"><button type="button" class="btn btn-success">10</button></div>
  <div class="grid-item"><button type="button" class="btn btn-danger">11</button></div>
  <div class="grid-item"><button type="button" class="btn btn-success">12</button></div>  
  <div class="grid-item"><button type="button" class="btn btn-success">13</button></div>
  <div class="grid-item"><button type="button" class="btn btn-success">14</button></div>
  <div class="grid-item"><button type="button" class="btn btn-danger">15</button></div>
</div>

</body>
</html>