package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import modelo.A_Libros;
import modelo.Libreria;
import modelo.Libros.Libro;

import java.io.IOException;

/**
 * Servlet implementation class C_Libros
 */


public class C_Libros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
    public C_Libros() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String nombre=request.getParameter("nombre");
		String autor=request.getParameter("autor");
		String id=request.getParameter("id");
		String categoria=request.getParameter("categoria");
		String cantidad=request.getParameter("cantidad");
		
		Libreria l = new Libreria();
		l.add(nombre, autor, id, categoria, cantidad);
		
		
		response.getWriter().append("Se ha agregado correctamente.");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

}
