package br.edu.ifpb.dao;

import java.sql.*;

import br.edu.ifpb.connection.*;
import br.edu.ifpb.entidade.Usuario;

public class UsuarioDao {

	
		  private Connection connection;

		  public UsuarioDao() {
		    this.connection = new ConnectionFactory().getConnection();
		  }
		 
		  
		  public boolean insert (Usuario usuario) throws SQLException {
			  try{
		          @SuppressWarnings("unused")
				Connection connection = new ConnectionFactory().getConnection();
		          } catch (RuntimeException e){
		          	return false;
		          
		          }
			  String sql = "insert into tb_usuario " +
			             "(LOGIN, SENHA, RECORDE)" +
			             " values (?,?,?);";
			             
			     try {
			    	 
			         // prepared statement para inserção
			         PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
			         
			         // seta os valores
			         stmt.setString(1,usuario.getLogin());
			         stmt.setString(2,usuario.getSenha());
			         stmt.setInt(3,usuario.getRecorde());
			         
			         
			         // executa
			         
			         stmt.execute();
			         stmt.close();
			         
			         
			     } catch (SQLException e) {
			         throw new RuntimeException(e);
			     }
			     return true;
		  }
	}