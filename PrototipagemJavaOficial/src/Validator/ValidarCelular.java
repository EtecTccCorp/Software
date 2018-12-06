package Validator;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import View.CadastroClienteView;
import View.CadastroFornecedorView;

public class ValidarCelular {

	public boolean validaCelularCliente(String celular) {
		CadastroClienteView.lblTelCelular.setForeground(Color.BLACK);
		if (celular.replaceAll("[()-]", "").trim().equals("")) {
			int dialogtext = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "Celular em Branco, deseja continuar?", "Campo Vazio",
					dialogtext);
			if (dialogResult == JOptionPane.YES_OPTION) {
				CadastroClienteView.lblTelCelular.setForeground(Color.BLACK);
				return true;
			} else if (dialogResult == JOptionPane.NO_OPTION) {
				CadastroClienteView.lblTelCelular.setForeground(Color.RED);
				return false;
			}
		}
		if (celular.replaceAll("[()-]", "").length() != 11) {
			JOptionPane.showMessageDialog(null,"Celular abaixo de 11 digitos" ,"Celular Inválido", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		return true;
	}
	
	public boolean validaCelularFornecedor(String celular) {

		
		if (celular.replaceAll("[()-]", "").trim().equals("")) {
			CadastroFornecedorView.lblTelefone_1.setForeground(Color.BLACK);
			int dialogtext = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "Celular em Branco, deseja continuar?", "Campo Vazio",
					dialogtext);
			if (dialogResult == JOptionPane.YES_OPTION) {
				CadastroFornecedorView.lblTelefone_1.setForeground(Color.BLACK);
				return true;
			} else if (dialogResult == JOptionPane.NO_OPTION) {
				CadastroFornecedorView.lblTelefone_1.setForeground(Color.RED);
				return false;
			}
		}
		if (celular.replaceAll("[()-]", "").length() != 11) {
			JOptionPane.showMessageDialog(null,"Celular abaixo de 11 digitos" ,"Celular Inválido", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		return true;
	}
}
