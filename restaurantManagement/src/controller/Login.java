package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UtenteBean;
import model.UtenteManager;


/**
 * Servlet implementation class Login
 */

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UtenteBean userB = getUsrPsw(request);
		
		if(userB == null)
			//se nn viene creato userBean, significa che i parametri non rispettavano i pattern, e quindi lancia l'eccezione
			response.sendRedirect("login.jsp");
		else {
			try {
				UtenteManager um = new UtenteManager();
				UtenteBean ub = um.login(userB.getUsername(), userB.getPassword());
		
				if(ub == null) {
					request.setAttribute("message_danger", true);
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
					requestDispatcher.forward(request, response);
				} else {
					Cookie usrCookie = new Cookie("usr", ub.getUsername());
					Cookie pswCookie = new Cookie("pswd", ub.getPassword());
					response.addCookie(usrCookie);
					response.addCookie(pswCookie);
				
					HttpSession session = request.getSession();
					session.setAttribute("utenteBean", ub);
					if(ub.getTipo().equals("cliente"))
						response.sendRedirect("index.jsp");
					else if(ub.getTipo().equals("gestore"))
						response.sendRedirect("areaPersonaleGestore.jsp");
					else if(ub.getTipo().equals("cameriere"))
						response.sendRedirect("selezionaTavolo.jsp");
				}
			}
			catch (Exception e) {
				request.setAttribute("exception", e);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("exception.jsp");
				requestDispatcher.forward(request, response);
			}
		}
			
	}
	
	
	private UtenteBean getUsrPsw(HttpServletRequest request) {
		UtenteBean ub = null;
		String usr = null;
		String pswd = null;
		
		/* Cookies */
		Cookie[] c = request.getCookies();
		if(c != null) {
			for(int i=0; i<c.length; i++) {
				if(c[i].getName().equals("usr"))
					usr = c[i].getValue();
				else if(c[i].getName().equals("pswd"))
					pswd = c[i].getValue();
			}
		}
		
		/* Request */
		if( (usr == null) || (pswd == null) ) {
			/*String regexUsername = "^[0-9a-zA-Z]+$";
			String regexPassword = "^(?=.*[0-9])(?=.*[A-Z]).{5,}$";*/
			
			String temp = request.getParameter("usr");		
			if(temp != null/*&& temp.matches(regexUsername)*/) {
				usr = temp;
				temp = request.getParameter("pswd");
				if(temp != null/*&& temp.matches(regexPassword)*/) {
					pswd = temp;
				}
			}
		}
		
		
		System.out.println("usr: "+ usr);
		if( (usr != null) && (pswd != null) ) {
			ub = new UtenteBean();
			ub.setUsername(usr);
			ub.setPassword(pswd);
		}
		return ub;
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
