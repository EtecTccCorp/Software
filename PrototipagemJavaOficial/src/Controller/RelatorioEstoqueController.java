package Controller;

import java.util.Date;
import java.util.List;

import BO.RelatorioEstoqueBO;
import VO.RelatorioEstoqueVO;

public class RelatorioEstoqueController {

	public RelatorioEstoqueVO getDadosRelatoriosEstoque() throws Exception {

		RelatorioEstoqueBO relatorioEstoqueBO = new RelatorioEstoqueBO();

		return relatorioEstoqueBO.getDadosRelatoriosEstoque();

	}

}
