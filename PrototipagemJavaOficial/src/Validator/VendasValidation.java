package Validator;

import VO.VendasVO;


public class VendasValidation {
	
	ProdutoValidation produtoValidation = new ProdutoValidation();
	ClienteValidation clienteValidation = new ClienteValidation();
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
}