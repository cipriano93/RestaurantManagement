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
 * Servlet implementation class InserimentoCameriere
 */
@WebServlet("/InserimentoCameriere")
public class InserimentoCameriere extends HttpServlet {
private static final long serialVersionUID = 1L;
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("name");
		String cognome = request.getParameter("surname");
		String username = request.getParameter("usr");
		String password = request.getParameter("pwd");
		String confirmPassword = request.getParameter("pwd_confirm");
		
		String regexUsername = "^[0-9a-zA-Z]+$";
		
		
		CameriereManager cm = new CameriereManager();
		UtenteManager um = new UtenteManager();
		
		//questo è un controllo più accurato, se l'email non rispetta il pattern, esce direttamente
		if(username.matches(regexUsername) && password.equals(confirmPassword)
									&& (um.login(username, password)) == null) {

			
			boolean result = cm.inserimentoCameriere(username, password, nome, cognome, "cameriere");
		
			if(result) {
				response.sendRedirect("login.jsp");
			} else {
				request.setAttribute("errMessage", result);
				request.getRequestDispatcher("inserimentoCameriere.jsp").forward(request, response);	
			}
		} else {
			response.sendRedirect("inserimentoCameriere.jsp");
		}	
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
