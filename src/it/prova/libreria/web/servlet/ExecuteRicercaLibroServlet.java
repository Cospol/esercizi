package it.prova.libreria.web.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.libreria.model.Libro;

 

/**
 * Servlet implementation class ExecuteRicercaLibroServlet
 */
@WebServlet("/ExecuteRicercaLibroServlet")
public class ExecuteRicercaLibroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     public static ArrayList<Libro> libri = new ArrayList<Libro>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExecuteRicercaLibroServlet() {
        super();
        Libro libro = new Libro("titolo1", "drammatico", 200);
        libri.add(libro);
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
		 String titoloInput = request.getParameter("titolo") ;
		 String genereInput = request.getParameter("genere") ;
		 String pagineInput = request.getParameter("pagine");
		 RequestDispatcher rd = null;
		 if (titoloInput != null && genereInput != null && pagineInput != null 
				 && titoloInput != "" && genereInput != ""  && pagineInput != "" 	) {
			 try {
				 Libro libroInput = new Libro(titoloInput,genereInput,Integer.parseInt(pagineInput));
				 if (libri.contains(libroInput)) {
					 request.setAttribute("libro_attribute", libroInput);
					 rd = request.getRequestDispatcher("mostraLibro.jsp");
				 }
				 else {
 					 rd = request.getRequestDispatcher("creaLibro.jsp");
				}
				 rd.forward(request, response);
				 
			} catch (NumberFormatException e) {
				e.printStackTrace();
 			}
 			 
		 } 
	}

}
