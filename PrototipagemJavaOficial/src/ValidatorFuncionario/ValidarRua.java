package ValidatorFuncionario;

import java.awt.Color;
import javax.swing.BorderFactory;
import View.CadastroClienteView;
import View.CadastroFornecedorView;
import ViewFuncionarios.CadastroClienteViewFuncionario;
import ViewFuncionarios.CadastroFornecedorViewFuncionario;

public class ValidarRua {
	
	public boolean validaRuaCliente(String rua) {
		boolean retorno = true;
		CadastroClienteViewFuncionario.lblRua.setForeground(Color.BLACK);
		
		if (rua.trim().equals("")) {
			CadastroClienteViewFuncionario.lblRua.setForeground(Color.RED);
			retorno = false;
		}else {
			CadastroClienteViewFuncionario.lblRua.setForeground(Color.BLACK);
			retorno = true;
		}
		return retorno;
	}
	
	public boolean validaRuaFornecedor(String rua) {
		CadastroFornecedorViewFuncionario.lblRua.setForeground(Color.BLACK);
		if (rua.trim().equals("")) {
			CadastroFornecedorViewFuncionario.lblRua.setForeground(Color.RED);
			return false;
		} else {
			CadastroFornecedorViewFuncionario.lblRua.setForeground(Color.BLACK);
			return true;
		}
	}
}
