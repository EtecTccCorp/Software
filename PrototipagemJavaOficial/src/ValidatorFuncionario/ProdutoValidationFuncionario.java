package ValidatorFuncionario;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import DAO.ProdutoDAO;
import VO.ProdutoVO;
import View.CadastroProdutosView;
import View.VendasView;
import ViewFuncionarios.CadastroFornecedorViewFuncionario;
import ViewFuncionarios.CadastroProdutosViewFuncionario;

public class ProdutoValidationFuncionario {

	ValidarCodigo validarCodigo = new ValidarCodigo();
	ValidarNome validarNome = new ValidarNome();
	ValidarTipoProduto validarTipoProduto = new ValidarTipoProduto();
	ValidarData validarData = new ValidarData();
	ValidarPeso validarPeso = new ValidarPeso();
	ValidarQuantidadeProduto validarQuantidadeProduto = new ValidarQuantidadeProduto();
	ValidarPrecoVenda validarPrecoVenda = new ValidarPrecoVenda();

	public boolean validaDadosProdutos(ProdutoVO pVO) throws Exception {
		boolean retorno = true;
		boolean retornoCodigo = validarCodigoProduto(pVO.getCodigo());
		boolean retornoNome = validarNome.validaNomeProduto(pVO.getNome());
		boolean retornoTipoProduto = validarTipoProduto.validaTipoProduto(pVO.getTipo());

		if (retornoCodigo && retornoNome && retornoTipoProduto) {
			retorno = true;
		} else {
			retorno = false;
			throw new Exception("Um dos retornos é falso");
		}

		return retorno;
	}

	public boolean validarEntradaProdutos(ProdutoVO produtoVO) throws Exception {
		boolean retorno = true;
		boolean retornoCodigo = validarCodigoEntradaProduto(produtoVO.getCodigo());
		boolean retornoData = validarData.validarDataProduto(produtoVO.getData());
		boolean retornoQuant = validarQuantidadeProduto.validaQtdeProduto(produtoVO.getQuan());
		boolean retornoPreco = validarPrecoVenda.validaPrecoProduto(produtoVO.getValor());
		boolean retornoPeso = validarPeso.validaPesoProduto(produtoVO.getPeso());

		if (retornoCodigo && retornoData && retornoQuant && retornoPreco && retornoPeso) {
			retorno = true;
		} else {
			retorno = false;
			throw new Exception("Um dos retornos é falso");
		}

		return retorno;
	}

	public boolean validarCodigoProduto(int codigo) throws Exception {
		boolean retorno = true;
		CadastroProdutosViewFuncionario.lblCodigoProduto.setForeground(Color.BLACK);
		if (codigo == 0) {
			CadastroProdutosViewFuncionario.lblCodigoProduto.setForeground(Color.RED);
			retorno = false;
		} else if (codigo < 0) {
			JOptionPane.showMessageDialog(null, "Digite um código válido", "Inválido", JOptionPane.WARNING_MESSAGE);
			CadastroProdutosViewFuncionario.lblCodigoProduto.setForeground(Color.BLACK);
			return false;
		}else {
			CadastroProdutosViewFuncionario.lblCodigoProduto.setForeground(Color.BLACK);
			try {
				ProdutoDAO pDAO = new ProdutoDAO();
				boolean retornoCodigoProduto = pDAO.verificaExistenciaCodigoProduto(codigo);
				if (retornoCodigoProduto == true) {
					retorno = false;
					JOptionPane.showMessageDialog(null, "Produto já existe", "Código Inválido",
							JOptionPane.WARNING_MESSAGE);
				} else {
					CadastroProdutosViewFuncionario.lblCodigoProduto.setForeground(Color.BLACK);
					retorno = true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return retorno;
	}

	public boolean validarCodigoEntradaProduto(int codigo) throws Exception {
		CadastroProdutosViewFuncionario.lblCdigoDoProduto.setForeground(Color.BLACK);
		boolean retorno = true;
		if (codigo == 0) {
			CadastroProdutosViewFuncionario.lblCdigoDoProduto.setForeground(Color.RED);
			retorno = false;
		}else if (codigo < 0) {
			JOptionPane.showMessageDialog(null, "Digite um código válido", "Inválido", JOptionPane.WARNING_MESSAGE);
			CadastroProdutosViewFuncionario.lblCdigoDoProduto.setForeground(Color.BLACK);
			return false;
		} else {
			CadastroProdutosViewFuncionario.lblCdigoDoProduto.setForeground(Color.BLACK);
			try {
				ProdutoDAO pDAO = new ProdutoDAO();
				boolean retornoCodigoProduto = pDAO.verificaExistenciaCodigoProduto(codigo);
				if (retornoCodigoProduto == true) {
					retornoCodigoProduto = true;
				} else {
					CadastroProdutosViewFuncionario.lblCdigoDoProduto.setForeground(Color.BLACK);
					JOptionPane.showMessageDialog(null, "Produto não existe", "Código Inválido",
							JOptionPane.WARNING_MESSAGE);
					retorno = false;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return retorno;
	}

	public boolean validarCodigoProdutoVenda(int codigo) throws Exception {

		boolean retorno = true;
		if (codigo <= 0) {
			retorno = false;
			VendasView.txtCodProd.setBorder(BorderFactory.createLineBorder(Color.RED));
		} else {
			VendasView.txtCodProd.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			try {
				ProdutoDAO pDAO = new ProdutoDAO();
				boolean retornoCodigoProduto = pDAO.verificaExistenciaCodigoProduto(codigo);
				if (retornoCodigoProduto == true) {
					retornoCodigoProduto = true;
				} else {
					VendasView.txtCodProd.setBorder(BorderFactory.createLineBorder(Color.GRAY));
					JOptionPane.showMessageDialog(null, "Produto não existe", "Código Inválido",
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
