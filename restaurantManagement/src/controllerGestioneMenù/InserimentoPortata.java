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
 * Servlet implementation class InserimentoPortata
 */

@WebServlet("/inserisciportata")
public class InserimentoPortata extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nameportata");
		String tipo = request.getParameter("type");
		String prezzo = request.getParameter("price");
		String descrizione = request.getParameter("description");
		String regexName = "^[a-zA-Z0-9 ]+$";
		String regexPrice = "^[0-9]{1,2}\\.[0-9]{1,2}$";
		if (nome.matches(regexName) && prezzo.matches(regexPrice)) {
			MenùManager mm = new MenùManager();
			HttpSession session = request.getSession();
			boolean result = mm.inserimentoPortata((Integer) session.getAttribute("id_menù"), nome, tipo, prezzo, descrizione);
			if (result) {
				request.setAttribute("message_success", "portata inserita correttamente");
				request.getRequestDispatcher("getportate").forward(request, response);
			} else {
				request.setAttribute("message", "impossibile inserire la portata nel menù");
				request.getRequestDispatcher("inserimentoPortata.jsp").forward(request, response);
			}
		} else
			response.sendRedirect("inserimentoPortata.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
