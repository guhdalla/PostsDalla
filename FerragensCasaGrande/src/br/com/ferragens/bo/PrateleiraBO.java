package br.com.ferragens.bo;

import java.util.List;

import br.com.ferragens.bean.Prateleira;
import br.com.ferragens.dao.PrateleiraDAO;

public class PrateleiraBO {

	private PrateleiraDAO pDAO = null;
	
	public int insertPrateleiraBO(int cdPrateleira) throws ClassNotFoundException {
		pDAO = new PrateleiraDAO();
		return pDAO.insertPrateleira(cdPrateleira);
	}
	
	public int removePrateleiraBO(int cdPrateleira) throws ClassNotFoundException {
		pDAO = new PrateleiraDAO();
		return pDAO.removePrateleira(cdPrateleira);
	}
	
	public List<Prateleira> listPrateleiraBO() throws ClassNotFoundException {
		pDAO = new PrateleiraDAO();
		return pDAO.selectListaPrateleira();
	}
	
	public Prateleira selectPrateleiraBO(int cdPrateleira) throws ClassNotFoundException {
		pDAO = new PrateleiraDAO();
		return pDAO.selectPrateleira(cdPrateleira);
	}
	
	public int updatePrateleiraBO(int cdPrateleira, int cdPrateleiraNovo) throws ClassNotFoundException {
		pDAO = new PrateleiraDAO();
		return pDAO.updatePrateleira(cdPrateleira, cdPrateleiraNovo);
	}
	
}
