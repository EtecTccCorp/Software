package VO;

import java.sql.Date;

public class LembreteValidadeVO {
	public int getLote() {
		return lote;
	}
	public void setLote(int lote) {
		this.lote = lote;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public Date getValidade_Produtos() {
		return validade_Produtos;
	}
	public void setValidade_Produtos(Date validade_Produtos) {
		this.validade_Produtos = validade_Produtos;
	}
	private int lote;
	private String nomeProduto;
	private Date validade_Produtos;
	private Date dataAtual;
	public Date getDataAtual() {
		return dataAtual;
	}
	public void setDataAtual(Date dataAtual) {
		this.dataAtual = dataAtual;
	}
	private int codigoProd;
	public int getCodigoProd() {
		return codigoProd;
	}
	public void setCodigoProd(int codigoProd) {
		this.codigoProd = codigoProd;
	}

}
