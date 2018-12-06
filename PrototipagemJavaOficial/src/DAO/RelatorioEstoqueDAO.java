package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import DAOFactory.DAOFactory;
import VO.RelatorioEstoqueVO;

public class RelatorioEstoqueDAO {

	private Connection connection;

	public RelatorioEstoqueDAO() throws Exception {
		this.connection = DAOFactory.conexao();
	}

	public RelatorioEstoqueVO getDadosRelatoriosEstoque() throws Exception {
		RelatorioEstoqueVO relatorioEstoqueVO = new RelatorioEstoqueVO();
		PreparedStatement preparedStatement = this.connection.prepareStatement(
				"SELECT produto.Nome_Produto,estoque.Quantidade_Produto from estoque inner join produto on(estoque.Codigo_Produto = produto.Codigo_Produto) where estoque.Quantidade_Produto <=10");

		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			relatorioEstoqueVO.setNomeProduto(resultSet.getString("produto.Nome_Produto"));
			relatorioEstoqueVO.setQuantidade(resultSet.getInt("estoque.Quantidade_Produto"));

		}

		return relatorioEstoqueVO;

	}

}
