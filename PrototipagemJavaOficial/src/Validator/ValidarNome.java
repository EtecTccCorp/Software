package Validator;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

import View.CadastroClienteView;
import View.CadastroFornecedorView;
import View.CadastroProdutosView;
import ViewFuncionarios.CadastroProdutosViewFuncionario;

public class ValidarNome {

	public boolean validaNomeCliente(String nome) {
		CadastroClienteView.lblNome.setForeground(Color.BLACK);
		if (nome.trim().equals("")) {
			CadastroClienteView.lblNome.setForeground(Color.RED);
			return false;
		} else {
			CadastroClienteView.lblNome.setForeground(Color.BLACK);
			return true;
		}
	}

	public boolean validaNomeFornecedor(String nome) {
		CadastroFornecedorView.lblEmpresa.setForeground(Color.BLACK);
		if (nome.trim().equals("")) {
			CadastroFornecedorView.lblEmpresa.setForeground(Color.RED);
			return false;
		} else {
			CadastroFornecedorView.lblEmpresa.setForeground(Color.BLACK);
			return true;
		}
	}

	public boolean validaNomeProduto(String nome) {
		CadastroProdutosView.lblNomeProduto.setForeground(Color.BLACK);
		if (nome.trim().equals("")) {
			CadastroProdutosView.lblNomeProduto.setForeground(Color.RED);
			return false;
		} else {
			CadastroProdutosView.lblNomeProduto.setForeground(Color.BLACK);
			return true;
		}
	}

	public boolean validarNomeUsuario(String nome) {
		
		if (nome.trim().equals("")) {
			JOptionPane.showMessageDialog(null, "Nome não pode ser vazio", "Inválido", JOptionPane.WARNING_MESSAGE);
			return false;
		} else {
			return true;
		}
	}
}
