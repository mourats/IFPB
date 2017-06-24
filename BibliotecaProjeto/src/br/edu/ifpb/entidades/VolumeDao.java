package br.edu.ifpb.entidades;

import java.sql.*;

import br.edu.ifpb.connection.*;

public class VolumeDao {

	  private Connection connection;

	  public VolumeDao() {
	    this.connection = new ConnectionFactory().getConnection();
	  }
	 
	  
	  public boolean insert (Volume volume) throws SQLException {
		  try{
	          Connection connection = new ConnectionFactory().getConnection();
	          } catch (RuntimeException e){
	          	return false;
	          
	          }
		  String sql = "insert into tb_volume " +
		             "(ANO_PUBLIC,AUTOR,DESCRICAO,EDITORA,NUM_PAG,TIPO_VOLUME,TITULO)" +
		             " values (?,?,?,?,?,?,?);";
		             
		     try {
		    	 
		         // prepared statement para inserção
		         PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
		         
		         // seta os valores
		         stmt.setString(1,volume.getAno_public());
		         stmt.setString(2,volume.getAutor());
		         stmt.setString(3,volume.getDescricao());
		         stmt.setString(4,volume.getEditora());
		         stmt.setString(5,volume.getNum_pag());
		         stmt.setString(6,volume.getTipo());
		         stmt.setString(7,volume.getTitulo());
		         
		         
		         // executa
		         
		         stmt.execute();
		         stmt.close();
		         
		         
		     } catch (SQLException e) {
		         throw new RuntimeException(e);
		     }
		     return true;
	  }
	  
	  public void disconnect() throws SQLException {
			this.connection.close();	
	  }
}