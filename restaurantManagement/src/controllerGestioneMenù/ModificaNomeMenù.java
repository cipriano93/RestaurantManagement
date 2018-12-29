package controllerGestioneMenù;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelGestioneMenù.MenùManager;
import modelGestioneMenù.MenùBean;


/**
 * Servlet implementation class ModificaMenù
 */

@WebServlet("/modifica_nome_menù")
public class ModificaNomeMenù extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("name");
		String regName = "^[a-zA-Z0-9 ]+$";
		if (nome.matches(regName)) {
			HttpSession session = request.getSession();
			MenùBean mb = (MenùBean) session.getAttribute("menùBean");
			MenùManager mm = new MenùManager();
			boolean result = mm.modificaNome(mb.getIdMenù(), nome);
			if (result) {
				mb.setNome(nome);
				session.setAttribute("menùBean", mb);
				response.sendRedirect("gestioneMenù.jsp");
			}
			else {
				request.setAttribute("errMessage", result);
				request.getRequestDispatcher("modificaNomeMenù.jsp").forward(request, response);
			}
		} else
			response.sendRedirect("gestioneMenù.jsp");
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
