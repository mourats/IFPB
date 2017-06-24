package br.edu.ifpb.entidades;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Urna {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id_urna")
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
