package controllerGestioneUtente;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelGestioneUtente.UtenteManager;


/**
 * Servlet implementation class Registrazione
 */

@WebServlet("/Registrazione")
public class Registrazione extends HttpServlet {
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
		
		/*String regexUsername = "^[0-9a-zA-Z]+$";
		String regexName = "^[A-Za-z\\s]{3,}$";
		String regexSurname ="^[A-Za-z\\s]{3,}$";
		String regexPassword = "^(?=.*[0-9])(?=.*[A-Z]).{5,}$";*/
		
		
		UtenteManager um = new UtenteManager();
		
		//questo è un controllo più accurato, se la username non rispetta il pattern, esce direttamente
		
		boolean result = um.registrazione(username, password, nome, cognome, "cliente");
		
		if(result) {
			response.sendRedirect("login.jsp");	
		} else {
			request.setAttribute("errMessage", "Username già utilizzata. Inserire un'altra username");
			request.getRequestDispatcher("registrazione.jsp").forward(request, response);
		}	
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
