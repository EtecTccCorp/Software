package ValidatorFuncionario;

import java.awt.Color;
import java.util.InputMismatchException;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import View.CadastroClienteView;
import ViewFuncionarios.CadastroClienteViewFuncionario;

public class ValidarCpf {

	public boolean validaCpfCliente(String cpf) {

		boolean retorno = true;

		CadastroClienteViewFuncionario.lblCpfopcional.setForeground(Color.BLACK);
		if (cpf.replaceAll("[.-]", "").trim().equals("") || cpf.replaceAll("[.-]", "").trim().equals(null)) {
			int dialogtextCnpj_1 = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, "CPF em Branco, deseja continuar?", "Campo Vazio",
					dialogtextCnpj_1);
			if (dialogResult == JOptionPane.YES_OPTION) {
				CadastroClienteViewFuncionario.lblCpfopcional.setForeground(Color.BLACK);
				return true;
			} else if (dialogResult == JOptionPane.NO_OPTION) {
				CadastroClienteViewFuncionario.lblCpfopcional.setForeground(Color.RED);
				return false;
			}
		}
		if (cpf.replaceAll("[.-]", "").trim().equals("00000000000")
				|| cpf.replaceAll("[.-]", "").trim().equals("11111111111")
				|| cpf.replaceAll("[.-]", "").trim().equals("11111111111")
				|| cpf.replaceAll("[.-]", "").trim().equals("33333333333")
				|| cpf.replaceAll("[.-]", "").trim().equals("44444444444")
				|| cpf.replaceAll("[.-]", "").trim().equals("55555555555")
				|| cpf.replaceAll("[.-]", "").trim().equals("66666666666")
				|| cpf.replaceAll("[.-]", "").trim().equals("77777777777")
				|| cpf.replaceAll("[.-]", "").trim().equals("88888888888")
				|| cpf.replaceAll("[.-]", "").trim().equals("99999999999")
				|| (cpf.replaceAll("[.-]", "").trim().length() != 11)) {
			JOptionPane.showMessageDialog(null,"Esse CPF não existe" ,"Inválido", JOptionPane.WARNING_MESSAGE);
			retorno = false;
		} else {
			char dig10, dig11;
			int sm, i, r, num, peso;
			try {
				sm = 0;
				peso = 10;
				for (i = 0; i < 9; i++) {
					num = (int) (cpf.replaceAll("[.-]", "").trim().charAt(i) - 48);
					sm = sm + (num * peso);
					peso = peso - 1;
				}
				r = 11 - (sm % 11);
				if ((r == 10) || (r == 11)) {
					dig10 = '0';
				} else {
					dig10 = (char) (r + 48);
				}
				sm = 0;
				peso = 11;
				for (i = 0; i < 10; i++) {
					num = (int) (cpf.replaceAll("[.-]", "").trim().charAt(i) - 48);
					sm = sm + (num * peso);
					peso = peso - 1;
				}
				r = 11 - (sm % 11);
				if ((r == 10) || (r == 11)) {
					dig11 = '0';
				} else {
					dig11 = (char) (r + 48);
				}
				if ((dig10 == cpf.replaceAll("[.-]", "").trim().charAt(9))
						&& (dig11 == cpf.replaceAll("[.-]", "").trim().charAt(10))) {
					retorno = (true);
				} else {
					JOptionPane.showMessageDialog(null, "Informe um CPF Válido" ,"Inválido", JOptionPane.WARNING_MESSAGE);
					retorno = (false);
				}
			} catch (InputMismatchException erro) {
				retorno = (false);
			}
		}
		return retorno;
	}
}
