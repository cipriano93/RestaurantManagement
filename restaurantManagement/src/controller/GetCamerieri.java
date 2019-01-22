package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CameriereManager;


/**
 * Servlet implementation class GetCamerieri
 */

@WebServlet("/GetCamerieri")
public class GetCamerieri extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CameriereManager cm = new CameriereManager();
		request.setAttribute("camerieri", cm.getCamerieri());
		String message = (String) request.getAttribute("message");
		if (message != null)
			request.setAttribute("message", message);
		Boolean message_rimozione = (Boolean) request.getAttribute("message_rimozione");
		if (message_rimozione != null)
			request.setAttribute("message_rimozione", message_rimozione);
		request.getRequestDispatcher("gestioneCameriere.jsp").forward(request, response);
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
