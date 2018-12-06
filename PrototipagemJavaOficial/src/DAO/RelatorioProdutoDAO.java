package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import DAOFactory.DAOFactory;
import VO.RelatorioProdutosVO;

public class RelatorioProdutoDAO {

	private Connection connection;

	public RelatorioProdutoDAO() throws Exception {
		this.connection = DAOFactory.conexao();
	}

	public RelatorioProdutosVO getDadosRelatoriosProduto(Date dataInicio, Date dataFinal) throws Exception {
		RelatorioProdutosVO relatorio = new RelatorioProdutosVO();
		PreparedStatement preparedStatement = this.connection.prepareStatement(
				"SELECT Produto.Nome_Produto,sum(vendas.quantidade_venda) as 'Relatorios' from vendas inner join Produto on(vendas.Codigo_Produto = Produto.Codigo_Produto) where data_venda between ?  and ? group by Produto.Nome_Produto");
		
		PreparedStatement preparedStatement2 = this.connection.prepareStatement("SELECT Produto.Nome_Produto,sum(vendas.quantidade_venda) as 'Relatorios' from vendas inner join Produto on(vendas.Codigo_Produto = Produto.Codigo_Produto) where data_venda between ?  and ? group by Produto.Nome_Produto");
		java.util.Date dataUtil = new java.util.Date();
		java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
		
		preparedStatement.setDate(1, new java.sql.Date(dataInicio.getTime()));
		preparedStatement.setDate(2, new java.sql.Date(dataFinal.getTime()));
		
		java.util.Date dataUtil2 = new java.util.Date();
		java.sql.Date dataSql2 = new java.sql.Date(dataUtil.getTime());
		
		preparedStatement2.setDate(1, new java.sql.Date(dataInicio.getTime()));
		preparedStatement2.setDate(2, new java.sql.Date(dataFinal.getTime()));
		
		
		ResultSet resultSet = preparedStatement.executeQuery();
		ResultSet resultSet2 = preparedStatement2.executeQuery();
		
		if (resultSet.next() && resultSet2.next()){
			relatorio.setNomeProdutoMaior(resultSet.getString("produto.Nome_Produto"));
			relatorio.setMaiorVenda(resultSet.getInt("Relatorios"));
			relatorio.setNomeProduto(resultSet2.getString("Nome_Produto"));
			relatorio.setMenorVenda(resultSet2.getInt("Relatorios"));
			
			//relatorio.setValor(resultSet.getInt("Relatorios"));
			
		}
		return relatorio;
	}

}
