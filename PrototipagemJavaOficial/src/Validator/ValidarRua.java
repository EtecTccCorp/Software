package Validator;

import java.awt.Color;
import javax.swing.BorderFactory;
import View.CadastroClienteView;
import View.CadastroFornecedorView;

public class ValidarRua {
	
	public boolean validaRuaCliente(String rua) {
		boolean retorno = true;
		CadastroClienteView.lblRua.setForeground(Color.BLACK);
		if (rua.trim().equals("")) {
			CadastroClienteView.lblRua.setForeground(Color.RED);
			retorno = false;
		}else {
			CadastroClienteView.lblRua.setForeground(Color.BLACK);
			retorno = true;
		}
		return retorno;
	}
	
	public boolean validaRuaFornecedor(String rua) {
		CadastroFornecedorView.lblRua.setForeground(Color.BLACK);
		boolean retorno = true;
		
		if (rua.trim().equals("")) {
			CadastroFornecedorView.lblRua.setForeground(Color.RED);
			retorno = false;
		}else {
			CadastroFornecedorView.lblRua.setForeground(Color.BLACK);
			retorno = true;
		}
		return retorno;
	}
}
