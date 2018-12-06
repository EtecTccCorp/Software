package Controller;

import java.sql.SQLException;
import java.util.List;

import BO.LembreteBO;
import VO.LembreteVO;

public class LembreteController {

	public void cadastroDeLembrete(LembreteVO lVO) throws Exception {
		LembreteBO lBO = new LembreteBO();
		lBO.cadastrarLembrete(lVO);
	}

	public List<LembreteVO> pesquisarLembreteTodos() throws Exception {

		LembreteBO lBO = new LembreteBO();
		return lBO.getDados();
	}

	public void excluirTodos() throws Exception {
		LembreteBO lBO = new LembreteBO();
		lBO.deletarTodos();
		
	}

	public LembreteVO pesquisaPorCodigo(int codigo) throws Exception {
		LembreteBO lBO = new LembreteBO();
		return lBO.pesquisarPorCodigo(codigo);
	}

	
	
}
