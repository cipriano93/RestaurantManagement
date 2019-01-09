package controllerGestioneComanda;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.MenuSelectionManager;

import modelGestioneComanda.ComandaBean;
import modelGestioneComanda.ComandaManager;
import modelGestioneMenù.MenùManager;
import modelGestioneMenù.PortataBean;

/**
 * Servlet implementation class InserimentoPortataComanda
 */
@WebServlet("/InserimentoPortataComanda")
public class InserimentoPortataComanda extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomePortata = request.getParameter("nome_portata");
		String quantità = request.getParameter("num_portate");
		String note = request.getParameter("notes");
		String tavolo = request.getParameter("tavolo");
		ServletContext application = request.getServletContext();
		
		ComandaBean cb = (ComandaBean) application.getAttribute("comanda");
		
		ComandaManager cm = new ComandaManager();
		MenùManager mm = new MenùManager();
		PortataBean pb = mm.getPortataByNome(nomePortata);
		
		cm.inserimentoPortataComanda(cb, pb, Integer.parseInt(quantità), note);
	//prova
		cm.stampa(nomePortata, quantità, note, tavolo);
		
		application.setAttribute("comanda", cb);
		response.sendRedirect("gestioneComanda.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
