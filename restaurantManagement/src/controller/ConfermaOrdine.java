package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.ComandaBean;
import model.ComandaManager;
import model.TavoloBean;

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
	 	ServletContext application = request.getServletContext();
		ArrayList<TavoloBean> tavoli = (ArrayList<TavoloBean>) application.getAttribute("tavoli");
	 	ArrayList<TavoloBean> updatesTables = new ArrayList<TavoloBean>();
		TavoloBean tb = (TavoloBean) session.getAttribute("tavolo");
		
		ComandaManager cm = new ComandaManager();
		
		updatesTables = cm.aggiornaListaTavoli(tavoli, tb.getNumeroTavolo(), 0);
		
		ComandaBean cb = (ComandaBean) application.getAttribute("comanda" + tb.getNumeroTavolo());
		
		if (!(cm.inserimentoOrdine(cb, (Double) session.getAttribute("totale_ordine")))) {
			request.setAttribute("message", true);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("anteprimaOrdine.jsp");
			requestDispatcher.forward(request, response);
		} else {
			request.setAttribute("message", true);
			application.setAttribute("comanda" + tb.getNumeroTavolo(), null);
			session.setAttribute("tavoli", updatesTables);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("selezionaTavolo.jsp");
			requestDispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
