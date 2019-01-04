package controllerGestioneMenù;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelGestioneMenù.MenùManager;


/**
 * Servlet implementation class InserimentoMenù
 */

@WebServlet("/inseriscimenu")
public class InserimentoMenù extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("namemenu");
		
		String regexName = "^[a-zA-Z0-9 ]+$";
		
		//questo è un controllo più accurato, se il nome non rispetta il pattern, esce direttamente
		if (nome.matches(regexName)) {
			MenùManager mm = new MenùManager();
			
			boolean result = mm.inserimento(nome);
		
			if(result) {
				request.setAttribute("message", "il menù è stato inserito correttamente.");
				request.getRequestDispatcher("getmenus").forward(request, response);
			} else {
				request.setAttribute("message", "impossibile inserire il menù.");
				request.getRequestDispatcher("inserimentoMenu.jsp").forward(request, response);	
			}
		} else
			response.sendRedirect("inserimentoMenu.jsp");
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
