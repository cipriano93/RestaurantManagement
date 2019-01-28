package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ComandaManager;
import model.OrdineBean;

/**
 * Servlet implementation class VisualizzaBilancio
 */

@WebServlet("/VisualizzaBilancio")
public class VisualizzaBilancio extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ComandaManager cm = new ComandaManager();
		
		String value = request.getParameter("orderBy");
		
		ArrayList<OrdineBean> obs = null;
		
		if (value != null) {
			if (value.equals("all"))
				obs = cm.getOrdini();
			else if (value.equals("giorno"))
				obs = cm.getOrdiniByLastDay();
			else if (value.equals("mese"))
				obs = cm.getOrdiniByLastMonth();
			else
				obs = cm.getOrdiniByLastYear();
		}
		
		if (obs != null) {
			int size = obs.size();
			String result = "<tr>" +
								"<th style=\"text-align: center\">Data</th>" + 
								"<th style=\"text-align: center\">N.coperti</th>" + 
								"<th style=\"text-align: center\">Totale</th>" + 
							"</tr>";
			for (int i = 0; i < size; i++) {
				OrdineBean ob = obs.get(i);
				GregorianCalendar gc = ob.getData();
				result += "<tr>" + 
							"<td>" + gc.get(gc.DAY_OF_MONTH) + "/";
				int month = gc.get(gc.MONTH) + 1;
				if (month >= 1 && month <= 9)
					result += "0";
				result += month + "/" + gc.get(gc.YEAR) + " " + gc.get(gc.HOUR_OF_DAY) + ":";
				int minute = gc.get(gc.MINUTE);
				if (minute >= 0 && minute <= 9)
					result += "0";
				result += minute + "</td>" +
							"<td>" + ob.getNumCoperti() + "</td>" + 
							"<td>" + ob.getTotale() + " &euro;</td>" + 
						  "</tr>";
			}
			PrintWriter out = response.getWriter();
			out.println(result);
		}
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
