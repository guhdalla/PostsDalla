package br.com.fiap.future.bean;

import java.util.Date;

public class Personagem {
	private int cdPersonagem;
	private String nmPersonagem;
	private Date dtNasc;
	private String dsPersonagem;
	private String ftPersonagem;
	
	public Personagem() {
	}
	
	public Personagem(int cdPersonagem, String nmPersonagem, Date dtNasc, String dsPersonagem, String ftPersonagem) {
		super();
		this.cdPersonagem = cdPersonagem;
		this.nmPersonagem = nmPersonagem;
		this.dtNasc = dtNasc;
		this.dsPersonagem = dsPersonagem;
		this.ftPersonagem = ftPersonagem;
	}

	public int getCdPersonagem() {
		return cdPersonagem;
	}

	public void setCdPersonagem(int cdPersonagem) {
		this.cdPersonagem = cdPersonagem;
	}

	public String getNmPersonagem() {
		return nmPersonagem;
	}

	public void setNmPersonagem(String nmPersonagem) {
		this.nmPersonagem = nmPersonagem;
	}

	public Date getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}

	public String getDsPersonagem() {
		return dsPersonagem;
	}

	public void setDsPersonagem(String dsPersonagem) {
		this.dsPersonagem = dsPersonagem;
	}

	public String getFtPersonagem() {
		return ftPersonagem;
	}

	public void setFtPersonagem(String ftPersonagem) {
		this.ftPersonagem = ftPersonagem;
	}
}
