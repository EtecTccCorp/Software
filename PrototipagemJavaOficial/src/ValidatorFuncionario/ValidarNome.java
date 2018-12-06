package ValidatorFuncionario;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

import View.CadastroClienteView;
import View.CadastroFornecedorView;
import View.CadastroProdutosView;
import ViewFuncionarios.CadastroClienteViewFuncionario;
import ViewFuncionarios.CadastroFornecedorViewFuncionario;
import ViewFuncionarios.CadastroProdutosViewFuncionario;

public class ValidarNome {

	public boolean validaNomeCliente(String nome) {
		CadastroClienteViewFuncionario.lblNome.setForeground(Color.BLACK);
		if (nome.trim().equals("")) {
			CadastroClienteViewFuncionario.lblNome.setForeground(Color.RED);
			return false;
		} else {
			CadastroClienteViewFuncionario.lblNome.setForeground(Color.BLACK);
			return true;
		}
	}

	public boolean validaNomeFornecedor(String nome) {

		CadastroFornecedorViewFuncionario.lblEmpresa.setForeground(Color.BLACK);
		if (nome.trim().equals("")) {
			CadastroFornecedorViewFuncionario.lblEmpresa.setForeground(Color.RED);
			return false;
		} else {
			CadastroFornecedorViewFuncionario.lblEmpresa.setForeground(Color.BLACK);
			return true;
		}
	}

	public boolean validaNomeProduto(String nome) {
		CadastroProdutosViewFuncionario.lblNome.setForeground(Color.BLACK);
		if (nome.trim().equals("")) {
			CadastroProdutosViewFuncionario.lblNome.setForeground(Color.RED);
			return false;
		} else {
			CadastroProdutosViewFuncionario.lblNome.setForeground(Color.BLACK);
			return true;
		}
	}

	public boolean validarNomeUsuario(String nome) {
		
		if (nome.trim().equals("")) {
			JOptionPane.showMessageDialog(null, "Informe um Nome", "Nome em Branco", JOptionPane.WARNING_MESSAGE);
			return false;
		} else {
			return true;
		}
	}
}
