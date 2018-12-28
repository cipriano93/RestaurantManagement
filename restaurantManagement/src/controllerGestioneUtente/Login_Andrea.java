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

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

import model.UserBean;
import model.UserBeanDAO;

@WebServlet("/Login")
public class Login extends HttpServlet {
	// Costruttori
	public Login() {
	}
	
	// Metodi
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserBean userB = getUsrPsw(request);
		
		if(userB == null)
			//se nn viene creato userBean, significa che i parametri non rispettavano i pattern, e quindi lancia l'eccezione
			response.sendRedirect("login.jsp");
		else {
			try {
				UserBeanDAO ubd = new UserBeanDAO();
				UserBean ub = ubd.doRetrieveByKey(userB.getEmail(), userB.getPassword());
				if(ub == null) {
					request.setAttribute("denied", Boolean.valueOf(true));
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
					requestDispatcher.forward(request, response);
				}
				else {
					Cookie usrCookie = new Cookie("usr", ub.getEmail());
					Cookie pswCookie = new Cookie("pswd", ub.getPassword());
					response.addCookie(usrCookie);
					response.addCookie(pswCookie);
					
					request.setAttribute("userBean", ub);
					HttpSession session = request.getSession();
					session.setAttribute("userBean", ub);
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("loggedIn.jsp");
					requestDispatcher.forward(request, response);
				}
			}
			catch (Exception e) {
				request.setAttribute("exception", e);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("exception.jsp");
				requestDispatcher.forward(request, response);
			}
		}
			
	}
	
	private UserBean getUsrPsw(HttpServletRequest request) {
		UserBean ub = null;
		String email = null;
		String pswd = null;
		
		/* Cookies */
		Cookie[] c = request.getCookies();
		if(c != null) {
			for(int i=0; i<c.length; i++) {
				if(c[i].getName().equals("email"))
					email = c[i].getValue();
				else if(c[i].getName().equals("pswd"))
					pswd = c[i].getValue();
			}
		}
		
		/* Request */
		if( (email==null) || (pswd==null) ) {
			String regexEmail = "[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
			String regexPassword = "^(?=.*[0-9])(?=.*[A-Z]).{5,}$";
			
			String temp = request.getParameter("email");		
			if(temp != null && temp.matches(regexEmail)) {
				email = temp;
				temp = request.getParameter("pswd");
				if(temp != null && temp.matches(regexPassword)) {
					pswd = temp;
				}
			}
		}
		if( (email != null) && (pswd != null) ) {
			ub = new UserBean();
			ub.setEmail(email);
			ub.setPassword(pswd);
		}
		return ub;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	// Variabili di istanza
	private static final long serialVersionUID = 1L;
}