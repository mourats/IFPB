package br.edu.ifpb.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import java.io.IOException;
import br.edu.ifpb.dao.EleitorDAO;
import br.edu.ifpb.entidades.Eleitor;

@RequestScoped	
@ManagedBean
public class EleitorBean {
	
	private Eleitor eleitor;
	
	public EleitorBean() {
		
		this.eleitor = new Eleitor();		
	}
	
	public void cadastrarEleitor() throws IOException{
		
		EleitorDAO eleitorDAO = new EleitorDAO();
		eleitorDAO.insert(eleitor);
		FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
	}
	
	public void deletarEleitor(){
		EleitorDAO eleitorDAO = new EleitorDAO();
		eleitorDAO.delete(eleitor);
	}
	
	public Eleitor getEleitor() {
		return eleitor;
	}

	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}
	
	

}
