package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserBean;
import model.UserBeanDAO;

@WebServlet("/Registration")
public class Registration extends HttpServlet {
	public Registration() {}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String email = request.getParameter("email");
		String password = request.getParameter("pwd");
		String confirmPassword = request.getParameter("pwd_confirm");
		
		//prima della creazione controllo sulla chiave
		UserBeanDAO ubd = new UserBeanDAO();
		String regexName = "^[A-Za-z\\s]{3,}$";
		String regexSurname ="^[A-Za-z\\s]{3,}$";
		String regexEmail = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		String regexPassword = "^(?=.*[0-9])(?=.*[A-Z]).{5,}$";
		
		//questo è un controllo più accurato, se l'email non rispetta il pattern, esce direttamente
		if(email.matches(regexEmail) &&	(password.equals(confirmPassword)) && password.matches(regexPassword)  
									&& name.matches(regexName) && surname.matches(regexSurname)
									&& ubd.doRetrieveByKeyOnlyEmail(email)) {
			//Creazione bean
			UserBean ub = new UserBean();
			ub.setName(name);
			ub.setSurname(surname);
			ub.setEmail(email);
			ub.setPassword(password);
			
			boolean result = ubd.doSave(ub);
			
			if(result) {
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}else {
				request.setAttribute("errMessage", result);
				request.getRequestDispatcher("signup.jsp").forward(request, response);	
			}
		} else {
			request.getRequestDispatcher("signup.jsp").forward(request, response);
		}	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	private static final long serialVersionUID = 1L;
}
