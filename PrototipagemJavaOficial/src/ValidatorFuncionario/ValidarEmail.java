package ValidatorFuncionario;

import java.awt.Color;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import View.CadastroClienteView;
import View.CadastroFornecedorView;
import ViewFuncionarios.CadastroClienteViewFuncionario;
import ViewFuncionarios.CadastroFornecedorViewFuncionario;

public class ValidarEmail {
	public boolean validaEmailCliente(String email) {

		boolean isEmailIdValid = false;
		CadastroClienteViewFuncionario.lblEmail.setForeground(Color.BLACK);
		if (email.replaceAll("[.-]", "").trim().equals("") || email.replaceAll("[.-]", "").trim().equals(null)) {
			int dialogtextEmail = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "Email em Branco, deseja continuar?", "Campo Vazio",
					dialogtextEmail);
			if (dialogResult == JOptionPane.YES_OPTION) {
				CadastroClienteViewFuncionario.lblEmail.setForeground(Color.BLACK);
				return true;
			} else if (dialogResult == JOptionPane.NO_OPTION) {
				CadastroClienteViewFuncionario.lblEmail.setForeground(Color.RED);
				return false;
			}
		}

		if (email != null && email.length() > 0) {
			String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
			Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
			java.util.regex.Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				isEmailIdValid = true;
			} else {
				JOptionPane.showMessageDialog(null, "Corrija o Campo Email", "Inválido", JOptionPane.WARNING_MESSAGE);
				CadastroClienteViewFuncionario.lblEmail.setForeground(Color.BLACK);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Corrija o Campo Email", "Inválido", JOptionPane.WARNING_MESSAGE);
			CadastroClienteViewFuncionario.lblEmail.setForeground(Color.BLACK);
		}
		return isEmailIdValid;
	}

	public boolean validaEmailFornecedor(String email) {
		boolean isEmailIdValid = false;
		CadastroFornecedorViewFuncionario.lblEmail.setForeground(Color.BLACK);
		if (email.replaceAll("[.-]", "").trim().equals("") || email.replaceAll("[.-]", "").trim().equals(null)) {
			int dialogtextEmail = JOptionPane.YES_NO_OPTION;

			int dialogResult = JOptionPane.showConfirmDialog(null, "Email em Branco, deseja continuar?", "Campo Vazio",
					dialogtextEmail);

			if (dialogResult == JOptionPane.YES_OPTION) {
				CadastroFornecedorViewFuncionario.lblEmail.setForeground(Color.BLACK);
				return true;
			} else if (dialogResult == JOptionPane.NO_OPTION) {
				CadastroFornecedorViewFuncionario.lblEmail.setForeground(Color.RED);
				return false;
			}
		}

		if (email != null && email.length() > 0) {
			String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
			Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
			java.util.regex.Matcher matcher = pattern.matcher(email);

			if (matcher.matches()) {

				isEmailIdValid = true;

			} else {
				CadastroFornecedorViewFuncionario.lblEmail.setForeground(Color.BLACK);
				JOptionPane.showMessageDialog(null, "Corrija o Campo Email", "Inválido", JOptionPane.WARNING_MESSAGE);
			}

		} else {
			CadastroFornecedorViewFuncionario.lblEmail.setForeground(Color.BLACK);
			JOptionPane.showMessageDialog(null, "Corrija o Campo Email", "Inválido", JOptionPane.WARNING_MESSAGE);
		}
		return isEmailIdValid;
	}

	public boolean validarEmailUsuario(String email) {

		boolean emailValidado = false;
		if (email.replaceAll("[.-]", "").trim().equals("") || email.replaceAll("[.-]", "").trim().equals(null)) {

			JOptionPane.showMessageDialog(null, "Preencha o Campo Email", "Inválido", JOptionPane.WARNING_MESSAGE);
			return false;

		}
		if (email != null && email.length() > 0) {
			String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
			Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
			java.util.regex.Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				emailValidado = true;
			} else {
				JOptionPane.showMessageDialog(null, "Corrija o Campo Email", "Inválido", JOptionPane.WARNING_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Corrija o Campo Email", "Inválido", JOptionPane.WARNING_MESSAGE);
		}
		return emailValidado;
	}

}
