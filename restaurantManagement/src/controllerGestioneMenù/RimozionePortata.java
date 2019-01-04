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

@WebServlet("/rimozioneportata")
public class RimozionePortata extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MenùManager mm = new MenùManager();
		boolean result = mm.rimozionePortata(Integer.parseInt(request.getParameter("id_portata")));
		if (result)
			response.sendRedirect("gestionePortata.jsp");
		else {
			request.setAttribute("errMessage", result);
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
