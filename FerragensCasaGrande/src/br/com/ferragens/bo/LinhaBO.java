package br.com.ferragens.bo;

import java.util.List;

import br.com.ferragens.bean.Linha;
import br.com.ferragens.dao.LinhaDAO;

public class LinhaBO {
	
	private LinhaDAO lDAO = null;

	public int insertLinhaBO(int cdPrateleira) throws ClassNotFoundException {
		lDAO = new LinhaDAO();
		return lDAO.insertLinha(cdPrateleira);
	}
	
	public int removeTodasLinhaBO(int cdPrateleira) throws ClassNotFoundException {
		lDAO = new LinhaDAO();
		return lDAO.removeTodasLinhas(cdPrateleira);
	}
	
	public List<Linha> listaLinhaBO() throws ClassNotFoundException {
		lDAO = new LinhaDAO();
		return lDAO.selectListaLinha();
	}
	
	public int updateLinhaBO(int cdPrateleira, int cdPrateleiraNovo) throws ClassNotFoundException {
		lDAO = new LinhaDAO();
		return lDAO.updateLinha(cdPrateleira, cdPrateleiraNovo);
	}
	
	public int removeLinhaBO(int cdLinha) throws ClassNotFoundException {
		lDAO = new LinhaDAO();
		return lDAO.removeLinha(cdLinha);
	}
	
}
