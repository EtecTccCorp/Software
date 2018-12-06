package Validator;

import VO.ProdutoVO;

public class CadastroEntradaProdutroValidation {

	ValidarCodigo validarCodigo = new ValidarCodigo();
	ValidarData validarData = new ValidarData();
	ValidarPeso validarPeso = new ValidarPeso();
	ValidarQuantidadeProduto  validarQuantidade = new ValidarQuantidadeProduto();
	ValidarPrecoVenda validarPreco = new ValidarPrecoVenda();
	
	public boolean validarEntradaProduto(ProdutoVO pVO){

			boolean retornoCodigo = validarCodigo.validaCodigo(pVO.getCodigo());
			boolean retornoData= validarData.validarData(pVO.getData());
			boolean retornoQuant=validarQuantidade.validaQtde(pVO.getQuan());
			boolean retornoPreco=validarPreco.validaPrecoVenda(pVO.getValor());
			boolean retornoPeso=validarPeso.validaPesoProdutoVenda(pVO.getPeso());
			
			if(retornoCodigo && retornoData && retornoQuant && retornoPreco && retornoPeso){
				return true;
			}
			
		
		return false;
	}
}
