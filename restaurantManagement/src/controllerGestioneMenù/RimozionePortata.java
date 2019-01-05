package controllerGestioneMenù;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelGestioneMenù.MenùManager;


/**
 * Servlet implementation class RimozionePortata
 */

@WebServlet("/rimuoviportata")
public class RimozionePortata extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MenùManager mm = new MenùManager();
		boolean result = mm.rimozionePortata(Integer.parseInt(request.getParameter("idportata")));
		if (result) {
			request.setAttribute("message_success", "portata rimossa correttamente");
			request.getRequestDispatcher("getportate").forward(request, response);
		} else {
			request.setAttribute("message_danger", "impossibile rimuovere la portata");
			request.getRequestDispatcher("gestionePortata.jsp").forward(request, response);
		}
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
