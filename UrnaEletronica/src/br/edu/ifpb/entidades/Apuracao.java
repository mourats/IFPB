package br.edu.ifpb.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_apuracao")
@NamedQuery(name = "Apuracao.getAll", query = "from Apuracao")
public class Apuracao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pessoa")
	private int id;
	

	@Column(name = "quantidade_votos")
	private int qnt_votos;
	
	
	@Column(name = "quantidade_brancos")
	private int qnt_brancos;
	
	
	@Column(name = "quantidade_nulos")
	private int qnt_nulos;
	
	
	@Column(name = "quantidade_ausentes")
	private int qnt_ausentes;
	
	
	@Column(name = "cadidato_mais_votado")
	private int candidato_mais_votado;
	
	
	@Column(name = "cadidato_menos_votado")
	private int candidato_menos_votado;
	
	
	@Column(name = "cadidato_eleito")
	private int candidato_eleito;
	
	
	@Column(name = "candidatos_segundo_turno")
	private int candidatos_segundo_turno;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQnt_votos() {
		return qnt_votos;
	}

	public void setQnt_votos(int qnt_votos) {
		this.qnt_votos = qnt_votos;
	}

	public int getQnt_brancos() {
		return qnt_brancos;
	}

	public void setQnt_brancos(int qnt_brancos) {
		this.qnt_brancos = qnt_brancos;
	}

	public int getQnt_nulos() {
		return qnt_nulos;
	}

	public void setQnt_nulos(int qnt_nulos) {
		this.qnt_nulos = qnt_nulos;
	}

	public int getQnt_ausentes() {
		return qnt_ausentes;
	}

	public void setQnt_ausentes(int qnt_ausentes) {
		this.qnt_ausentes = qnt_ausentes;
	}

	public int getCandidato_mais_votado() {
		return candidato_mais_votado;
	}

	public void setCandidato_mais_votado(int candidato_mais_votado) {
		this.candidato_mais_votado = candidato_mais_votado;
	}

	public int getCandidato_menos_votado() {
		return candidato_menos_votado;
	}

	public void setCandidato_menos_votado(int candidato_menos_votado) {
		this.candidato_menos_votado = candidato_menos_votado;
	}

	public int getCandidato_eleito() {
		return candidato_eleito;
	}

	public void setCandidato_eleito(int candidato_eleito) {
		this.candidato_eleito = candidato_eleito;
	}

	public int getCandidatos_segundo_turno() {
		return candidatos_segundo_turno;
	}

	public void setCandidatos_segundo_turno(int candidatos_segundo_turno) {
		this.candidatos_segundo_turno = candidatos_segundo_turno;
	}

}