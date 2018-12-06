package Validator;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import View.CadastroProdutosView;
import View.VendasView;
import ViewFuncionarios.CadastroProdutosViewFuncionario;

public class ValidarQuantidadeProduto {
	public boolean validaQtde(int qtde) {
		VendasView.lblQuantidadeVendida.setForeground(Color.BLACK);
		if (qtde == 0) {
			VendasView.lblQuantidadeVendida.setForeground(Color.RED);
			return false;
		}else if(qtde < 0){
			VendasView.lblQuantidadeVendida.setForeground(Color.BLACK);
			JOptionPane.showMessageDialog(null, "Digite uma quantidade válida.", "Inválido", JOptionPane.WARNING_MESSAGE);
			return false;
		}else {
			VendasView.lblQuantidadeVendida.setForeground(Color.BLACK);
			return true;
		}
	}
	
	public boolean validaQtdeProduto(int qtde) {
		CadastroProdutosView.lblQuantidade.setForeground(Color.BLACK);
		if (qtde == 0) {
			CadastroProdutosView.lblQuantidade.setForeground(Color.RED);
			return false;
		}else if(qtde < 0){
			CadastroProdutosView.lblQuantidade.setForeground(Color.BLACK);
			JOptionPane.showMessageDialog(null, "Digite uma quantidade válida.", "Inválido", JOptionPane.WARNING_MESSAGE);
			return false;
		}else {
			CadastroProdutosView.lblQuantidade.setForeground(Color.BLACK);
			return true;
		}
	}
}
