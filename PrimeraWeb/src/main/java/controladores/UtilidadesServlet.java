package controladores;

import java.io.PrintWriter;

public class UtilidadesServlet {
	
	public static void imprimirCabecera(String titulo,PrintWriter out) {
		out.println("<!DOCTYPE html>\r\n"
				+ "<html lang=\"es\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>" +titulo+"</title>\r\n"
				+ "</head>\r\n"
				+ "<body>");
	}
	
	public static void imprimirPie(PrintWriter out) {
		out.println("</body>\r\n"
				+ "</html>");
		
	}
}