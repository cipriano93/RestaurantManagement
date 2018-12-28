package controller;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Logout")
public class Logout extends HttpServlet {
	// Costruttori
	public Logout() {
	}

	// Metodi
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = getServletContext();
		Integer applicationCount = (Integer)application.getAttribute("counter");
		if(applicationCount != null)
			applicationCount = Integer.valueOf(applicationCount.intValue() + 1);
		else
			applicationCount = Integer.valueOf(1);
		application.setAttribute("counter", applicationCount);
		
		/* Removing cookies */
		Cookie cUsr = new Cookie("usr", "");
		cUsr.setMaxAge(0);
		response.addCookie(cUsr);
		Cookie cPass = new Cookie("pswd", "");	
		cPass.setMaxAge(0);
		response.addCookie(cPass);
		
		/* Invalidating the session */
		request.getSession().invalidate();
		
		response.sendRedirect("index.jsp");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	// Variabili di istanza
	private static final long serialVersionUID = 1L;
}
