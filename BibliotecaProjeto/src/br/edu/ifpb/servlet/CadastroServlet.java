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
import br.edu.ifpb.entidades.Volume;
import br.edu.ifpb.entidades.VolumeDao;

/**
 * Servlet implementation class CadastroServlet
 */
@WebServlet("/CadastroServlet")
public class CadastroServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
		Volume volume = new Volume();
		
		VolumeDao volumedao = new VolumeDao();
		
		volume.setAno_public(request.getParameter("anopub"));
		volume.setAutor(request.getParameter("autor"));
		volume.setDescricao(request.getParameter("descricao"));
		volume.setEditora(request.getParameter("editora"));
		volume.setTipo(request.getParameter("tipo"));
		volume.setNum_pag(request.getParameter("numpag"));
		volume.setEditora(request.getParameter("editora"));
		
		try {
			
			volumedao.insert(volume);
			volumedao.disconnect();
			
		} catch (SQLException e) {
			
			System.out.println("não funfou pcr");
		}
		
		response.sendRedirect("index.html");
	}

}
