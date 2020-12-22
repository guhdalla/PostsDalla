package br.com.fiap.future.bean;

public class Acontecimento {
	private int cdAcontecimento;
	private int dtAno;
	private String dsAcontecimento;
	private String ftAcontecimento;
	
	public Acontecimento() {
	}
	
	public Acontecimento(int cdAcontecimento, int dtAno, String dsAcontecimento, String ftAcontecimento) {
		super();
		this.cdAcontecimento = cdAcontecimento;
		this.dtAno = dtAno;
		this.dsAcontecimento = dsAcontecimento;
		this.ftAcontecimento = ftAcontecimento;
	}

	public int getCdAcontecimento() {
		return cdAcontecimento;
	}

	public void setCdAcontecimento(int cdAcontecimento) {
		this.cdAcontecimento = cdAcontecimento;
	}

	public int getDtAno() {
		return dtAno;
	}

	public void setDtAno(int dtAno) {
		this.dtAno = dtAno;
	}

	public String getDsAcontecimento() {
		return dsAcontecimento;
	}

	public void setDsAcontecimento(String dsAcontecimento) {
		this.dsAcontecimento = dsAcontecimento;
	}

	public String getFtAcontecimento() {
		return ftAcontecimento;
	}

	public void setFtAcontecimento(String ftAcontecimento) {
		this.ftAcontecimento = ftAcontecimento;
	}
}
