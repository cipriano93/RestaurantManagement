<%@ include file="header.jsp" %>

<%@ page import="java.util.ArrayList, model.MenùBean" %>

<!-- Breadcrumb -->
<nav aria-label="breadcrumb">
 	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="">Home</a></li>
		<li class="breadcrumb-item"><a href="areaPersonaleGestore.jsp">Area personale</a></li>
		<li class="breadcrumb-item active" aria-current="page">Gestione menù</li>
	</ol>
</nav>
<!-- ./Breadcrumb -->

<div class="container my_satisfy">
	<h3 class="dark_brown">Gestione menù</h3>
	<hr/>
</div>
<div align="center" class ="my_avenir">
	<a href="inserimentoMenu.jsp" class="btn btn-default">Inserisci menù</a>
</div>
<br>
<div class="container my_avenir">
	<%
		String message = (String) request.getAttribute("message_danger");
		if (message != null) { 
	%>
			<div class="alert alert-danger">
		  		<strong>Errore!</strong> <%= message %>
			</div>
	<%	}
		message = (String) request.getAttribute("message_success");
		if (message != null) { 
	%>
			<div class="alert alert-success">
		  		<strong>Successo!</strong> <%= message %>
			</div>
	<%	}
		ArrayList<MenùBean> mbs = (ArrayList<MenùBean>) request.getAttribute("menùs");
		if (mbs == null || (mbs.size()) == 0) {
	%>
			<div class="alert alert-info">
	  			<strong>Info!</strong> Nessun menù inserito.
			</div>
</div>			
<!-- Tabella menù -->
	<%	} else {	%>
<div class="cointainer my_avenir">	
	<div class ="row">
		<div class = "col-sm-3"></div>
		<div class = "col-sm-6">
			<table class="table">
				<thead>
					<tr>
						<th>Menù</th>
						<th>Modifica/Rimuovi</th>
					</tr>
				</thead>
				<% 
					int size = mbs.size();
					for (int i = 0; i < size; i++) {
						int id = mbs.get(i).getIdMenù();
				%>
						<tbody>
							<tr>
								<td><%= mbs.get(i).getNome() %></td>
								<td>
									<a href="<%= "getportate?idmenu=" + id + "&namemenu=" + mbs.get(i).getNome()  %>" class="btn btn-default">Modifica</a>
									<a href="<%= "rimuovimenu?idmenu=" + id %>" class="btn btn-danger">Rimuovi</a>
								</td>
							</tr>
						</tbody>
				<%	}	%>	
			</table>
			</div>
			
		<div class = "col-sm-3"></div>
	</div>
	<%	}	%>
<!-- ./Tabella menù -->

</div>

<%@ include file="footer.jsp" %>