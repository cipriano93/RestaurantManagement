package controllerGestioneCameriere;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelGestioneCameriere.CameriereManager;
import modelGestioneUtente.UtenteManager;

/**
 * Servlet implementation class RimozioneCameriere
 */
@WebServlet("/RimozioneCameriere")
public class RimozioneCameriere extends HttpServlet {
private static final long serialVersionUID = 1L;
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("usr");
		CameriereManager cm = new CameriereManager();
			
		boolean result = cm.rimozioneCameriere(username);
	
		if(result) {
			response.sendRedirect("gestioneCameriere.jsp");
		} else {
			request.setAttribute("errMessage", result);
			request.getRequestDispatcher("gestioneCameriere.jsp").forward(request, response);	
		}
	}	

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
