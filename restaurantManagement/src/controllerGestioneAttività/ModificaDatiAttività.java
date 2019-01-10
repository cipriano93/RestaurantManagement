package controllerGestioneAttività;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelGestioneAttività.AttivitàManager;


/**
 * Servlet implementation class ModificaDatiAttività
 */

@WebServlet("/ModificaDatiAttivita")
public class ModificaDatiAttività extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String p_iva = request.getParameter("iva");
		String provincia = request.getParameter("provincia");
		String città = request.getParameter("città");
		String address = request.getParameter("address");
		String num_civ = request.getParameter("num_civ");
		String tel = request.getParameter("tel");
		AttivitàManager am = new AttivitàManager();
		if (!(am.modificaDati(name, p_iva, provincia, città, address, Integer.parseInt(num_civ), tel))) {
			request.setAttribute("message", false);
			request.getRequestDispatcher("modificaDatiAttivita.jsp").forward(request, response);
		} else {
			request.setAttribute("message", true);
			request.getRequestDispatcher("modificaDatiAttivita.jsp").forward(request, response);
		}
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}