package br.edu.ifpb.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_eleitor")
@NamedQuery(name = "Eleitor.getAll", query = "from Eleitor")

public class Eleitor extends Pessoa {

	@Column(name = "sessao_eleitor")
	private String sessao;
	
	@Column(name = "titulo_eleitor")
	private String titulo;

	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSessao() {
		return sessao;
	}

	public void setSessao(String sessao) {
		this.sessao = sessao;
	}
	
}
