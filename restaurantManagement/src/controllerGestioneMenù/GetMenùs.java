package controllerGestioneMenù;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelGestioneMenù.MenùManager;

/**
 * Servlet implementation class getMenù
 */
@WebServlet("/getmenus")
public class GetMenùs extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MenùManager mm = new MenùManager();
		request.setAttribute("menùs", mm.getMenùs());
		String message = (String) request.getAttribute("message_success");
		if (message != null)
			request.setAttribute("message_success", message);
		request.getRequestDispatcher("gestioneMenu.jsp").forward(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}