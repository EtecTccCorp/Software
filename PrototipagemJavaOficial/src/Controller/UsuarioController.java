package Controller;

import java.sql.SQLException;

import BO.UsuarioBO;
import VO.UsuarioVO;

public class UsuarioController {

		public void cadastroDeUsuario(UsuarioVO uVO) throws Exception{
			UsuarioBO uBO = new UsuarioBO();
			uBO.cadastrarUsuario(uVO);
			
		}

		public boolean senhaAdministrador(String senha) throws Exception {
			UsuarioBO bo = new UsuarioBO();
			return bo.senhaAdministrador(senha);
		}
}
