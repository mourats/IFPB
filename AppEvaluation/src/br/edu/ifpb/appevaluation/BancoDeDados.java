package br.edu.ifpb.appevaluation;

import java.io.Serializable;

/**
 * Created by Thiago Santos on 26/11/2015.
 */

public class BancoDeDados implements Serializable { 

	private static final long serialVersionUID = 1L;

	private int ID;
	private String NOTA;
	private String NOME_AVALIADOR;
	private String TITULO_TRABALHO; 
	private String COMENTARIO;


	public int getID() {
		return ID;
	}

	public void setID(int id) {
		ID = id;
	}

	public String getNOTA() {
		return NOTA;
	}

	public void setNOTA(String nota) {
		NOTA = nota;
	}

	public String getNOME_AVALIADOR() {
		return NOME_AVALIADOR;
	}

	public void setNOME_AVALIADOR(String nome_avaliador) {
		NOME_AVALIADOR = nome_avaliador;
	}

	public String getTITULO_TRABALHO() {
		return TITULO_TRABALHO;
	}

	public void setTITULO_TRABALHO(String titulo_trabalho) {
		TITULO_TRABALHO = titulo_trabalho;
	}

	public String getCOMENTARIO() {
		return COMENTARIO;
	}

	public void setCOMENTARIO(String comentario) {
		COMENTARIO = comentario;
	}
}