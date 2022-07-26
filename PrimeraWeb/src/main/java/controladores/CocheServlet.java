package controladores;

import java.io.IOException;
import java.io.PrintWriter;
/**
 * borramos los import y con control+mayuscula+o introducimos los jakarta.
 */
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CocheServlet
 */
@WebServlet("/nuevoCoche")
public class CocheServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CocheServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * llamamos al printwriter
		 */
		PrintWriter out = response.getWriter();
		
		/**
		 * llamamos la la funcion UtiliadesServlet para cabecera
		 */
		UtilidadesServlet.imprimirCabecera("Introduce datos del nuevo coche", out);
		
		/**
		 * creamos el cuerpo del formulario creamos las variables
		 */
		String matricula = request.getParameter("matricula");
		String marca = request.getParameter("marca");
		String modelo = request.getParameter("modelo");
		Integer potencia = Integer.parseInt(request.getParameter("potencia"));
		String tipo = request.getParameter("tipo");
		
		/**
		 * creamos una lista no ordenada para el formulario
		 */
		out.println("<h2> Datos introducidos </h2>");
		
		out.println("<ul>");
		out.println("<li> Matricula: "+matricula+"</li>");
		out.println("<li> Marca: "+marca+"</li>");
		out.println("<li> Modelo: "+modelo+"</li>");
		out.println("<li> Potencia: "+potencia+"</li>");
		out.println("<li> Tipo: "+tipo+"</li>");
		out.println("</ul>");
		
		/**
		 * llamamos a la funcion de utilidadesServlet para el pie de página
		 */
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
