package Controller;

import java.util.Date;

import BO.RelatorioProdutoBO;
import BO.RelatorioVendasBO;
import VO.RelatorioProdutosVO;

public class RelatroioProdutoController {

	public RelatorioProdutosVO getDadosRelatoriosProdutos(Date dataInicio, Date dataFinal) throws Exception {
		RelatorioProdutoBO relatorioProdutoBO = new RelatorioProdutoBO();

		return relatorioProdutoBO.getDadosRelatoriosProduto(dataInicio, dataFinal);
	}

}
