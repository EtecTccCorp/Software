package VO;

public class AlterarSenhaVO {
	
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenhaAtual() {
		return senhaAtual;
	}
	public void setSenhaAtual(String senhaAtual) {
		this.senhaAtual = senhaAtual;
	}
	public String getSenhaNova() {
		return senhaNova;
	}
	public void setSenhaNova(String senhaNova) {
		this.senhaNova = senhaNova;
	}
	private String login;
	private String email;
	private String senhaAtual;
	private String senhaNova;

}
