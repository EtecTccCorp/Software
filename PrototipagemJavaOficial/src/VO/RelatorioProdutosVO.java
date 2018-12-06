package VO;

import java.util.Date;

public class RelatorioProdutosVO {

	private Date dataInicio;
	private Date dataFinal;
	private String nomeProdutoMaior;
	public String getNomeProdutoMaior() {
		return nomeProdutoMaior;
	}
	public void setNomeProdutoMaior(String nomeProdutoMaior) {
		this.nomeProdutoMaior = nomeProdutoMaior;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	private String nomeProduto;
	private int maiorVenda;
	public int getMaiorVenda() {
		return maiorVenda;
	}
	public void setMaiorVenda(int maiorVenda) {
		this.maiorVenda = maiorVenda;
	}
	public double getMenorVenda() {
		return menorVenda;
	}
	public void setMenorVenda(double menorVenda) {
		this.menorVenda = menorVenda;
	}

	private double menorVenda;
	
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

}
