package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MenùManager;

/**
 * Servlet implementation class GetPortate
 */
@WebServlet("/getportate")
public class GetPortate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id;
		HttpSession session = request.getSession();
		if ((request.getParameter("idmenu")) == null)
			id = (Integer) session.getAttribute("id_menù");
		else
			id = Integer.parseInt(request.getParameter("idmenu"));
		session.setAttribute("id_menù", id);
		String nome_menù = request.getParameter("namemenu");
		if (nome_menù != null)
			session.setAttribute("nome_menù", nome_menù);
		MenùManager mm = new MenùManager();
		request.setAttribute("portate", mm.getPortate(id));
		request.setAttribute("message_success", request.getAttribute("message_success"));
		request.getRequestDispatcher("gestionePortata.jsp").forward(request, response);
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
