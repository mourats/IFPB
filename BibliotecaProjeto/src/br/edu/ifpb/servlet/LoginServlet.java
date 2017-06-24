package br.edu.ifpb.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifpb.connection.ConnectionFactory;

@WebServlet("/LoginServlet.do")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");

		if ((nome.equals("admin") && (senha.equals("admin")))){
			response.sendRedirect("http://localhost:8080/BibliotecaProjeto/Redirecionamento.jsp");
		}else{
			response.sendRedirect("http://localhost:8080/BibliotecaProjeto/index.html");
		}

	}

}



