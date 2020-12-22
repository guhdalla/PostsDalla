package br.com.ferragens.bean;

public class Linha {
	private int cdLinha;
	private int cdPrateleira;
	
	public Linha() {
	}
	
	public Linha(int cdLinha, int cdPrateleira) {
		super();
		this.cdLinha = cdLinha;
		this.cdPrateleira = cdPrateleira;
	}

	public int getCdLinha() {
		return cdLinha;
	}

	public void setCdLinha(int cdLinha) {
		this.cdLinha = cdLinha;
	}

	public int getCdPrateleira() {
		return cdPrateleira;
	}

	public void setCdPrateleira(int cdPrateleira) {
		this.cdPrateleira = cdPrateleira;
	}
	
	
}
