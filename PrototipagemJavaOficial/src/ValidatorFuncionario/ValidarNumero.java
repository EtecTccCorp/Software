package ValidatorFuncionario;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import View.CadastroClienteView;
import View.CadastroFornecedorView;
import ViewFuncionarios.CadastroClienteViewFuncionario;
import ViewFuncionarios.CadastroFornecedorViewFuncionario;

public class ValidarNumero {

	public boolean validaNumeroCliente(String numero) {
		
		CadastroClienteViewFuncionario.lblNmero.setForeground(Color.BLACK);
		if (numero.trim().equals("")) {
			int dialogtext = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "Número em Branco, deseja continuar?", "Campo Vazio",
					dialogtext);
			if (dialogResult == JOptionPane.YES_OPTION) {
				CadastroClienteViewFuncionario.lblNmero.setForeground(Color.BLACK);
				return true;
			} else if (dialogResult == JOptionPane.NO_OPTION) {
				CadastroClienteViewFuncionario.lblNmero.setForeground(Color.RED);
				return false;
			}
		}
		return true;
	}
	
	public boolean validaNumeroFornecedor(String numero) {
		CadastroFornecedorViewFuncionario.lblNumero.setForeground(Color.BLACK);
		if (numero.trim().equals("")) {
			int dialogtext = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "Número em Branco, deseja continuar?", "Campo Vazio",
					dialogtext);
			if (dialogResult == JOptionPane.YES_OPTION) {
				CadastroFornecedorViewFuncionario.lblNumero.setForeground(Color.BLACK);
				return true;
			} else if (dialogResult == JOptionPane.NO_OPTION) {
				CadastroFornecedorViewFuncionario.lblNumero.setForeground(Color.RED);
				return false;
			}
		}
		return true;
	}
}
