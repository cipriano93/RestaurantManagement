<%@page import="modelGestioneComanda.TavoloBean"%>
<%@page import="java.util.ArrayList"%>
<%@ include file="header.jsp" %>
<% ArrayList<TavoloBean> tavoli = (ArrayList) session.getAttribute("tavoli");
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
   		var name = document.form.name;
   		if(validationName(name)){
     		return true;
   		} else {
     		return false;
		}
 	}
 	
 	function validationName(name) {
   		var nameformat = /^[a-zA-Z0-9 ]+$/;
   		if(name.value.match(nameformat)){
     		return true;
   		} else {
     		verifica("Il numero delle persone deve contenere solo numeri");
			name.focus();
			return false;
		}
 	}
</script>

<!-- Breadcrumb -->
<nav aria-label="breadcrumb">
 	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="">Home</a></li>
		<li class="breadcrumb-item"><a href="selezionaTavolo.jsp">Disposizione tavoli</a></li>
		<li class="breadcrumb-item active" aria-current="page">Inserimento numero persone</li>
	</ol>
</nav>
<!-- ./Breadcrumb -->

<div class="container">
	<h3 class="dark_brown">Inserisci numero persone del tavolo <%=request.getParameter("button") %>    </h3>
	
	<hr/>
</div>
	
<!-- Inserimento numero persone form -->
<div class="container">
	<%
		String message = (String) request.getAttribute("message");
		if (message != null) {
	%>
			<div class="alert alert-warning">
  				<strong>Attenzione!</strong> <%= message %>.
			</div>
	 <% } %>
	<form name="form" action="SelezionaTavolo" method="POST">
		<div class="form-group">
	    	<label class ="dark_brown" for="name">Numero persone:</label>
	      <input type="number" class="form-control" id="num_people" name="num_people" min="1" max="40">
	       <input name="tavolo" type="hidden"  value="<%=request.getParameter("button")%>">
	      	<span class="red" id="ver"></span>
	    </div>
		<button type="submit" class="btn btn-primary">Inserisci persone</button>
	</form>
</div>
<br>
<br>
<!-- ./Inserimento numero persone form -->
	
<%@ include file="footer.jsp" %>