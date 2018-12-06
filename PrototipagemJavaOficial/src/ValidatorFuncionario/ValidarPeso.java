package ValidatorFuncionario;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import View.CadastroProdutosView;
import View.VendasView;
import ViewFuncionarios.CadastroProdutosViewFuncionario;

public class ValidarPeso {
	public boolean validaPesoProdutoVenda(double peso) {
		boolean retorno = true;
		if (peso == 0.0) {
			VendasView.txtPesoProd.setBorder(BorderFactory.createLineBorder(Color.RED));
			retorno = false;
		} else if (peso < 0) {
			VendasView.txtPesoProd.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			JOptionPane.showMessageDialog(null, "Digite um peso válido.", "Inválido", JOptionPane.WARNING_MESSAGE);
			retorno = false;
		} else {
			VendasView.txtPesoProd.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			retorno = true;
		}
		return retorno;
	}

	public boolean validaPesoProduto(double peso) {
		boolean retorno = true;
		CadastroProdutosViewFuncionario.lblPeso.setForeground(Color.BLACK);
		if (peso == 0.0) {
			CadastroProdutosViewFuncionario.lblPeso.setForeground(Color.RED);
			retorno = false;
		} else if (peso < 0) {
			CadastroProdutosViewFuncionario.lblPeso.setForeground(Color.BLACK);
			JOptionPane.showMessageDialog(null, "Digite um peso válido.", "Inválido", JOptionPane.WARNING_MESSAGE);
			retorno = false;
		} else {
			CadastroProdutosViewFuncionario.lblPeso.setForeground(Color.BLACK);
			retorno = true;
		}
		return retorno;
	}
}
