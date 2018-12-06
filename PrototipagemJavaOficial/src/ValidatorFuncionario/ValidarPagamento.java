package ValidatorFuncionario;

import java.awt.Color;
import javax.swing.BorderFactory;
import View.CadastroClienteView;
import ViewFuncionarios.CadastroClienteViewFuncionario;

public class ValidarPagamento {
	
	public boolean validaPagamentoCliente(String formaDePagamento){
		CadastroClienteViewFuncionario.lblFormaDePagamento.setForeground(Color.BLACK);
		if(formaDePagamento.trim().equals("")){
			CadastroClienteViewFuncionario.lblFormaDePagamento.setForeground(Color.RED);
			return false;
		}else{
			CadastroClienteViewFuncionario.lblFormaDePagamento.setForeground(Color.BLACK);
			return true;
		}
		
	}

}
