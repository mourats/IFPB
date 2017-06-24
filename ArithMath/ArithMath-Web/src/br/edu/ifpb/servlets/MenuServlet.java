package br.edu.ifpb.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.edu.ifpb.algoritmo.Algoritmo;
import br.edu.ifpb.algoritmo.Valores;
import br.edu.ifpb.entidade.Usuario;
/**
 * Servlet implementation class MenuServlet
 */

@WebServlet("/MenuServlet.do")
public class MenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		Algoritmo round = new Algoritmo();
		Valores valores = round.Round();
		Usuario usuario = new Usuario();

		session.setAttribute("soma", valores.getResultado());
		session.setAttribute("numeros", valores.getNumeros());
		session.setAttribute("recorde", usuario.getRecorde());

		RequestDispatcher rq = request.getRequestDispatcher("Jogo.jsp");
		rq.forward(request, response);	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		Algoritmo round = new Algoritmo();
		Valores valores = round.Round();

		session.setAttribute("soma", valores.getResultado());
		session.setAttribute("numeros", valores.getNumeros());
		session.setAttribute("recorde", session.getAttribute("recorde"));

		RequestDispatcher rq = request.getRequestDispatcher("Jogo.jsp");
		rq.forward(request, response);	
	}
	
}
