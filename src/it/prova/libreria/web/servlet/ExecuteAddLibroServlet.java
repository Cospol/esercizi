package it.prova.libreria.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.libreria.model.Libro;

/**
 * Servlet implementation class ExecuteAddLibroServlet
 */
@WebServlet("/ExecuteAddLibroServlet")
public class ExecuteAddLibroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExecuteAddLibroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titoloParameter = request.getParameter("titoloInput");
		String genereParameter = request.getParameter("genereInput");
		String pagineParameter = request.getParameter("pagineInput");
		Libro libroParameter = new Libro(titoloParameter, genereParameter, Integer.parseInt(pagineParameter));
		if (ExecuteRicercaLibroServlet.libri.add(libroParameter)) {
			request.setAttribute("result", "libro inserito correttamente");
		}
		else {
			request.setAttribute("result", "libro non inserito");
		}
		RequestDispatcher rd = request.getRequestDispatcher("risultatoInserimentoLibro.jsp");
		rd.forward(request, response);
		
	}

}
