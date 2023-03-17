package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Libreria;
import modelo.Libros.Libro;
import modelo.Usuarios.Login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import com.google.gson.Gson;

/**
 * Servlet implementation class C_actualizar
 */
public class C_actualizar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	public Libro libro;
	public LinkedList<Libro> leo = new LinkedList<Libro>();
	
	
    public C_actualizar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Login l = new Login();
		String a=request.getParameter("a");
		libro = l.lecturalibro(a);
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
				la.getCantidad(),la.getUrl());
		
		Gson gson = new Gson();
		
		if(la != null)
		{
			response.getWriter().append(gson.toJson(la));
		}
		
	}
	
	@Override
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}