package controllerGestioneComanda;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.MenuSelectionManager;

import modelGestioneComanda.ComandaBean;
import modelGestioneComanda.ComandaManager;
import modelGestioneComanda.TavoloBean;
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
		HttpSession session = request.getSession();
		TavoloBean tb = (TavoloBean) session.getAttribute("tavolo");
		
		String nomePortata = request.getParameter("nome_portata");
		String quantità = request.getParameter("num_portate");
		String note = request.getParameter("notes");
		
		ServletContext application = request.getServletContext();
		
		ComandaBean cb = (ComandaBean) application.getAttribute("comanda"+tb.getNumeroTavolo());
		
		ComandaManager cm = new ComandaManager();
		MenùManager mm = new MenùManager();
		PortataBean pb = mm.getPortataByNome(nomePortata);
		
		cm.inserimentoPortataComanda(cb, pb, Integer.parseInt(quantità), note);
		
		application.setAttribute("comanda"+tb.getNumeroTavolo(), cb);
		request.setAttribute("message_inserimento", true);
		request.getRequestDispatcher("gestioneComanda.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
