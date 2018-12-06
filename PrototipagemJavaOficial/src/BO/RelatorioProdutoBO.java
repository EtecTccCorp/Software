package BO;

import java.util.Date;

import DAO.RelatorioProdutoDAO;
import DAO.RelatorioVendasDAO;
import VO.RelatorioProdutosVO;

public class RelatorioProdutoBO {

	public RelatorioProdutosVO getDadosRelatoriosProduto(Date dataInicio, Date dataFinal) throws Exception {
		RelatorioProdutoDAO relatorioProdutoDAO = new RelatorioProdutoDAO();

		return relatorioProdutoDAO.getDadosRelatoriosProduto(dataInicio, dataFinal);

	}

}
