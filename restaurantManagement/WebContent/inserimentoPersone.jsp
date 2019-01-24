<%@page import="model.TavoloBean"%>
<%@page import="java.util.ArrayList"%>
<%@ include file="header.jsp" %>

<% if (ub == null || !(ub.getTipo().equals("cameriere"))) { %>
		<h3 class="red" style="font-family:avenir" align="center">Accedi come cameriere</h3>
	<% } else { %>

<% ArrayList<TavoloBean> tavoli = (ArrayList<TavoloBean>) application.getAttribute("tavoli");
	int numTavolo = Integer.parseInt(request.getParameter("button"));
	TavoloBean tb = tavoli.get(numTavolo-1);
%>
<%if(tb.getNumeroPersone()!= 0) {
	session.setAttribute("tavolo", tb);
	response.sendRedirect("gestioneComanda.jsp");
}%>
	
<script>
	function verifica(errore){
		document.getElementById("ver").innerHTML = errore;
	}
	
 	function validateForm(){
   		var persone = document.form.num_people;
   		if(validationPerson(persone)){
     		return true;
   		} else {
     		return false;
		}
 	}
 	
 	function validationPerson(persone) {
   		if(persone.value > 0){
     		return true;
   		} else {
     		verifica("Inserisci il numero di persone");
			persone.focus();
			return false;
		}
 	}
</script>

<!-- Breadcrumb -->
<nav aria-label="breadcrumb" style="font-family: avenir">
 	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="">Home</a></li>
		<li class="breadcrumb-item"><a href="selezionaTavolo.jsp">Disposizione tavoli</a></li>
		<li class="breadcrumb-item active" aria-current="page">Inserimento numero persone</li>
	</ol>
</nav>
<!-- ./Breadcrumb -->

<div class="container">
	<h3 class="dark_brown my_satisfy">Tavolo <%=request.getParameter("button") %>   </h3>
	
	<hr/>
</div>
	
<!-- Inserimento numero persone form -->
<div class="container my_avenir">
	<div class = "row">
	 	<div class="col-md-5"></div>
	 	<div class="col-md-2">
			<form name="form" action="SelezionaTavolo" method="POST" onsubmit ="return validateForm()">
				<div class="form-group ">
			    	<label class ="dark_brown text-centered" for="name">Numero persone:</label>
			      <input type="number" class="form-control light_brown" id="num_people" name="num_people" min="1" max="40" value="1">
			       <input name="tavolo" type="hidden"  value="<%=request.getParameter("button")%>">
			      
			    </div>
				<button type="submit" class="btn btn-success center-block">Inserisci persone</button>
			</form>
			
		</div>
		<div class="col-md-5"></span></div>
	</div>
	<br>
	<div class = "text-center">
		<span class="red my_avenir" id="ver">
	</div>
</div>	
<!-- ./Inserimento numero persone form -->

<% } %>

<br>
<br>
	
<%@ include file="footer.jsp" %>