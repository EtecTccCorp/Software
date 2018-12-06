package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import DAOFactory.DAOFactory;
import VO.LembreteValidadeVO;

public class LembreteValidadeDAO {

	private Connection connection;

	public LembreteValidadeDAO() throws Exception {
		this.connection = DAOFactory.conexao();
	}

	public void lembreteValidade() throws Exception {

		List<LembreteValidadeVO> lembreteValidade = new ArrayList<LembreteValidadeVO>();
		List<LembreteValidadeVO> lembreteEstoque = new ArrayList<LembreteValidadeVO>();


		PreparedStatement preparedStatement = this.connection.prepareStatement(
				"select  Lote_Estoque,Nome_Produto,Validade_Produtos from Estoque inner join Produto on(Estoque.Codigo_Produto  = Produto.Codigo_Produto) where datediff(now(), Validade_Produtos) <= 7");
		PreparedStatement preparedStatement2 = this.connection.prepareStatement(
				"select Produto.Codigo_Produto,Nome_Produto,CURRENT_DATE() as 'data_atual' from Estoque inner join Produto on(Estoque.Codigo_Produto  = Produto.Codigo_Produto) where Estoque.Quantidade_Produto <= 10");
		ResultSet rs = preparedStatement.executeQuery();
		ResultSet rs2 = preparedStatement2.executeQuery();

		while (rs.next() && rs2.next()) {
			LembreteValidadeVO lembreteValidadeVO = new LembreteValidadeVO();

			lembreteValidadeVO.setLote(rs.getInt("Lote_Estoque"));
			lembreteValidadeVO.setNomeProduto(rs.getString("Nome_Produto"));
			lembreteValidadeVO.setValidade_Produtos(rs.getDate("Validade_Produtos"));
			lembreteValidadeVO.setCodigoProd(rs2.getInt("Produto.Codigo_Produto"));
			lembreteValidadeVO.setDataAtual(rs2.getDate("data_atual"));
			lembreteValidade.add(lembreteValidadeVO);
			lembreteEstoque.add(lembreteValidadeVO);

		}

		for (LembreteValidadeVO VO : lembreteValidade) {

			String descricao = "O lote " + VO.getLote() + " do produto " + VO.getNomeProduto()
					+ " está proximo da validade";
			String assunto = "Validade";

			preparedStatement = this.connection.prepareStatement(
					"INSERT INTO Lembrete (Data_Lembrete,Descricao_Lembrete,Assunto_Lembrete) values (?,?,?)");
			preparedStatement.setDate(1, VO.getValidade_Produtos());
			preparedStatement.setString(2, descricao);
			preparedStatement.setString(3, assunto);

			preparedStatement.execute();

		}

		for (LembreteValidadeVO VO : lembreteEstoque) {

			String descricao = "O produto " + VO.getCodigoProd() + " - " + VO.getNomeProduto() + " está com o estoque em baixa";
			String assunto = "Estoque";

			preparedStatement2 = this.connection.prepareStatement(
					"INSERT INTO Lembrete (Data_Lembrete,Descricao_Lembrete,Assunto_Lembrete) values (?,?,?)");
			preparedStatement2.setDate(1, VO.getDataAtual());
			preparedStatement2.setString(2, descricao);
			preparedStatement2.setString(3, assunto);

			preparedStatement2.execute();

		}
	}
	
	
	public void lembreteEstoque() throws Exception {

		List<LembreteValidadeVO> lembreteEstoque = new ArrayList<LembreteValidadeVO>();

		PreparedStatement preparedStatement = this.connection.prepareStatement(
				"select Produto.Codigo_Produto,Nome_Produto,CURRENT_DATE() as 'data_atual' from estoque inner join produto on(estoque.Codigo_Produto = produto.Codigo_Produto) where estoque.Quantidade_Produto <= 10");
		ResultSet rs = preparedStatement.executeQuery();


		for (LembreteValidadeVO VO : lembreteEstoque) {

			String descricao = "O produto " + VO.getCodigoProd() + " - " + VO.getNomeProduto() + " está com o estoque em baixa";
			String assunto = "Estoque";

			preparedStatement = this.connection.prepareStatement(
					"INSERT INTO Lembrete (Data_Lembrete,Descricao_Lembrete,Assunto_Lembrete) values (?,?,?)");
			preparedStatement.setDate(1, VO.getDataAtual());
			preparedStatement.setString(2, descricao);
			preparedStatement.setString(3, assunto);

			preparedStatement.execute();

		}
	}

}
