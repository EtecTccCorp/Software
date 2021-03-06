package DAO;

import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAOFactory.DAOFactory;
import VO.ProdutoVO;

public class ProdutoDAO {

	private Connection connection;

	public ProdutoDAO() throws Exception {
		this.connection = DAOFactory.conexao();
	}

	public void cadastraProduto(ProdutoVO produtoVO) throws Exception {

		PreparedStatement preparedStatement = this.connection
				.prepareStatement("INSERT INTO Produto (Codigo_Produto, Nome_Produto,tipo_produto) VALUES (?,?,?)");
		preparedStatement.setInt(1, produtoVO.getCodigo());
		preparedStatement.setString(2, produtoVO.getNome());
		//
		// java.util.Date dataUtil = new java.util.Date();
		// java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
		//
		// preparedStatement.setDate(3, new
		// java.sql.Date(produtoVO.getData().getTime()));
		// preparedStatement.setDouble(4, produtoVO.getValor());
		// preparedStatement.setInt(5, produtoVO.getQuan());
		// preparedStatement.setDouble(6, produtoVO.getPeso());
		preparedStatement.setString(3, produtoVO.getTipo());
		int cont = preparedStatement.executeUpdate();
		if (cont == 1) {
			JOptionPane.showMessageDialog(null, "Produto Cadastrado com sucesso");
		}
	}

	public List<ProdutoVO> pesquisarProdutoTodos() throws Exception {
		List<ProdutoVO> retorno = new ArrayList<ProdutoVO>();

		int cont = 1;
		PreparedStatement preparedStatement = this.connection.prepareStatement("Select *From Produto");
		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {

			ProdutoVO produtoVO = new ProdutoVO();
			produtoVO.setCodigo(resultSet.getInt("Codigo_Produto"));
			produtoVO.setNome(resultSet.getString("Nome_Produto"));
			// produtoVO.setData(resultSet.getDate("Validade_Produtos"));
			// produtoVO.setValor(resultSet.getDouble("Valor_Produtos"));
			// produtoVO.setPeso(resultSet.getDouble("Peso_Produto"));
			// produtoVO.setQuan(resultSet.getInt("Quantidade_Produto"));
			produtoVO.setTipo(resultSet.getString("tipo_produto"));
			retorno.add(produtoVO);

			cont++;
		}

		return retorno;

	}

	public String excluir(ProdutoVO produtoVO) throws Exception {
		String retorno = "N�o foi possivel excluir o produto";
		PreparedStatement preparedStatement = this.connection
				.prepareStatement("DELETE FROM Produto WHERE Codigo_Produto = ?");

		preparedStatement.setInt(1, produtoVO.getCodigo());
		int cont = preparedStatement.executeUpdate();
		if (cont == 1) {
			retorno = "Produto excluido com sucesso";
		}

		return retorno;
	}

	public void alteraProduto(ProdutoVO produtoVO) throws Exception {

		PreparedStatement preparedStatement = this.connection
				.prepareStatement("UPDATE Produto SET Nome_produto = ?, tipo_produto=? WHERE Codigo_Produto = ?;");

		preparedStatement.setString(1, produtoVO.getNome());

		// java.util.Date dataUtil = new java.util.Date();
		// java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
		//
		// preparedStatement.setDate(2, new
		// java.sql.Date(produtoVO.getData().getTime()));
		// preparedStatement.setDouble(3, produtoVO.getValor());
		// preparedStatement.setInt(4, produtoVO.getQuan());
		// preparedStatement.setDouble(5, produtoVO.getPeso());
		preparedStatement.setInt(3, produtoVO.getCodigo());
		preparedStatement.setString(2, produtoVO.getTipo());

		int cont = preparedStatement.executeUpdate();
		if (cont == 1) {
			JOptionPane.showMessageDialog(null, "Produto Alterado com sucesso");
		}

	}

	public ProdutoVO pesquisarPorId(int codigo) throws SQLException {
		ProdutoVO produtoVO = new ProdutoVO();

		PreparedStatement preparedStatement = this.connection
				.prepareStatement("Select * From Produto Where Codigo_Produto = ?");
		preparedStatement.setInt(1, codigo);

		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			produtoVO.setCodigo(resultSet.getInt("Codigo_Produto"));
			produtoVO.setNome(resultSet.getString("Nome_Produto"));
			// produtoVO.setData(resultSet.getDate("Validade_Produtos"));
			// produtoVO.setValor(resultSet.getDouble("Valor_Produtos"));
			// produtoVO.setPeso(resultSet.getDouble("Peso_Produto"));
			// produtoVO.setQuan(resultSet.getInt("Quantidade_Produto"));
			produtoVO.setTipo(resultSet.getString("tipo_produto"));
		}

