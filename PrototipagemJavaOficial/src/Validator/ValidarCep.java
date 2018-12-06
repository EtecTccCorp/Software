package Validator;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.EtchedBorder;
import View.CadastroClienteView;

public class ValidarCep {

	public boolean validaCepCliente(String cep) {
		if (cep.replaceAll("[-]", "").trim().equals("")) {
			//CadastroClienteView.txtCep.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, Color.RED));
			return true;
		} else if (cep.replaceAll("[-]", "").trim().equals(null)) {
			CadastroClienteView.txtCep.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, Color.RED));
			return true;
		}else {
			CadastroClienteView.txtCep.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			return true;
		}
		
	}

	public boolean validaCepFornecedor(String cep) {
		if (cep.replaceAll("[-]", "").trim().equals("")) {
			CadastroClienteView.txtCep.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			return false;
		}
		if (cep.replaceAll("[-]", "").trim().equals(null)) {
			CadastroClienteView.txtCep.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, Color.RED));
			return false;
		}
		return true;
	}
}
