package controllerGestioneComanda;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelGestioneComanda.ComandaManager;
import modelGestioneComanda.TavoloBean;

/**
 * Servlet implementation class ConfermaOrdine
 */
@WebServlet("/ConfermaOrdine")
public class ConfermaOrdine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
	 	ArrayList<TavoloBean> tavoli = (ArrayList<TavoloBean>) session.getAttribute("tavoli");
	 	ArrayList<TavoloBean> updatesTables = new ArrayList<TavoloBean>();
		String tavolo = request.getParameter("tavolo");
		
		ComandaManager cm = new ComandaManager();
		
		updatesTables = cm.aggiornaListaTavoli(tavoli, Integer.parseInt(tavolo),0);
	
		session.setAttribute("tavoli",updatesTables);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("selezionaTavolo.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
