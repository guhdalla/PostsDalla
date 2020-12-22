package br.com.fiap.future.bo;

import br.com.fiap.future.bean.Acontecimento;
import br.com.fiap.future.dao.AcontecimentoDAO;

import java.util.List;



public class AcontecimentoBO {
	
	private AcontecimentoDAO aDAO = null;
	
	public List<Acontecimento> listagemAcontecimentoBO() throws ClassNotFoundException{
		aDAO = new AcontecimentoDAO();
		return aDAO.selectListaAcontecimento();
	}
	
}
