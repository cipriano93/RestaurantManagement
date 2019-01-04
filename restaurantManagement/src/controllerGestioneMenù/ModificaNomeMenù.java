package controllerGestioneMenù;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
		String nome = request.getParameter("name");
		String regName = "^[a-zA-Z0-9 ]+$";
		if (nome.matches(regName)) {
			int id = Integer.parseInt(request.getParameter("id_menù"));
			MenùManager mm = new MenùManager();
			boolean result = mm.modificaNome(id, nome);
			if (result)
				response.sendRedirect("gestioneMenù.jsp");
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
