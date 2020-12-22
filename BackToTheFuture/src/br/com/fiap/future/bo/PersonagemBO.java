package br.com.fiap.future.bo;

import java.util.List;
import br.com.fiap.future.bean.Personagem;
import br.com.fiap.future.dao.PersonagemDAO;

public class PersonagemBO {
	
	private PersonagemDAO pDAO = null;
	
	public List<Personagem> listagemPersonagemBO() throws ClassNotFoundException{
		pDAO = new PersonagemDAO();
		return pDAO.selectListaPersonagem();
	}
	
	public Personagem selectPersonagemBO(int cdPersonagem) throws ClassNotFoundException {
		pDAO = new PersonagemDAO();
		return pDAO.selectPersonagem(cdPersonagem);
	}
}
