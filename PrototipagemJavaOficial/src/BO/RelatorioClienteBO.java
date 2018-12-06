package BO;

import java.util.Date;

import DAO.RelatorioClienteDAO;
import VO.RelatorioClienteVO;

public class RelatorioClienteBO {

	public RelatorioClienteVO getDadosRelatoriosCliente(Date dataInicio, Date dataFinal) throws Exception {
		RelatorioClienteDAO relatorioClienteDAO = new RelatorioClienteDAO();

		return relatorioClienteDAO.getDadosRelatoriosCliente(dataInicio, dataFinal);
	
	}

}
