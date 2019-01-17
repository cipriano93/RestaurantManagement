
<!DOCTYPE html>
<%@page import="modelGestioneComanda.TavoloBean"%>
<%@page import="java.util.ArrayList"%>
<%@include file = "header.jsp" %>
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
<nav aria-label="breadcrumb">
	<ul class="breadcrumb">
		<li><a href="#">Home</a></li>
		<li>Disposizione tavoli</li>	
	</ul>
</nav>
<!-- Breadcrumb -->
<%if(ub != null && ub.getTipo().equals("cameriere")){ %>

<hr>
<h3 style="font-family:avenir" align="center">Seleziona tavolo</h3>
<span class="label success">libero</span>
<span class="label danger">prenotato</span>
<hr>


<%ArrayList<TavoloBean> tavoli = new ArrayList<TavoloBean>(); %>
<form action="inserimentoPersone.jsp" method ="post">
	<%if ((application.getAttribute("tavoli")) == null){
		System.out.println("sono qua");
			tavoli = new ArrayList<TavoloBean>();
			for(int i = 0; i < 16; i ++){
				TavoloBean tb = new TavoloBean();
				tb.setNumeroTavolo(i+1);
				tb.setNumeroPersone(0);
				tavoli.add(tb);
			}
	} else { 
		tavoli = (ArrayList) application.getAttribute("tavoli") ;
	}%>
	<% if(tavoli == null) { %>
		<div class="grid-container">
		<% for(int i = 1; i< 16; i++) { %>
		 <div class="grid-item">
				  <button type="submit" name="button" value ="<%= i%>" class="btn btn-success" ><%=i %></button>
				  <input type="hidden" name="tavolo" value="<%=i%>">
	  	</div>
	  	<% } %>
	  	</div>
	<% } else { %>
	<div class="grid-container">
		<% for(int i = 1; i< 16; i++) { 
			TavoloBean tb = tavoli.get(i-1);
			
			if(tb.getNumeroPersone() != 0) { %>
			  <div class="grid-item">
				  <button type="submit" name="button" value ="<%= i%>" class="btn btn-danger" ><%=i %></button>
				  <input type="hidden" name="tavolo" value="<%=i%>">
			  </div>
			  <%}else{ %>
			   <div class="grid-item">
				  <button type="submit" name="button" value ="<%= i%>" class="btn btn-success" ><%=i %></button>
				  <input type="hidden" name="tavolo" value="<%=i%>">
			  </div>
		 <% } %>
		<% } %>
	<%} %>
		
		<%application.setAttribute("tavoli", tavoli); %>
	</div>
</form>
<% } else { %>
	<h3 class = "red" style="font-family:avenir" align="center">Accedi come cameriere</h3>
<% } %>




<%@include file = "footer.jsp" %>
	</body>
	</html>