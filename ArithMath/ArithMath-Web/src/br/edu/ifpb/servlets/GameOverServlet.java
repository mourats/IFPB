package br.edu.ifpb.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GameOverServlet
 */
@WebServlet("/GameOverServlet.do")
public class GameOverServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rq = request.getRequestDispatcher("Menu.jsp");
		rq.forward(request, response);	
	}

}
