package controllerGestionePrenotazione;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javafx.print.Printer;
import modelGestionePrenotazione.PrenotazioneManager;

/**
 * Servlet implementation class PrenotaTavolo
 */
@WebServlet("/PrenotaTavolo")
public class PrenotaTavolo extends HttpServlet {
private static final long serialVersionUID = 1L;
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");	
		String date = request.getParameter("date");
		String hour = request.getParameter("hour");
		String num_people = request.getParameter("num_people");
		String note = request.getParameter("note");
	
		//Validazione
		/*String regexDate = "^(((0[1-9]|[12]\\d|3[01])\\/(0[13578]|1[02])\\/((19|[2-9]\\d)\\d{2}))|((0[1-9]|[12]\\d|30)\\/(0[13456789]|1[012])\\/((19|[2-9]\\d)\\d{2}))|((0[1-9]|1\\d|2[0-8])\\/02\\/((19|[2-9]\\d)\\d{2}))|(29\\/02\\/((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))))$";
		String regexHuor = "/^[0-2]*[0-9](\\:[0-5]*[0-9])*$";
		Integer nPersone = Integer.parseInt(num_people);
		//String regexNumPeople ="^[0-9]$";
	
		//PrenotazioneManager pm = new PrenotazioneManager();
	
		//2018-11-30
		//Creazione Gregorian Calendar
		GregorianCalendar data = new GregorianCalendar();
		String anno = date.substring(0, 3);
		String mese = date.substring(5, 6);
		String giorno = date.substring(8,9);
		
		data.set(Integer.parseInt(anno), Integer.parseInt(mese)-1, Integer.parseInt(giorno), 4 ,5);
		
		PrintWriter out = response.getWriter();
*/
		if(username.equals("andrea")) {
	//	if(date.matches(regexDate) && hour.matches(regexHuor) && nPersone > 0 && note != null) {
			/*boolean result = pm.prenotaTavolo(username, nPersone, data, note);
			
			if(result) {
				HttpSession session = request.getSession();
				request.setAttribute("prenotazioneInserita", result);
				request.getRequestDispatcher("resultInserimento.jsp").forward(request, response);
			}
			else {
				//controllare!!!
				request.setAttribute("prenotazioneInserita", result);
				request.getRequestDispatcher("prenotaTavolo.jsp").forward(request, response);	
			}
			*/
			response.sendRedirect("resultInserimento.jsp");
		}
		else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
