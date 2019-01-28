<%@ include file="header.jsp" %>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="https://fonts.googleapis.com/css?family=Judson" rel="stylesheet">
<style>
* {box-sizing: border-box}
body {font-family: 'Judson', serif;}

.topnav {
 
  background-color: #A8A39D;
  overflow: hidden;
}

.topnav a {
  float: left;
  display:block;
  padding: 9px;
  color: white;
  text-decoration: none;
  font-size: 17px;
  width: 33%; /* Four links of equal widths */
  text-align: center;
}

.topnav a:hover {
  background-color: #E2DDD9;
}

.navbar a.active {
  background-color: #C8C9B5;
}

.topnav .icon {
  display: none;
}

@media screen and (max-width: 500px) {
   .topnav a {display: none;}
  .topnav a.icon {
    float: right;
    display: block;
  }
  @media screen and (max-width: 600px) {
  .topnav.responsive {position: relative;}
  .topnav.responsive a.icon {
    position: absolute;
    right: 0;
    top: 0;
  }
  .topnav.responsive a {
    float: none;
    display: block;
    text-align: left;
  }
}
  
</style>
<body>
<div class="topnav" id="myTopnav">
  <a href="visualizzaMenu.jsp">Consulta i menù</a>
  <a href="prenotaTavolo.jsp">Prenota tavolo</a>
  <a href="infoRistorante.jsp">Info ristorante</a>
  <a href="javascript:void(0);" class="icon" onclick="myFunction()">
    <i class="fa fa-bars"></i>
  </a>
</div>
	  <hr>
	
<div class="container">
	  <div id="myCarousel" class="carousel slide" data-ride="carousel">
	    <!-- Indicators -->
	    <ol class="carousel-indicators">
	      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
	      <li data-target="#myCarousel" data-slide-to="1"></li>
	      <li data-target="#myCarousel" data-slide-to="2"></li>
	    </ol>
	
	    <!-- Wrapper for slides -->
	    <div class="carousel-inner">
	
	      <div class="item active">
	        <img src="img_myCarousel/1m.jpg" alt="Sala" style="width:100%;">
	        <div class="carousel-caption">
	          <h3 class="white">La nostra sala</h3>
	          <p></p>
	        </div>
	      </div>
	
	      <div class="item">
	        <img src="img_myCarousel/02m.jpg" alt="Esterno" style="width:100%;">
	        <div class="carousel-caption">
	          <h3 class="white">L'esterno</h3>
	          <p></p>
	        </div>
	      </div>
	    
	      <div class="item">
	        <img src="img_myCarousel/03m.png" alt="Cucina" style="width:100%;">
	        <div class="carousel-caption">
	          <h3 class="white">La cucina</h3>
	          <p></p>
	        </div>
	      </div>
	  
	    </div>
	
	    <!-- Left and right controls -->
	    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
	      <span class="glyphicon glyphicon-chevron-left"></span>
	      <span class="sr-only">Previous</span>
	    </a>
	    <a class="right carousel-control" href="#myCarousel" data-slide="next">
	      <span class="glyphicon glyphicon-chevron-right"></span>
	      <span class="sr-only">Next</span>
	    </a>
	  </div>
	</div>
	
<br>

<div>
<h2 align="center">Ultime Creazioni </h2>
</div>

<div class="container"> 
<br>
<br> 
	  <div class="row">
	  <div class="col-sm-4">
	      <div class="panel" style="border-color:#A8A39D">
	        <div class="panel-heading" style="background-color:#A8A39D"><font color="white">° Insalata di riso con tonno e verdure grigliate °</font></div>
	        <div class="panel-body" >
	        <a><img src="img_myCarousel/04m.jpg" class="img-responsive" style="width:100%" ></a>
	         </div>
	          <div class="panel-footer"  style="background-color:#A8A39D">
	          </div>
	          </div>
	          </div>
	          
	           <div class="col-sm-4">
	      <div class="panel" style="border-color:#A8A39D">
	        <div class="panel-heading" style="background-color:#A8A39D"><font color="white">° Linguine calamaretti e salsa al pane di segale °</font></div>
	        <div class="panel-body">
	        <a><img src="img_myCarousel/05m.jpg" class="img-responsive" style="width:100%" ></a>
	         </div>
	          <div class="panel-footer"  style="background-color:#A8A39D">
	          </div>
	          </div>
	          </div>
	           <div class="col-sm-4">
	      <div class="panel" style="border-color:#A8A39D">
	        <div class="panel-heading" style="background-color:#A8A39D"><font color="white">° Merluzzo nero in salsa nera °</font></div>
	        <div class="panel-body">
	        <a><img src="img_myCarousel/06m.jpg" class="img-responsive" style="width:100%" ></a>
	         </div>
	          <div class="panel-footer" style="background-color:#A8A39D">
	          </div>
	          </div>
	          </div>
	          
	          </div>
	          
	          </div>
	          
<script>
function myFunction() {
  var x = document.getElementById("myTopnav");
  if (x.className === "topnav") {
    x.className += " responsive";
  } else {
    x.className = "topnav";
  }
}
</script>

	          

</body>
<%@ include file="footer.jsp" %> 
</html>	
	