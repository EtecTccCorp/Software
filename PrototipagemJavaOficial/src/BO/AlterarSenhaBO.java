package BO;

import DAO.AlterarSenhaDAO;
import VO.AlterarSenhaVO;

public class AlterarSenhaBO {

	public void alterarSenha(AlterarSenhaVO senha) throws Exception {
		AlterarSenhaDAO senhaDAO = new AlterarSenhaDAO();
		senhaDAO.alterarSenha(senha);
	}

}
