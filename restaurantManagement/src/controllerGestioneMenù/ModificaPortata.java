package controllerGestioneMenù;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelGestioneMenù.MenùManager;


/**
 * Servlet implementation class ModificaPortata
 */

@WebServlet("/modifica_portata")
public class ModificaPortata extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("name");
		String tipo = request.getParameter("type");
		String prezzo = request.getParameter("price");
		String descrizione = request.getParameter("description");
		String regexName = "^[a-zA-Z0-9 ]+$";
		String regexPrice = "^[0-9]{1,2}\\.[0-9]{1,2}$";
		if (nome.matches(regexName) && prezzo.matches(regexPrice)) {
			int id = Integer.parseInt(request.getParameter("id"));
			MenùManager mm = new MenùManager();
			boolean result = mm.modificaPortata(id, nome, tipo, prezzo, descrizione);
			if (result)
				response.sendRedirect("gestionePortata.jsp");
			else {
				request.setAttribute("errMessage", result);
				request.getRequestDispatcher("modificaPortata.jsp").forward(request, response);
			}
		} else
			response.sendRedirect("modificaPortata.jsp");
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
