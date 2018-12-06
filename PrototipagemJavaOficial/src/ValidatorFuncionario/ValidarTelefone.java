package ValidatorFuncionario;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import View.CadastroClienteView;
import View.CadastroFornecedorView;
import ViewFuncionarios.CadastroClienteViewFuncionario;
import ViewFuncionarios.CadastroFornecedorViewFuncionario;

public class ValidarTelefone {

	public boolean validaTelefoneCliente(String telefone) {

		CadastroClienteViewFuncionario.lblTelResidencial.setForeground(Color.BLACK);
		if (telefone.replaceAll("[()-]", "").trim().equals("")) {
			int dialogtext = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "Telefone em Branco, deseja continuar ?", "Campo Vazio",
					dialogtext);
			if (dialogResult == JOptionPane.YES_OPTION) {
				CadastroClienteViewFuncionario.lblTelResidencial.setForeground(Color.BLACK);
				return true;
			} else if (dialogResult == JOptionPane.NO_OPTION) {
				CadastroClienteViewFuncionario.lblTelResidencial.setForeground(Color.RED);
				return false;
			}
		}
		if (telefone.replaceAll("[()-]", "").length() != 10) {
			JOptionPane.showMessageDialog(null, "Telefone abaixo de 10 digitos", "Telefone Inválido",
					JOptionPane.WARNING_MESSAGE);
			return false;
		}
		return true;
	}

	public boolean validaTelefoneFornecedor(String telefone) {
		CadastroFornecedorViewFuncionario.lblTelefone.setForeground(Color.BLACK);
		if (telefone.replaceAll("[()-]", "").trim().equals("")) {
			int dialogtext = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "Telefone em Branco, deseja continuar ?", "Campo Vazio",
					dialogtext);
			if (dialogResult == JOptionPane.YES_OPTION) {
				CadastroFornecedorViewFuncionario.lblTelefone.setForeground(Color.BLACK);
				return true;
			} else if (dialogResult == JOptionPane.NO_OPTION) {
				CadastroFornecedorViewFuncionario.lblTelefone.setForeground(Color.RED);
				return false;
			}
		}
		if (telefone.replaceAll("[()-]", "").length() != 10) {
			JOptionPane.showMessageDialog(null, "Telefone abaixo de 10 digitos", "Telefone Inválido",
					JOptionPane.WARNING_MESSAGE);
			return false;
		}
		return true;
	}
}
