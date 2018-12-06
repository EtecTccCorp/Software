package ValidatorFuncionario;

import java.awt.Color;
import java.util.Date;

import javax.swing.BorderFactory;


import View.CadastroProdutosView;
import View.VendasView;
import ViewFuncionarios.CadastroProdutosViewFuncionario;

public class ValidarData {

	public boolean validarData(Date data) {

		if (data == null) {
			VendasView.txtdata.setBorder(BorderFactory.createLineBorder(Color.RED));
			return false;
		} else {
			VendasView.txtdata.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			return true;
		}

	}

	public boolean validarDataProduto(Date data) {
		CadastroProdutosViewFuncionario.lblDataDeValidade.setForeground(Color.BLACK);
		if (data == null) {
			CadastroProdutosViewFuncionario.lblDataDeValidade.setForeground(Color.RED);
			return false;
		} else {
			CadastroProdutosViewFuncionario.lblDataDeValidade.setForeground(Color.BLACK);
			return true;
		}

	}
}
