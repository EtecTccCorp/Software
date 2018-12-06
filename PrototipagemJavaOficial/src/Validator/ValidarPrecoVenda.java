package Validator;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import View.CadastroProdutosView;
import View.VendasView;
import ViewFuncionarios.CadastroProdutosViewFuncionario;

public class ValidarPrecoVenda {
	public boolean validaPrecoVenda(double preco) {
		VendasView.lblValorTotal.setForeground(Color.BLACK);
		if (preco == 0.0) {
			VendasView.lblValorTotal.setForeground(Color.RED);
			return true;
		}else if(preco < 0){
			VendasView.lblValorTotal.setForeground(Color.BLACK);
			JOptionPane.showMessageDialog(null, "Digite um valor válido.", "Inválido", JOptionPane.WARNING_MESSAGE);
			return false;
		}else {
			VendasView.lblValorTotal.setForeground(Color.BLACK);
			return true;
		}
	}
	
	public boolean validaPrecoProduto(double preco) {
		CadastroProdutosView.lblValor.setForeground(Color.BLACK);
		if (preco == 0.0) {
			CadastroProdutosView.lblValor.setForeground(Color.RED);
			return false;
		}else if(preco < 0){
			CadastroProdutosView.lblValor.setForeground(Color.BLACK);
			JOptionPane.showMessageDialog(null, "Digite um valor válido.", "Valor da Venda", JOptionPane.WARNING_MESSAGE);
			return false;
		}else {
			CadastroProdutosView.lblValor.setForeground(Color.BLACK);
			return true;
		}
	}
}
