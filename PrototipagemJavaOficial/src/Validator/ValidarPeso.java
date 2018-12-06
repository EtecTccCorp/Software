package Validator;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import View.CadastroProdutosView;
import View.VendasView;
import ViewFuncionarios.CadastroProdutosViewFuncionario;

public class ValidarPeso {
	public boolean validaPesoProdutoVenda(double peso) {
		boolean retorno = true;
		VendasView.lblPesoTotal.setForeground(Color.BLACK);
		if (peso == 0.0) {
			VendasView.lblPesoTotal.setForeground(Color.RED);
			retorno = false;
		} else if (peso <= 0) {
			VendasView.lblPesoTotal.setForeground(Color.BLACK);
			JOptionPane.showMessageDialog(null, "Digite um peso válido.", "Inválido", JOptionPane.WARNING_MESSAGE);
			retorno = false;
		} else {
			VendasView.lblPesoTotal.setForeground(Color.BLACK);
			retorno = true;
		}
		return retorno;
	}

	public boolean validaPesoProduto(double peso) {
		CadastroProdutosView.lblPeso.setForeground(Color.BLACK);
		boolean retorno = true;
		if (peso == 0.0) {
			CadastroProdutosView.lblPeso.setForeground(Color.RED);
			retorno = false;
		} else if (peso <= 0) {
			CadastroProdutosView.lblPeso.setForeground(Color.BLACK);
			JOptionPane.showMessageDialog(null, "Digite um peso válido.", "Inválido", JOptionPane.WARNING_MESSAGE);
			retorno = false;
		} else {
			CadastroProdutosView.lblPeso.setForeground(Color.BLACK);
			retorno = true;
		}
		return retorno;
	}
}
