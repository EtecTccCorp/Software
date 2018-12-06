package ValidatorFuncionario;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import View.CadastroProdutosView;
import View.VendasView;
import ViewFuncionarios.CadastroProdutosViewFuncionario;

public class ValidarPrecoVenda {
	public boolean validaPrecoVenda(double preco) {
		if (preco == 0.0) {
			VendasView.txtValorProd.setBorder(BorderFactory.createLineBorder(Color.RED));
			return true;
		}else if(preco < 0){
			VendasView.txtValorProd.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			JOptionPane.showMessageDialog(null, "Digite um valor válido.", "Valor da Venda", JOptionPane.WARNING_MESSAGE);
			return false;
		}else {
			VendasView.txtValorProd.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			return true;
		}
	}
	
	public boolean validaPrecoProduto(double preco) {
		CadastroProdutosViewFuncionario.lblValor.setForeground(Color.BLACK);
		if (preco == 0.0) {
			CadastroProdutosViewFuncionario.lblValor.setForeground(Color.RED);
			return false;
		}else if(preco < 0){
			CadastroProdutosViewFuncionario.lblValor.setForeground(Color.BLACK);
			JOptionPane.showMessageDialog(null, "Digite um valor válido.", "Inválido", JOptionPane.WARNING_MESSAGE);
			return false;
		}else {
			CadastroProdutosViewFuncionario.lblValor.setForeground(Color.BLACK);
			return true;
		}
	}
}
