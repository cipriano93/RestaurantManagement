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
 * Servlet implementation class ModificaPortataComanda
 */
@WebServlet("/ModificaPortataComanda")
public class ModificaPortataComanda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		TavoloBean tb = (TavoloBean) session.getAttribute("tavolo"); 

		ServletContext application = request.getServletContext();
		
		String quantity = request.getParameter("quantity");
		String green = request.getParameter("green");
		String red = request.getParameter("red");
		String idPortata = request.getParameter("idPortata");
		
		ComandaManager cm = new ComandaManager();
		ComandaBean cb = (ComandaBean) application.getAttribute("comanda"+tb.getNumeroTavolo());
		boolean stato = false;
		
		if(request.getParameter("cliccatoQuantity") != null) {
			cm.modificaPortataComandaQuantity(cb, Integer.parseInt(idPortata), Integer.parseInt(quantity));
		}else if(request.getParameter("cliccatoStato") != null){
			if(green != null && red == null)
				stato = false;
			else if(green == null && red != null)
				stato = true;
			cm.modificaPortataComandaStato(cb, Integer.parseInt(idPortata), stato);
		}
		application.setAttribute("comanda"+tb.getNumeroTavolo(), cb);
		request.setAttribute("message_modifica", true);
		request.getRequestDispatcher("gestioneComanda.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
