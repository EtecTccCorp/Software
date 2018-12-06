package Validator;

import javax.swing.JOptionPane;

public class ValidarSenha {
	public boolean validarSenha(String senha) {

		if (senha.trim().equals("")) {
			JOptionPane.showMessageDialog(null, "Senha não pode ser vazio", "Inválido", JOptionPane.WARNING_MESSAGE);
			return false;
		}else {
			return true;
		}
	}
}
