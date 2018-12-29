package controllerGestioneMenù;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelGestioneMenù.MenùManager;


/**
 * Servlet implementation class InserimentoMenù
 */

@WebServlet("/inserisci_menù")
public class InserimentoMenù extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("name");
		
		String regexName = "^[a-zA-Z0-9 ]+$";
		
		
		MenùManager mm = new MenùManager();
		
		//questo è un controllo più accurato, se il nome non rispetta il pattern, esce direttamente
		if (nome.matches(regexName)) {

			
			boolean result = mm.inserisci(ThreadLocalRandom.current().nextInt(10000, 99999 + 1), nome);
		
			if(result) {
				response.sendRedirect("outputInserimentoMenù.jsp");
			} else {
				request.setAttribute("errMessage", result);
				request.getRequestDispatcher("inserimentoMenù.jsp").forward(request, response);	
			}
		} else {
			response.sendRedirect("inserimentoMenù.jsp");
		}	
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
