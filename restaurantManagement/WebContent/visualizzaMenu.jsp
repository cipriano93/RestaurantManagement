<%@ include file="header.jsp" %>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Men�Manager"%>
<%@page import="model.Men�Bean"%>

<script type="text/javascript">
	function chooseMenu(tipo){
		var xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange = function(){
			if(xhttp.readyState == 4 && xhttp.status == 200){
				//riferimento alla select con id "comuni"
				document.getElementById("tabella").innerHTML = xhttp.responseText;
			}
		};
		//URL lato server
		var menu = document.getElementById("menu").value;
		xhttp.open("GET","SelectMenu?menu="+menu,true);
		xhttp.send();
	}
	</script>
<!-- Breadcrumb -->
<nav aria-label="breadcrumb">
 	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="">Home</a></li>
		<li class="breadcrumb-item active" aria-current="page">Visualizza men�</li>
	</ol>
</nav>
<!-- ./Breadcrumb -->

<div class="container">
	<h3 class="dark_brown" style="font-family: satisfy">Men�</h3>
	
	<hr/>
</div>
	
<!-- Scelta menu form -->
	<div class="container my_avenir">
			<div class = "row">
				<!-- Men� -->
				<div class="col-sm-5"></div>
				<div class="col-sm-2">
    					<div class="form-group dark_brown">
      					<label for="type">Men�:</label>
      						<% Men�Manager mm = new Men�Manager();
      							ArrayList<Men�Bean> menus = new ArrayList<Men�Bean>();
      							menus = mm.getMen�s();
      						%>
							<select class="form-control light_brown" id="menu" onchange ="chooseMenu(this.value)" >
								<option>seleziona men�</option>
								<%for(int i = 0; i < menus.size(); i++){%>
									<option><%=menus.get(i).getNome()%></option>
								<%}%>
							</select>
    					</div>
    				</div>
				<!-- ./Men� --> 
				<div class="col-sm-5"></div>
			</div>
			<br>
			<br>
			<div class = "row">
				<div class = "col-sm-3"></div>
				<div class = "col-sm-6">
					<table class="table" id ="tabella">
					</table>
				</div>
				<div class = "col-sm-3"></div>
			</div>
	<br>
	<br>	
	</div>
<%@ include file="footer.jsp" %>
<body>

</body>
</html>