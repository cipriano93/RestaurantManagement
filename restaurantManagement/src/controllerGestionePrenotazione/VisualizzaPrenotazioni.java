package controllerGestionePrenotazione;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelGestionePrenotazione.PrenotazioneManager;
import modelGestioneUtente.UtenteBean;

/**
 * Servlet implementation class VisualizzaPrenotazioni
 */

@WebServlet("/VisualizzaPrenotazioni")
public class VisualizzaPrenotazioni extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		PrenotazioneManager pm = new PrenotazioneManager();
		
		session.setAttribute("prenotazioni", pm.visualizzaPrenotazioni(((UtenteBean) session.getAttribute("utenteBean")).getUsername()));
		
		Boolean message_danger = (Boolean) request.getAttribute("message_danger");
		Boolean message_success = (Boolean) request.getAttribute("message_success");
		if (message_danger != null)
			request.setAttribute("message_danger", true);
		if (message_success != null)
			request.setAttribute("message_success", true);
		request.getRequestDispatcher("visualizzaPrenotazioni.jsp").forward(request, response);
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
