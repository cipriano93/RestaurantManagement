package controllerGestioneComanda;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelGestioneMenù.MenùBean;
import modelGestioneMenù.MenùManager;
import modelGestioneMenù.PortataBean;


/**
 * Servlet implementation class SelectMenu
 */
@WebServlet("/SelectMenu")
public class SelectMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String menu = request.getParameter("menu");
		String tipo = request.getParameter("tipo");
		String result = null;
		//per aggiungere le virgolette
		String quote = "\""; 
		
		MenùManager mm = new MenùManager();
		
		int id = mm.getIdMenuByNome(menu);
		ArrayList<PortataBean> portateByTipo = mm.getPortateByMenuTipo(id, tipo);
		PortataBean pb = new PortataBean();
		for(int i = 0; i < portateByTipo.size(); i++) {
			pb = portateByTipo.get(i);
			result += "<option value=" + quote + pb.getNome()+ quote +">" + pb.getNome()+ "</option>";
		}
		out.println(result);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
