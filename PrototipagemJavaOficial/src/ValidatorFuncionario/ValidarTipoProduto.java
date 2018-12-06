package ValidatorFuncionario;

import java.awt.Color;
import ViewFuncionarios.CadastroProdutosViewFuncionario;

public class ValidarTipoProduto {
	
	public boolean validaTipoProduto(String tipoProduto){
		CadastroProdutosViewFuncionario.lblTipo.setForeground(Color.BLACK);
		if(tipoProduto.trim().equals("")){
			CadastroProdutosViewFuncionario.lblTipo.setForeground(Color.RED);
			return false;
		}else{
			CadastroProdutosViewFuncionario.lblTipo.setForeground(Color.BLACK);
			return true;
		}
	}

}
