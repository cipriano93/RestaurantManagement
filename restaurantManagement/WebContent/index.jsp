<!DOCTYPE html>

<html lang="en">
<head>
  <title>Homepage</title>

 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  
<style>
* {box-sizing: border-box}
body {font-family: Arial, Helvetica, sans-serif;}

.navbar {
  width: 100%;
  background-color: #C8C9B5;
  overflow: auto;
}

.navbar a {
  float: left;
  padding: 9px;
  color: white;
  text-decoration: none;
  font-size: 17px;
  width: 33%; /* Four links of equal widths */
  text-align: center;
}

.navbar a:hover {
  background-color: #E5DDCB;
}

.navbar a.active {
  background-color: #C8C9B5;
}
@media screen and (max-width: 500px) {
  .navbar a {
    float: none;
    display: block;
    width: 100%;
    text-align: left;
  }
  
.carousel-inner img {
      width: 100%;
      height: 100%;
  }

}
</style>
</head>
<body>
<%@ include file="header.jsp" %>



<div class="navbar">
  <a href="#">Prenota tavolo</a> 
  <a href="#">Info ristorante</a> 
  <a href="#">Help</a> 
</div>
	  <hr>
	
	<div class="container">
	<div id="demo" class="carousel slide" data-ride="carousel">

  <!-- Indicators -->
  <ul class="carousel-indicators">
    <li data-target="#demo" data-slide-to="0" class="active"></li>
    <li data-target="#demo" data-slide-to="1"></li>
    <li data-target="#demo" data-slide-to="2"></li>
    <li data-target="#demo" data-slide-to="3"></li>
  </ul>
  
  <!-- The slideshow -->
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="img_myCarousel/02m.jpg" alt="sala1" width="1100" height="500">
    </div>
    <div class="carousel-item">
      <img src="img_myCarousel/05m.jpg" alt="sala2" width="1100" height="500">
    </div>
    <div class="carousel-item">
      <img src="img_myCarousel/07m.jpg" alt="cucina" width="1100" height="500">
    </div>
     <div class="carousel-item">
      <img src="img_myCarousel/06m.jpg" alt="cucina2" width="1100" height="500">
    </div>
  </div>
  
  <!-- Left and right controls -->
  <a class="carousel-control-prev" href="#demo" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#demo" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>
</div>	
</div>
<br>

<h2 align="center" style= "font-family: avenir">Ultime Creazioni </h2>

<div class="container"> 
<br>
<br> 
	  <div class="row">
	  <div class="col-sm-4">
	      <div class="panel" style="border-color:#C8C9B5">
	        <div class="panel-heading" style="background-color:#C8C9B5"><font color="white">° Insalata di riso con tonno e verdure grigliate °</font></div>
	        <div class="panel-body" >
	        <a><img src="img_myCarousel/13m.jpg" class="img-responsive" style="width:100%" ></a>
	         </div>
	          <div class="panel-footer"  style="background-color:#C8C9B5">
	          </div>
	          </div>
	          </div>
	          
	           <div class="col-sm-4">
	      <div class="panel" style="border-color:#C8C9B5">
	        <div class="panel-heading" style="background-color:#C8C9B5"><font color="white">° Linguine calamaretti e salsa al pane di segale °</font></div>
	        <div class="panel-body">
	        <a><img src="img_myCarousel/01m.jpg" class="img-responsive" style="width:100%" ></a>
	         </div>
	          <div class="panel-footer"  style="background-color:#C8C9B5">
	          </div>
	          </div>
	          </div>
	           <div class="col-sm-4">
	      <div class="panel" style="border-color:#C8C9B5">
	        <div class="panel-heading" style="background-color:#C8C9B5"><font color="white">° Merluzzo nero in salsa nera °</font></div>
	        <div class="panel-body">
	        <a><img src="img_myCarousel/14m.jpg" class="img-responsive" style="width:100%" ></a>
	         </div>
	          <div class="panel-footer" style="background-color:#C8C9B5">
	          </div>
	          </div>
	          </div>
	          
	          </div>
	          
	          </div>


</body>
<div class="footer">	<%@ include file="footer.jsp" %> </div>
</html>	
	