package br.edu.ifpb.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoa")
@NamedQuery(name = "Pessoa.getAll", query = "from Pessoa")

public class Pessoa {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id_pessoa")
	private int id;
	
	@Column(name = "nome_pessoa")
	private String nome;
	
	@Column(name = "endereco_pessoa")
	private String endereco;
	
	@Column(name = "cpf_pessoa")
	private String cpf;
	
	@Column(name = "rg_pessoa")
	private String rg;

	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
}
