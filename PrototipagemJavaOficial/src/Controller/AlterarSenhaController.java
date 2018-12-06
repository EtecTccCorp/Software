package Controller;

import BO.AlterarSenhaBO;
import VO.AlterarSenhaVO;

public class AlterarSenhaController {

	public void alterarSenha(AlterarSenhaVO senha) throws Exception {
		AlterarSenhaBO senhaBO = new AlterarSenhaBO();
		senhaBO.alterarSenha(senha);
		
	}

}
