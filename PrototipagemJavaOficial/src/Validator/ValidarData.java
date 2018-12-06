package Validator;

import java.awt.Color;
import java.util.Date;

import javax.swing.BorderFactory;


import View.CadastroProdutosView;
import View.VendasView;
import ViewFuncionarios.CadastroProdutosViewFuncionario;

public class ValidarData {

	public boolean validarData(Date data) {

		VendasView.lblDataDaVenda.setForeground(Color.BLACK);
		if (data == null) {
			VendasView.lblDataDaVenda.setForeground(Color.RED);
			return false;
		} else {
			VendasView.lblDataDaVenda.setForeground(Color.BLACK);
			return true;
		}

	}

	public boolean validarDataProduto(Date data) {

		CadastroProdutosView.lblDataDeValidade.setForeground(Color.BLACK);
		if (data == null) {
			CadastroProdutosView.lblDataDeValidade.setForeground(Color.RED);
			return false;
		} else {
			CadastroProdutosView.lblDataDeValidade.setForeground(Color.BLACK);
			return true;
		}

	}
}
