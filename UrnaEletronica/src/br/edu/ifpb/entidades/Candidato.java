package br.edu.ifpb.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_candidato")
@NamedQuery(name = "Candidato.getAll", query = "from Candidato")

public class Candidato extends Eleitor {
	
	@Column(name = "num_candidato")
	private int num;
	
	@Column(name = "cargo_candidato")
	private String cargo;

	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
