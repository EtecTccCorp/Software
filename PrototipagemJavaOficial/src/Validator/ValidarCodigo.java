package Validator;

import javax.swing.JOptionPane;

public class ValidarCodigo {

	public boolean validaCodigo(int codigo) {

		if (codigo <= 0) {
			JOptionPane.showMessageDialog(null, "Código Inválido", "Código", JOptionPane.WARNING_MESSAGE);
			return false;
		} else {
			return true;
		}

		}
	}

