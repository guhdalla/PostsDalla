package br.com.ferragens.bean;

public class Produto {
	private int cdProduto;
	private int cdCaixa;
	private String nmProduto;
	private int qntProduto;
	
	public Produto() {
	}
	
	public Produto(int cdProduto, int cdCaixa, String nmProduto, int qntProduto) {
		super();
		this.cdProduto = cdProduto;
		this.cdCaixa = cdCaixa;
		this.nmProduto = nmProduto;
		this.qntProduto = qntProduto;
	}

	public int getCdProduto() {
		return cdProduto;
	}

	public void setCdProduto(int cdProduto) {
		this.cdProduto = cdProduto;
	}

	public int getCdCaixa() {
		return cdCaixa;
	}

	public void setCdCaixa(int cdCaixa) {
		this.cdCaixa = cdCaixa;
	}

	public String getNmProduto() {
		return nmProduto;
	}

	public void setNmProduto(String nmProduto) {
		this.nmProduto = nmProduto;
	}

	public int getQntProduto() {
		return qntProduto;
	}

	public void setQntProduto(int qntProduto) {
		this.qntProduto = qntProduto;
	}
}
