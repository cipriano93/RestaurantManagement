package controllerGestioneMenù;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelGestioneMenù.MenùManager;


/**
 * Servlet implementation class ModificaMenù
 */

@WebServlet("/modificanomemenu")
public class ModificaNomeMenù extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("namemenu");
		String regName = "^[a-zA-Z0-9 ]+$";
		if (nome.matches(regName)) {
			MenùManager mm = new MenùManager();
			HttpSession session = request.getSession();
			boolean result = mm.modificaNome((Integer) session.getAttribute("id_menù"), nome);
			if (result) {
				request.setAttribute("menù", "il nome del menù è stato modificato correttamente");
				session.setAttribute("nome_menù", nome);
				request.getRequestDispatcher("gestionePortata.jsp").forward(request, response);
			} else {
				request.setAttribute("message", "impossibile modificare il nome del menù");
				request.getRequestDispatcher("modificaNomeMenu.jsp").forward(request, response);
			}
		} else
			response.sendRedirect("modificaNomeMenu.jsp");
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
