package BO;

import java.util.Date;

import DAO.RelatorioEstoqueDAO;
import VO.RelatorioEstoqueVO;

public class RelatorioEstoqueBO {

	public RelatorioEstoqueVO getDadosRelatoriosEstoque() throws Exception {
		RelatorioEstoqueDAO relatorioEstoqueDAO = new RelatorioEstoqueDAO();

		
		
		
		return relatorioEstoqueDAO.getDadosRelatoriosEstoque();

	}

}
