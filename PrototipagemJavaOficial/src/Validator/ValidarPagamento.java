package Validator;

import java.awt.Color;
import View.CadastroClienteView;

public class ValidarPagamento {
	
	public boolean validaPagamentoCliente(String formaDePagamento){
		CadastroClienteView.lblFormaDePagamento.setForeground(Color.BLACK);
		if(formaDePagamento.trim().equals("")){
			CadastroClienteView.lblFormaDePagamento.setForeground(Color.RED);
			return false;
		}else{
			CadastroClienteView.lblFormaDePagamento.setForeground(Color.BLACK);
			return true;
		}
		
	}

}
