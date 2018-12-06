package BO;

import java.util.List;

import DAO.FornecedorDAO;

import VO.FornecedorVO;

import Validator.FornecedorValidation;
import ValidatorFuncionario.FornecedorValidationFuncionario;

public class FornecedorBO {

	public void cadastrarFornecedor(FornecedorVO fornecedorVO) throws Exception {
		FornecedorValidation fornecedorValidation = new FornecedorValidation();
		boolean retorno= fornecedorValidation.validarDados(fornecedorVO);
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		if (retorno) {
		fornecedorDAO.cadastrarFornecedor(fornecedorVO);
		}
	}
	public void cadastrarFornecedorFuncionario(FornecedorVO fornecedorVO) throws Exception {
		FornecedorValidationFuncionario fornecedorValidation = new FornecedorValidationFuncionario();
		boolean retorno= fornecedorValidation.validarDados(fornecedorVO);
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		if (retorno) {
		fornecedorDAO.cadastrarFornecedor(fornecedorVO);
		}
	}

	public void excluirFornecedor(int codigo) throws Exception {
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		fornecedorDAO.excluirFornecedor(codigo);

	}

	public void alterarFornecedor(FornecedorVO fornecedorVO) throws Exception {
		FornecedorValidation fornecedorValidation = new FornecedorValidation();
		boolean retorno2 = fornecedorValidation.validarDadosAlterar(fornecedorVO);
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		if (retorno2) {
		fornecedorDAO.alterarFornecedor(fornecedorVO);
		}

	}

	public FornecedorVO pesquisarPorCodigo(int codigo) throws Exception {
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		return fornecedorDAO.PesquisarPorCodigo(codigo);
	}

	public List<FornecedorVO> getDados() throws Exception {
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		return fornecedorDAO.pesquisarFornecedorTodos();
	}

	public List<FornecedorVO> pesquisarPorNome(String nome) throws Exception {
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		return fornecedorDAO.pesquisarPorNome(nome);
	}

}
