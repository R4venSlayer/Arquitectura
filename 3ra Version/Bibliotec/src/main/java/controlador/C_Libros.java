package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


import modelo.Libreria;
import modelo.Libros.Libro;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Servlet implementation class C_Libros
 */


public class C_Libros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	public Libro libro;
	public ArrayList<Libro> leo = new ArrayList<Libro>();
	
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
		
		
		libro = new Libro(nombre, autor, id, categoria, cantidad);
		leo.add(libro);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
		Libro la;
		Libreria l = new Libreria();
		la = leo.get(0);
		leo.remove(0);
		l.add(la.getNombre(),la.getAutor(), 
				la.getId(), la.getCategoria(), 
				la.getCantidad());
		
		
		
		Gson gson = new Gson();
		
		if(la != null)
		{
			response.getWriter().append(gson.toJson(la));
		}
		
	}
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//Editar
		
	}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Libreria l = new Libreria();
		l.delete(libro.getNombre());
		response.getWriter().append("Se ha eliminado correctamente.");
		
	}	
	
	

}
