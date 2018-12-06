package Controller;

import java.util.Date;

import BO.RelatorioClienteBO;
import VO.RelatorioClienteVO;

public class RelatorioClienteController {

	public RelatorioClienteVO getDadosRelatoriosCliente(Date dataInicio, Date dataFinal) throws Exception {

		RelatorioClienteBO relatorioClienteBO = new RelatorioClienteBO();

		
		return relatorioClienteBO.getDadosRelatoriosCliente(dataInicio, dataFinal);

	}

}
