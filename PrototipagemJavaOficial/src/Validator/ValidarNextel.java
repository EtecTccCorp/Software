package Validator;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import View.CadastroClienteView;
import View.CadastroFornecedorView;

public class ValidarNextel {

	public boolean validaNextelCliente(String nextel) {
		CadastroClienteView.lblTelComercial.setForeground(Color.BLACK);
		
		if (nextel.trim().equals("")) {
			int dialogtext = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "Nextel em Branco, deseja continuar?", "Campo Vazio", dialogtext);
			if (dialogResult == JOptionPane.YES_OPTION) {
				CadastroClienteView.lblTelComercial.setForeground(Color.BLACK);
				return true;
			} else if (dialogResult == JOptionPane.NO_OPTION) {
				CadastroClienteView.lblTelComercial.setForeground(Color.RED);
				return false;
			}
		}
		if (nextel.length() <= 6 || nextel.length() > 16) {
			JOptionPane.showMessageDialog(null,"Quantidade de Dígitos Inválida" ,"Nextel Inválido", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		return true;
	}
	
	public boolean validaNextelFornecedor(String nextel) {
		
		CadastroFornecedorView.lblNextel.setForeground(Color.BLACK);
		
		if (nextel.trim().equals("")) {
			int dialogtext = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "Nextel em Branco, deseja continuar?", "Campo Vazio", dialogtext);
			if (dialogResult == JOptionPane.YES_OPTION) {
				CadastroFornecedorView.lblNextel.setForeground(Color.BLACK);
				return true;
			} else if (dialogResult == JOptionPane.NO_OPTION) {
				CadastroFornecedorView.lblNextel.setForeground(Color.RED);
				return false;
			}
		}
		if (nextel.length() <= 6 || nextel.length() > 16) {
			JOptionPane.showMessageDialog(null,"Quantidade de Dígitos Inválida" ,"Nextel Inválido", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		return true;
	}
}
