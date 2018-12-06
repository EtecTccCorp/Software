package ValidatorFuncionario;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

import View.VendasView;
import ViewFuncionarios.CadastroProdutosViewFuncionario;

public class ValidarQuantidadeProduto {
	public boolean validaQtde(int qtde) {
		if (qtde == 0) {
			VendasView.txtQuanProd.setBorder(BorderFactory.createLineBorder(Color.RED));
			return false;
		}else if(qtde < 0){
			//VendasView.lblQuanProd.setForeground(Color.BLACK);
			JOptionPane.showMessageDialog(null, "Digite um peso válido.", "Inválido", JOptionPane.WARNING_MESSAGE);
			return false;
		}else {
			VendasView.txtQuanProd.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			return true;
		}
	}
	
	public boolean validaQtdeProduto(int qtde) {
		CadastroProdutosViewFuncionario.lblQuantidade.setForeground(Color.BLACK);
		if (qtde == 0) {
			CadastroProdutosViewFuncionario.lblQuantidade.setForeground(Color.RED);
			return false;
		}else if(qtde < 0){
			CadastroProdutosViewFuncionario.lblQuantidade.setForeground(Color.BLACK);
			JOptionPane.showMessageDialog(null, "Digite uma quantidade válida.", "Inválido", JOptionPane.WARNING_MESSAGE);
			return false;
		}else {
			CadastroProdutosViewFuncionario.lblQuantidade.setForeground(Color.BLACK);
			return true;
		}
	}
}
