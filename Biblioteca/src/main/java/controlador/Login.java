package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Login Form</title></head>");
        out.println("<body>");
        out.println("<h1>Login Form</h1>");
        out.println("<form method=\"post\" action=\"login\">");
        out.println("Correo: <input type=\"text\" name=\"correo\"><br>");
        out.println("Contraseña: <input type=\"password\" name=\"contraseña\"><br>");
        out.println("<input type=\"submit\" value=\"Ingresar\">");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String correo = request.getParameter("correo");
        String contraseña = request.getParameter("contraseña");
        System.out.println(correo);
        System.out.println(contraseña);
        // Aquí debes agregar el código para procesar la autenticación.
        // Por ejemplo, puedes verificar si el correo y la contraseña son válidos
        // y redirigir al usuario a una página de bienvenida o mostrar un mensaje de error.

        if (correo.equals("admin@example.com") && contraseña.equals("aaa")) {
            // Autenticación exitosa
            PrintWriter out = response.getWriter();

            out.println("<html>");
            out.println("<head><title>BIENVENIDO</title></head>");
            out.println("<body>");
            out.println("<h1>HOLA USUARIO</h1>");
            out.println("</body>");
            out.println("</html>");
        } else {
            // Autenticación fallida
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            out.println("<html>");
            out.println("<head><title>Error de autenticación</title></head>");
            out.println("<body>");
            out.println("<h1>Error de autenticación</h1>");
            out.println("<p>El correo o la contraseña son incorrectos.</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }


}
