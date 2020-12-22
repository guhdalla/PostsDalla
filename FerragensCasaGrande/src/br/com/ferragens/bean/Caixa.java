package br.com.ferragens.bean;

public class Caixa {
	private int cdCaixa;
	private int cdLinha;
	private String nmCaixa;
	
	public Caixa() {
	}

	public Caixa(int cdCaixa, int cdLinha, String nmCaixa) {
		super();
		this.cdCaixa = cdCaixa;
		this.cdLinha = cdLinha;
		this.nmCaixa = nmCaixa;
	}

	public int getCdCaixa() {
		return cdCaixa;
	}

	public void setCdCaixa(int cdCaixa) {
		this.cdCaixa = cdCaixa;
	}

	public int getCdLinha() {
		return cdLinha;
	}

	public void setCdLinha(int cdLinha) {
		this.cdLinha = cdLinha;
	}

	public String getNmCaixa() {
		return nmCaixa;
	}

	public void setNmCaixa(String nmCaixa) {
		this.nmCaixa = nmCaixa;
	}
}
