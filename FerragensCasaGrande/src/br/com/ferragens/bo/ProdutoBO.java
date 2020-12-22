package br.com.ferragens.bo;

import java.util.List;

import br.com.ferragens.bean.Produto;
import br.com.ferragens.dao.ProdutoDAO;

public class ProdutoBO {

	private ProdutoDAO pDAO = null;
	
	public List<Produto> listaProdutoBO() throws ClassNotFoundException {
		pDAO = new ProdutoDAO();
		return pDAO.selectListaProduto();
	}
	
	public int insertProdutoBO(int cdCaixa, String nmProduto, int qntProduto) throws ClassNotFoundException {
		pDAO = new ProdutoDAO();	
			return pDAO.insertProduto(cdCaixa, nmProduto, qntProduto);
	}
	
	public int updateProdutoBO(int cdProduto, String nmProduto, int qntProduto) throws ClassNotFoundException {
		pDAO = new ProdutoDAO();
		return pDAO.updateProduto(cdProduto, nmProduto, qntProduto);
	}
	
	public int removeProdutoBO(int cdProduto) throws ClassNotFoundException {
		pDAO = new ProdutoDAO();
		return pDAO.removeProduto(cdProduto);
	}
}
