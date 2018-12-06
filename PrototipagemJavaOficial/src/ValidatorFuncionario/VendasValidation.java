package ValidatorFuncionario;

import VO.VendasVO;


public class VendasValidation {
	
	ProdutoValidationFuncionario produtoValidation = new ProdutoValidationFuncionario();
	ClienteValidationFuncionario clienteValidation = new ClienteValidationFuncionario();
	ValidarPrecoVenda precoVenda = new ValidarPrecoVenda();
	ValidarPeso validarPeso = new ValidarPeso();
	ValidarQuantidadeProduto quantidadeProduto =new ValidarQuantidadeProduto();
	ValidarData validaData = new ValidarData();
	
	public boolean validarVendas(VendasVO vendasVO) throws Exception {
 		boolean retorno = true;
 		boolean retornoCliente = clienteValidation.validaCodigoClienteVenda(vendasVO.getCodigoCliente());
		boolean retornoProduto = produtoValidation.validarCodigoProdutoVenda(vendasVO.getCodigoProduto());
		boolean retornoPrecoVenda = precoVenda.validaPrecoVenda(vendasVO.getValor());
		boolean retornoPesoVenda = validarPeso.validaPesoProdutoVenda(vendasVO.getPeso());
		boolean retornoQtde = quantidadeProduto.validaQtde(vendasVO.getQuantidade());
		boolean retornoData = validaData.validarData(vendasVO.getDataVenda());
		if(retornoCliente && retornoProduto && retornoPrecoVenda && retornoPesoVenda && retornoQtde && retornoData) {
			retorno = true;
		}else {
			retorno = false;
			throw new Exception("Um dos retornos é falso");
		}
		return retorno;
	}
	
	
	/*private boolean validaClienteVenda(VendasVO vVO) {
		boolean retorno = true;
		int codigo = vVO.getCodigoCliente();
		if (codigo <= 0) {
			retorno = false;
			VendasView.txtCodigoCli.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, Color.RED));
		}else {
			
			VendasView.txtCodigoCli.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			try {
				ClienteDAO clienteDAO = new ClienteDAO();
				boolean retornoCodigo_Cliente = clienteDAO.verificaExistenciaCodigo_Cliente(vVO.getCodigoCliente());
				if (retornoCodigo_Cliente) {
					retornoCodigo_Cliente = true;
					retorno = true;
				} else {
					JOptionPane.showMessageDialog(null, "Cliente não existe", "Código Inválido",
							JOptionPane.WARNING_MESSAGE);
						retorno = false;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return retorno;
	}*/
	
	/*public boolean validarCodigoProduto(VendasVO vVO) {
		boolean retorno = true;
		int codigo = vVO.getCodigoProduto();
		if (codigo <=  0) {
			retorno = false;
			VendasView.txtCodProd.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, Color.RED));
		}else {
			VendasView.txtCodProd.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			try {
				ProdutoDAO pDAO = new ProdutoDAO();
				boolean retornoCodigoProduto = pDAO.verificaExistenciaCodigo_Cliente(vVO.getCodigoProduto());
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
	}*/
}