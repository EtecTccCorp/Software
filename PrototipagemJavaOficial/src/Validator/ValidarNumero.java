package Validator;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import View.CadastroClienteView;
import View.CadastroFornecedorView;

public class ValidarNumero {

	public boolean validaNumeroCliente(String numero) {
		CadastroClienteView.lblNmero.setForeground(Color.BLACK);
		if (numero.trim().equals("")) {
			int dialogtext = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "Número em Branco, deseja continuar?", "Campo Vazio",
					dialogtext);
			if (dialogResult == JOptionPane.YES_OPTION) {
				CadastroClienteView.lblNmero.setForeground(Color.BLACK);
				return true;
			} else if (dialogResult == JOptionPane.NO_OPTION) {
				CadastroClienteView.lblNmero.setForeground(Color.RED);
				return false;
			}
		}
		
		return true;
	}
	
	public boolean validaNumeroFornecedor(String numero) {
		CadastroFornecedorView.lblNumero.setForeground(Color.BLACK);
		if (numero.trim().equals("")) {
			int dialogtext = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "Número em Branco, deseja continuar?", "Campo Vazio",
					dialogtext);
			if (dialogResult == JOptionPane.YES_OPTION) {
				CadastroFornecedorView.lblNumero.setForeground(Color.BLACK);
				return true;
			} else if (dialogResult == JOptionPane.NO_OPTION) {
				CadastroFornecedorView.lblNumero.setForeground(Color.RED);
				return false;
			}
		}
		
		return true;
	}
}
