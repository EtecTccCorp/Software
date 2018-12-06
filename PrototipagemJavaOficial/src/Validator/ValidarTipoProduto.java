package Validator;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.border.EtchedBorder;

import View.CadastroProdutosView;
import ViewFuncionarios.CadastroProdutosViewFuncionario;

public class ValidarTipoProduto {
	
	public boolean validaTipoProduto(String tipoProduto){
		CadastroProdutosView.lblTipo.setForeground(Color.BLACK);
		if(tipoProduto.trim().equals("")){
			CadastroProdutosView.lblTipo.setForeground(Color.RED);
			return false;
		}else{
			CadastroProdutosView.lblTipo.setForeground(Color.BLACK);
			return true;
		}
	}

}
