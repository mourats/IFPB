package br.edu.ifpb.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import java.io.IOException;
import br.edu.ifpb.dao.CandidatoDAO;
import br.edu.ifpb.entidades.Candidato;

@RequestScoped	
@ManagedBean
public class CandidatoBean {
	
	private Candidato candidato;
	
	public CandidatoBean() {
		
		this.candidato = new Candidato();		
	}
	
	public void cadastrarCandidato() throws IOException{
		
		CandidatoDAO candidatoDAO = new CandidatoDAO();
		candidatoDAO.insert(candidato);
		FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
	}
	
	public void deletarCandidato(){
		
		CandidatoDAO candidatoDAO = new CandidatoDAO();
		candidatoDAO.delete(candidato);
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	
	
}
