package br.edu.ifpb.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String nome = request.getParameter("name");
		String senha = request.getParameter("senha");

		if ((nome.equals("admin") && (senha.equals("admin")))){
			response.sendRedirect("Menu.jsp");
		}else{
			response.sendRedirect("Index.jsp");
		}
	}
}
