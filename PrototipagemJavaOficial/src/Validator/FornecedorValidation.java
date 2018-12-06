package Validator;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import DAO.FornecedorDAO;
import VO.FornecedorVO;
import View.CadastroClienteView;
import View.CadastroFornecedorView;

public class FornecedorValidation {
	ValidarNome validarNome = new ValidarNome();
	ValidarCnpj validarCnpj = new ValidarCnpj();
	ValidarEmail validarEmail = new ValidarEmail();
	ValidarCep validarCep = new ValidarCep();
	ValidarRua validarRua = new ValidarRua();
	ValidarNumero validarNumero = new ValidarNumero();
	ValidarNextel validarNextel = new ValidarNextel();
	ValidarTelefone validarTelefone = new ValidarTelefone();
	ValidarCelular validarCelular = new ValidarCelular();
	ValidarCodigo validarCodigo = new ValidarCodigo();

	public boolean validarDados(FornecedorVO fornecedorVO) throws Exception {
		boolean retorno = true;
		boolean retornoCodigo = validarCodigoFornecedor(fornecedorVO.getCodigoFornecedor());
		boolean retornoNome = validarNome.validaNomeFornecedor(fornecedorVO.getEmpresa());
		boolean retornoCnpj = validarCnpj.validaCnpjFornecedor(fornecedorVO.getCnpj());
		boolean retornoEmail = validarEmail.validaEmailFornecedor(fornecedorVO.getEmail());
		// boolean retornoCep = validarCep.validaCepFornecedor(fornecedorVO.getCep());
		boolean retornoRua = validarRua.validaRuaFornecedor(fornecedorVO.getRua());
		boolean retornoNumero = validarNumero.validaNumeroFornecedor(fornecedorVO.getNumero());
		boolean retornoTelefone = validarTelefone.validaTelefoneFornecedor(fornecedorVO.getTelefone());
		boolean retornoCelular = validarCelular.validaCelularFornecedor(fornecedorVO.getTelefoneCelular());
		boolean retornoNextel = validarNextel.validaNextelFornecedor(fornecedorVO.getNextel());

		if (retornoCodigo && retornoNome && retornoCnpj && retornoEmail /* && retornoCep */ && retornoRua
				&& retornoNumero && retornoTelefone && retornoCelular && retornoNextel) {
			retorno = true;
		} else {
			retorno = false;
			throw new Exception("Um dos retornos é falso");
		}
		return retorno;
	}
	
	public boolean validarDadosAlterar(FornecedorVO fornecedorVO) throws Exception {
		boolean retorno = true;
		boolean retornoCodigo = validarCodigoFornecedor(fornecedorVO.getCodigoFornecedor());
		boolean retornoNome = validarNome.validaNomeFornecedor(fornecedorVO.getEmpresa());
		boolean retornoCnpj = validarCnpj.validaCnpjFornecedor(fornecedorVO.getCnpj());
		boolean retornoEmail = validarEmail.validaEmailFornecedor(fornecedorVO.getEmail());
		// boolean retornoCep = validarCep.validaCepFornecedor(fornecedorVO.getCep());
		boolean retornoRua = validarRua.validaRuaFornecedor(fornecedorVO.getRua());
		boolean retornoNumero = validarNumero.validaNumeroFornecedor(fornecedorVO.getNumero());
		boolean retornoTelefone = validarTelefone.validaTelefoneFornecedor(fornecedorVO.getTelefone());
		boolean retornoCelular = validarCelular.validaCelularFornecedor(fornecedorVO.getTelefoneCelular());
		boolean retornoNextel = validarNextel.validaNextelFornecedor(fornecedorVO.getNextel());

		if (retornoCodigo && retornoNome && retornoCnpj && retornoEmail /* && retornoCep */ && retornoRua
				&& retornoNumero && retornoTelefone && retornoCelular && retornoNextel) {
			retorno = true;
		} else {
			retorno = false;
			throw new Exception("Um dos retornos é falso");
		}
		return retorno;
	}


	public boolean validarCodigoFornecedor(int codigo) {
		boolean retorno = true;
		CadastroFornecedorView.lblId.setForeground(Color.BLACK);
		if (codigo == 0) {
			CadastroFornecedorView.lblId.setForeground(Color.RED);
			retorno = false;
		} else if(codigo < 0){
			JOptionPane.showMessageDialog(null, "Digite um código válido", "Inválido", JOptionPane.WARNING_MESSAGE);
			CadastroFornecedorView.lblId.setForeground(Color.BLACK);
			retorno = false;
		}else {
			CadastroFornecedorView.lblId.setForeground(Color.BLACK);
			try {
				FornecedorDAO fornecedorDAO = new FornecedorDAO();
				boolean retornoCodigo_Fornecedor = fornecedorDAO.verificaExistenciaCodigo_Fornecedor(codigo);
				if (retornoCodigo_Fornecedor == true) {
					retornoCodigo_Fornecedor = true;
					retorno = true;
				} else {
					retornoCodigo_Fornecedor = false;
					JOptionPane.showMessageDialog(null, "Fornecedor já Castrado", "Código Inválido",
							JOptionPane.WARNING_MESSAGE);
					retorno = false;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return retorno;
	}

}
