package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import DAOFactory.DAOFactory;
import VO.AlterarSenhaVO;

public class AlterarSenhaDAO {

	private Connection connection;
	
	
	public AlterarSenhaDAO() throws Exception {
		this.connection = DAOFactory.conexao();
	}
	public void alterarSenha(AlterarSenhaVO senha) throws Exception  {

		PreparedStatement preparedStatement = this.connection.prepareStatement("UPDATE USUARIO SET Senha_Usuario = MD5(?) where Senha_Usuario = MD5(?) and Nome_Usuario = ? and Email_Usuario = ? and Login_Usuario=?");
		preparedStatement.setString(1, senha.getSenhaNova());
		preparedStatement.setString(2, senha.getSenhaAtual());
		preparedStatement.setString(3, senha.getNome());
		preparedStatement.setString(4, senha.getEmail());
		preparedStatement.setString(5, senha.getLogin());
		
		
		if(preparedStatement.executeUpdate() == 1){
			
			JOptionPane.showMessageDialog(null, "Usuario alterado com sucesso");
		}
		
		
		
		
		
	}

}
