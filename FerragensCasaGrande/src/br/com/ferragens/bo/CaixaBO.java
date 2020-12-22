package br.com.ferragens.bo;

import java.util.List;

import br.com.ferragens.bean.Caixa;
import br.com.ferragens.dao.CaixaDAO;

public class CaixaBO {

	private CaixaDAO cDAO = null;
	
	public int insertCaixaBO(int cdLinha, String nmCaixa) throws ClassNotFoundException {
		cDAO = new CaixaDAO();
		return cDAO.insertCaixa(cdLinha, nmCaixa);
	}
	
	public List<Caixa> listaCaixaBO() throws ClassNotFoundException {
		cDAO = new CaixaDAO();
		return cDAO.selectListaCaixa();
	}
	
	public int removeCaixaBO(int cdCaixa) throws ClassNotFoundException {
		cDAO = new CaixaDAO();
		return cDAO.removeCaixa(cdCaixa);
	}
	
	public int updateCaixaBO(int cdCaixa, int cdLinha, String nmCaixa) throws ClassNotFoundException {
		cDAO = new CaixaDAO();
		return cDAO.updateCaixa(cdCaixa, cdLinha, nmCaixa);
	}
}
