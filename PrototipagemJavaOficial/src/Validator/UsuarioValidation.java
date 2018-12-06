package Validator;

import VO.UsuarioVO;

public class UsuarioValidation {
	ValidarNome validarNome = new ValidarNome();
	ValidarLogin validarLogin = new ValidarLogin();
	ValidarSenha validarSenha = new ValidarSenha();
	ValidarEmail validarEmail = new ValidarEmail();
	public boolean validaUsuario(UsuarioVO uVO) throws Exception {
		boolean retorno = true;
		boolean retornoNome  = validarNome.validarNomeUsuario(uVO.getNome());
		boolean retornoLogin = validarLogin.validarLogin(uVO.getLogin());  
		boolean retornoSenha = validarSenha.validarSenha(uVO.getSenha());
		boolean retornoEmail = validarEmail.validarEmailUsuario(uVO.getEmail());
		
		if (retornoNome && retornoLogin && retornoSenha && retornoEmail) {
			retorno = true;
		}else {
			retorno = false;
			throw new Exception("Um dos retornos é falso");
		}
		return retorno;
	}
}
