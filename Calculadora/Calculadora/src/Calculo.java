import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculo extends HttpServlet {
	double n1, n2;
	PrintWriter writer;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		n1 = Double.parseDouble(req.getParameter("n1"));
		n2 = Double.parseDouble(req.getParameter("n2"));
		double result = n1 + n2;
		double result2 = n1 - n2;
		double result3 = n1 * n2;
		double result4 = n1 / n2;
		res.setContentType("text/html");
		writer = res.getWriter();
		writer.println("Página de calcular!");
		writer.println("<ul>"); // ul = lista nao ordenada -- ol = lista organizada
		writer.println("<li>Resultado da soma: " + result + "</li>");
		writer.println("<li>Resultado da subtração: " + result2 + "</li>");
		writer.println("<li>Resultado da multiplicação: " + result3 + "</li>");
		writer.println("<li>Resultado da divisão: " + result4 + "</li>");
	}

}
