package controllerGestionePrenotazione;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelGestionePrenotazione.PrenotazioneManager;


/**
 * Servlet implementation class RimozionePrenotazione
 */

@WebServlet("/RimozionePrenotazione")
public class RimozionePrenotazione extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("idprenotazione");
		
		PrenotazioneManager pm = new PrenotazioneManager();
		if (!(pm.rimozionePrenotazione(Integer.parseInt(id))))
			request.setAttribute("message_danger", true);
		else
			request.setAttribute("message_success", true);
		request.getRequestDispatcher("VisualizzaPrenotazioni").forward(request, response);
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
