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
import javax.servlet.ServletContext;

import modelGestioneComanda.ComandaBean;
import modelGestioneComanda.ComandaManager;
import modelGestioneComanda.TavoloBean;

/**
 * Servlet implementation class SelezionaTavolo
 */
@WebServlet("/SelezionaTavolo")
public class SelezionaTavolo extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 	//Prendo la lista dei tavoli dalla sessione
		HttpSession session = request.getSession();
		ServletContext application = request.getServletContext();
		
	 	ArrayList<TavoloBean> tavoli = (ArrayList<TavoloBean>) application.getAttribute("tavoli");
	 	ArrayList<TavoloBean> updatesTables = new ArrayList<TavoloBean>();
		String tavolo = request.getParameter("tavolo");
		String numPersone = request.getParameter("num_people");
		TavoloBean tb = new TavoloBean();
		tb.setNumeroTavolo(Integer.parseInt(tavolo));
		tb.setNumeroPersone(Integer.parseInt(numPersone));
		
		
		ComandaManager cm = new ComandaManager();
		ComandaBean cb = cm.newComanda(Integer.parseInt(tavolo), Integer.parseInt(numPersone));
		updatesTables = cm.aggiornaListaTavoli(tavoli, Integer.parseInt(tavolo), Integer.parseInt(numPersone));
	
		session.setAttribute("tavolo", tb);
		application.setAttribute("comanda"+tavolo , cb);
		application.setAttribute("tavoli",updatesTables);
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
