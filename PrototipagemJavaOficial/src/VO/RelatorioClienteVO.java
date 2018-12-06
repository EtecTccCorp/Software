package VO;

import java.util.Date;

public class RelatorioClienteVO {
	private String nomeClienteMaior;
	public String getNomeClienteMaior() {
		return nomeClienteMaior;
	}
	public void setNomeClienteMaior(String nomeClienteMaior) {
		this.nomeClienteMaior = nomeClienteMaior;
	}
	public String getNomeClienteMenor() {
		return nomeClienteMenor;
	}
	public void setNomeClienteMenor(String nomeClienteMenor) {
		this.nomeClienteMenor = nomeClienteMenor;
	}
	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}
	public void setQuantidadeComprada(int quantidadeComprada) {
		this.quantidadeComprada = quantidadeComprada;
	}
	public int getValorMaior() {
		return valorMaior;
	}
	public void setValorMaior(int valorMaior) {
		this.valorMaior = valorMaior;
	}
	public int getValorMenor() {
		return valorMenor;
	}
	public void setValorMenor(int valorMenor) {
		this.valorMenor = valorMenor;
	}
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
	private String nomeClienteMenor;
	private int quantidadeComprada;
	private int valorMaior;
	private int valorMenor;
	private Date dataInicio;
	private Date dataFinal;
	

}
