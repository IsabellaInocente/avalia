package Avaliação;

public class Usuario {

	String nome;
	int id;
	String permissao;
	String usuario;
	int password;
	public Usuario() {
		
	}
	public Usuario(String nome, int id, String permissao, String usuario, int password) {
		super();
		this.nome = nome;
		this.id = id;
		this.permissao = permissao;
		this.usuario = usuario;
		this.password = password;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPermissao() {
		return permissao;
	}
	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	
}
