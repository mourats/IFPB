package br.edu.ifpb.beans;

import java.io.IOException;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.edu.ifpb.dao.CandidatoDAO;
import br.edu.ifpb.dao.EleitorDAO;
import br.edu.ifpb.dao.VotoDAO;
import br.edu.ifpb.entidades.Candidato;
import br.edu.ifpb.entidades.Eleitor;
import br.edu.ifpb.entidades.Voto;


@SessionScoped
@ManagedBean	
public class VotacaoBean {
	
	Eleitor eleitor;
	Candidato candidato;
	Voto voto;  
	
	public VotacaoBean() {
		
		this.eleitor = new Eleitor();
		this.candidato = new Candidato();
		this.voto = new Voto();
	}

	public void verificarTitulo() throws IOException{
		EleitorDAO eleitorDAO = new EleitorDAO();
		Eleitor eleitor_aux = eleitorDAO.getByTitulo(eleitor.getTitulo());
		
		if(eleitor_aux!=null){
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("eleitor", eleitor_aux);
			FacesContext.getCurrentInstance().getExternalContext().redirect("votar.xhtml");
		}else{
			System.out.println("� nulo");
		}
	}
	
	public void votar(){
		Date data = new Date();
		CandidatoDAO candidatoDAO = new CandidatoDAO();
		
		eleitor = (Eleitor)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("eleitor");

		Candidato candidato = candidatoDAO.getByNumero(voto.getVoto_candidato());
		
		voto.setData(data);
		voto.setEleitor(eleitor);
		voto.setCandidato(candidato);
		
		System.out.println(eleitor.getId());
		System.out.println(candidato.getId());
		
		VotoDAO votoDAO = new VotoDAO();
		votoDAO.insert(voto);	
		
	}
	
	public void votar_branco(){
		
	}
	
	public void encerrar_eleicao(){
		
	}

	public Eleitor getEleitor() {
		return eleitor;
	}

	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}

	public Voto getVoto() {
		return voto;
	}

	public void setVoto(Voto voto) {
		this.voto = voto;
	}

}
	

	