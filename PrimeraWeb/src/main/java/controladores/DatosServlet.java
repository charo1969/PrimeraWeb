package controladores;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class DatosPersonales
 */
@WebServlet("/resumenEmpleado")
public class DatosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DatosServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		UtilidadesServlet.imprimirCabecera("Introduce datos personales", out);
		
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String provincia = request.getParameter("provincia");
		
		//devuelve varios datos con getParameterValues.
		String[] conocimientos = request.getParameterValues("conocimientos[]"); 
		String fechaNacimiento = request.getParameter("fechaNacimiento");
		Integer experiencia = Integer.parseInt(request.getParameter("experiencia"));
		
		
		/**
		 * mostrar en pantalla los datos
		 */
		out.println("<h1>Datos Personales Empleado</h1>");
		
		out.println("<ul>");
		out.println("<li>Nombre: "+nombre+"</li>");
		out.println("<li>Apellidos: "+apellidos+"</li>");
		out.println("<li>Provincia: "+provincia+"</li>");
		
		out.println("<li>Conocimientos: ");
			if(conocimientos == null || conocimientos.length==0) {
				out.print("NO se han registrado conocimientos </li>");
				
			}else {
				out.println("<ul>");
				for (String c : conocimientos) {
					out.println("<li>"+c+"</li>");
					
				}
				out.println("</ul>");
				out.println("</li>");
				
			}
		
		out.println("<li>FechaNacimiento: "+fechaNacimiento+"</li>");
		out.println("<li>Experiencia: "+experiencia+"</li>");
		out.println("</ul>");
		
		
		
		
		
		UtilidadesServlet.imprimirPie(out);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
