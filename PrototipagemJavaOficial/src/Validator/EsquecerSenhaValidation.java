package Validator;

import VO.EsquecerSenhaVO;

public class EsquecerSenhaValidation {
	
	ValidarEmail validarEmail = new ValidarEmail();
	public boolean esquecerSenha(EsquecerSenhaVO esquecerSenha) throws Exception {

		boolean retorno = true;
		boolean retornoEmail = validarEmail.validarEmailUsuario(esquecerSenha.getEmail());
		if (retornoEmail) {
			retorno = true;
		}else {
			retorno = false;
			throw new Exception("Retorno Email é falso");
		}
		return retorno;

	}

}
