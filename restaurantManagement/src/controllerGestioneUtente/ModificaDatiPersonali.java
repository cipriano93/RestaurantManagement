package controllerGestioneUtente;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelGestioneUtente.UtenteBean;
import modelGestioneUtente.UtenteBeanDAO;

/**
 * Servlet implementation class ModificaDatiPersonali
 */
@WebServlet("/ModificaDatiPersonali")
public class ModificaDatiPersonali extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String password = request.getParameter("pwd");
		String confirmPassword = request.getParameter("pwd_confirm");
		
		//prima della creazione controllo sulla chiave
		UtenteBeanDAO ubd = new UtenteBeanDAO();
		String regexName = "^[A-Za-z\\s]{3,}$";
		String regexSurname ="^[A-Za-z\\s]{3,}$";
		String regexPassword = "^(?=.*[0-9])(?=.*[A-Z]).{5,}$";
		
		//questo è un controllo più accurato, se l'email non rispetta il pattern, esce direttamente
		if(password.equals(confirmPassword) && password.matches(regexPassword) && name.matches(regexName) && surname.matches(regexSurname)) {
			//Creazione bean
			UtenteBean ub = new UtenteBean();
			ub.setNome(name);
			ub.setCognome(surname);
			ub.setPassword(password);
			
			boolean result = ubd.doUpdate(ub);
			
			if(result) {
				response.sendRedirect("outputModificaDatiPersonali.jsp");
			} else {
				request.setAttribute("errMessage", result);
				request.getRequestDispatcher("modificaDatiPersonali.jsp").forward(request, response);	
			}
		} else {
			response.sendRedirect("modificaDatiPersonali.jsp");
		}	
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
