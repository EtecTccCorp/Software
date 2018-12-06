package VO;

import java.util.Date;

public class LembreteVO {

	private int codigo;
	private Date data;
	private String descricao;
	private String Assunto;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAssunto() {
		return Assunto;
	}

	public void setAssunto(String assunto) {
		Assunto = assunto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
