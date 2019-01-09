package controllerGestioneComanda;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelGestioneComanda.ComandaBean;
import modelGestioneComanda.ComandaManager;
import modelGestioneComanda.TavoloBean;
import modelGestioneMenù.MenùManager;


/**
 * Servlet implementation class RimozionePortataComanda
 */

@WebServlet("/RimozionePortataComanda")
public class RimozionePortataComanda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ServletContext application = request.getServletContext();
		String id = request.getParameter("remove");
		TavoloBean tb = (TavoloBean) session.getAttribute("tavolo");
		ComandaBean cb = (ComandaBean) application.getAttribute("comanda" + tb.getNumeroTavolo());
		ComandaManager cm = new ComandaManager();
		
		cm.rimozionePortataComanda(cb, Integer.parseInt(id));
		request.setAttribute("message_rimozione", true);
		request.getRequestDispatcher("gestioneComanda.jsp").forward(request, response);
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
