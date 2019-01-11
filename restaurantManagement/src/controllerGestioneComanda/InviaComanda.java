package controllerGestioneComanda;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelGestioneComanda.ComandaBean;
import modelGestioneComanda.ComandaManager;
import modelGestioneComanda.CucinaBean;
import modelGestioneComanda.TavoloBean;

/**
 * Servlet implementation class InviaComanda
 */

@WebServlet("/InviaComanda")
public class InviaComanda extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ServletContext application = request.getServletContext();
		
		TavoloBean tb = (TavoloBean) session.getAttribute("tavolo");
		ComandaBean cb = (ComandaBean) application.getAttribute("comanda" + tb.getNumeroTavolo());
		ComandaManager cm = new ComandaManager();
		CucinaBean cucina = (CucinaBean) application.getAttribute("cucina");
		
		if (cucina == null)
			cucina = new CucinaBean();
		
		if (!(cm.inviaComanda(cucina, cb))) {
			application.setAttribute("cucina", cucina);
			request.setAttribute("message_cucina", true);
			request.getRequestDispatcher("gestioneComanda.jsp").forward(request, response);
		} else {
			application.setAttribute("cucina", cucina);
			request.setAttribute("message", true);
			request.getRequestDispatcher("cucina.jsp").forward(request, response);
		}
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
