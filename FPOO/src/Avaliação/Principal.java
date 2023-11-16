package Avaliação;


public class Principal {
	public static void main(String[]args) {
		Usuario usuario = new Usuario();
		
		usuario.setNome("isabella");
		usuario.setPassword(5202);
		usuario.setPermissao("altorizado");
		usuario.setUsuario("isa");
		
		System.out.println(usuario.getNome());
		System.out.println(usuario.getPassword());
		System.out.println(usuario.getPermissao());
		System.out.println(usuario.getUsuario());
		
	}
}
