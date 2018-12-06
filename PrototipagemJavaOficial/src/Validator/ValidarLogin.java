package Validator;

import javax.swing.JOptionPane;

public class ValidarLogin {

	public boolean validarLogin(String login) {
		if (login.trim().equals("")) {
			JOptionPane.showMessageDialog(null, "Login não pode ser vazio", "Inválido", JOptionPane.WARNING_MESSAGE);
			return false;
		}else {
			return true;
		}
	}
}
