package br.edu.ifpb.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.edu.ifpb.entidade.Usuario;

/**
 * Servlet implementation class AvaliacaoServlet
 */
@WebServlet("/AvaliacaoServlet.do")
public class AvaliacaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int resultado;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		Usuario usuario = new Usuario();
		usuario.setRecorde((int) session.getAttribute("recorde"));

		for(int i=1;i<21;i++){

			if(request.getParameter("num" + i) != null){
				resultado += i;  
				System.out.println(" ");
				System.out.println(request.getParameter("num" + i));
			}
		}
		System.out.println("Resultado: " + resultado);

		if((int) session.getAttribute("soma") == resultado){
			session.setAttribute("recorde", usuario.getRecorde() + 1);
			RequestDispatcher rq = request.getRequestDispatcher("MenuServlet.do");
			rq.forward(request, response);
		}else
			response.sendRedirect("GameOver.jsp");

		resultado = 0;
	}
}