		return produtoVO;
	}

	public List<ProdutoVO> pesquisarPorNome(String nome) throws Exception {
		List<ProdutoVO> retorno = new ArrayList<ProdutoVO>();
		int cont = 1;
		PreparedStatement preparedStatement = this.connection
				.prepareStatement("Select*from produto where Nome_Produto=?");
		preparedStatement.setString(1, nome);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			ProdutoVO produtoVO = new ProdutoVO();
			produtoVO.setCodigo(resultSet.getInt("Codigo_Produto"));
			produtoVO.setNome(resultSet.getString("Nome_Produto"));
			// produtoVO.setData(resultSet.getDate("Validade_Produtos"));
			// produtoVO.setValor(resultSet.getInt("Valor_Produtos"));
			// produtoVO.setQuan(resultSet.getInt("Quantidade_Produto"));
			// produtoVO.setPeso(resultSet.getInt("Peso_Produto"));
			produtoVO.setTipo(resultSet.getString("tipo_produto"));
			retorno.add(produtoVO);
			cont++;
		}
		if (retorno.isEmpty()) {

			throw new Exception("N�o H� Produtos Cadastrados");

		}

		return retorno;
	}

	public void cadastraEntrada(ProdutoVO produtoVO) throws Exception {
		PreparedStatement preparedStatement = this.connection.prepareStatement(
				"Insert into Estoque (Validade_Produtos,Valor_Produtos,Quantidade_Produto,Peso_Produto,Codigo_Produto) values(?,?,?,?,?)");
		//preparedStatement.setInt(1, produtoVO.getLote());
		java.util.Date dataUtil = new java.util.Date();
		java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());

		preparedStatement.setDate(1, new java.sql.Date(produtoVO.getData().getTime()));
		preparedStatement.setDouble(2, produtoVO.getValor());
		preparedStatement.setInt(3, produtoVO.getQuan());
		preparedStatement.setDouble(4, produtoVO.getPeso());
		preparedStatement.setInt(5, produtoVO.getCodigo());

		int cont = preparedStatement.executeUpdate();
		if (cont == 1) {
			JOptionPane.showMessageDialog(null, "Entrada Cadastrada com sucesso");
		}

	}

	public List<ProdutoVO> listarLotes() throws Exception {
		List<ProdutoVO> retorno = new ArrayList<ProdutoVO>();

		PreparedStatement preparedStatement = this.connection.prepareStatement("Select *From Estoque");
		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {

			ProdutoVO produtoVO = new ProdutoVO();
			produtoVO.setCodigo(resultSet.getInt("Codigo_Produto"));
			produtoVO.setLote(resultSet.getInt("Lote_Estoque"));
			produtoVO.setData(resultSet.getDate("Validade_Produtos"));
			produtoVO.setValor(resultSet.getDouble("Valor_Produtos"));
			produtoVO.setPeso(resultSet.getDouble("Peso_Produto"));
			produtoVO.setQuan(resultSet.getInt("Quantidade_Produto"));
			retorno.add(produtoVO);

		}

		return retorno;
	}

	public ProdutoVO pesquisarPorLote(int codigo) throws Exception {
		ProdutoVO produtoVO = new ProdutoVO();

		PreparedStatement preparedStatement = this.connection
				.prepareStatement("Select * From Estoque Where Lote_Estoque = ?");
		preparedStatement.setInt(1, codigo);

		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			produtoVO.setCodigo(resultSet.getInt("Codigo_Produto"));
			produtoVO.setLote(resultSet.getInt("Lote_Estoque"));
			produtoVO.setData(resultSet.getDate("Validade_Produtos"));
			produtoVO.setValor(resultSet.getDouble("Valor_Produtos"));
			produtoVO.setPeso(resultSet.getDouble("Peso_Produto"));
			produtoVO.setQuan(resultSet.getInt("Quantidade_Produto"));
		}

		return produtoVO;
	}
	
	public void alteraLote(ProdutoVO produtoVO) throws Exception {
		PreparedStatement preparedStatement = this.connection.prepareStatement("UPDATE Estoque SET Validade_Produtos = ?, Valor_Produtos=?, Quantidade_Produto=?, Peso_Produto=? WHERE Lote_Estoque = ?;");

		java.util.Date dataUtil = new java.util.Date();
		java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
		
		preparedStatement.setDate(1, new java.sql.Date(produtoVO.getData().getTime()));
		preparedStatement.setDouble(2, produtoVO.getValor());
		preparedStatement.setInt(3, produtoVO.getQuan());
		preparedStatement.setDouble(4, produtoVO.getPeso());
		preparedStatement.setInt(5, produtoVO.getLote());
		int cont = preparedStatement.executeUpdate();
		if (cont == 1) {
			JOptionPane.showMessageDialog(null, "Lote Alterado com sucesso");
		}

	}

	public String excluirLote(int codigo) throws Exception {
		String retorno = "N�o foi possivel excluir o produto";
		PreparedStatement preparedStatement = this.connection.prepareStatement("DELETE FROM Estoque WHERE Lote_Estoque = ?");

		preparedStatement.setInt(1, codigo);
		int cont = preparedStatement.executeUpdate();
		if (cont == 1) {
			retorno = "Lote excluido com sucesso";
		}

		return retorno;
	}

	public boolean verificaExistenciaCodigoProduto(int codigo) throws SQLException {
		PreparedStatement preparedStatement = this.connection
				.prepareStatement("select Codigo_Produto from Produto where Codigo_Produto=?");
		int parameterIndex = 1;
		preparedStatement.setInt(parameterIndex++, codigo);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			return true;
			//Produto JA EXISTE

		} else {
			//Produto NOVO
			return false;
		}
		
	}
}
