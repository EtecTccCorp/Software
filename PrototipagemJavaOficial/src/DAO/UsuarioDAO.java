package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import javax.swing.JOptionPane;

import DAOFactory.DAOFactory;
import VO.UsuarioVO;

public class UsuarioDAO {

	private Connection connection;

	public UsuarioDAO() throws Exception {
		this.connection = DAOFactory.conexao();
	}

	public void cadastrarUsuario(UsuarioVO uVO) throws Exception {
		PreparedStatement preparedStatement = this.connection.prepareStatement(
				"INSERT INTO Usuario(Nome_Usuario,Senha_Usuario,Login_Usuario,Email_Usuario,Tipoconta_Usuario) VALUES(?,MD5(?),?,?,?)");
		preparedStatement.setString(1, uVO.getNome());
		preparedStatement.setString(2, uVO.getSenha());
		preparedStatement.setString(3, uVO.getLogin());
		preparedStatement.setString(4, uVO.getEmail());
		preparedStatement.setString(5, uVO.getTipo_conta());
		
		
		int cont = preparedStatement.executeUpdate();
		if (cont == 1) {
			JOptionPane.showMessageDialog(null, "Usuario Cadastrado com sucesso");
		}

	}

	public boolean senhaAdministrador(String senha) throws Exception {
		boolean retorno = false;
		
		PreparedStatement preparedStatement = this.connection.prepareStatement("SELECT * FROM Usuario WHERE Senha_Usuario = MD5(?) AND Tipoconta_Usuario = 'Administrador'");
		
		preparedStatement.setString(1, senha);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()){
			
			retorno = true;
			
		}
		
		return retorno;
	}


}
