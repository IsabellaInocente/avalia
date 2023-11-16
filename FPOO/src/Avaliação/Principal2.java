package Avaliação;

public class Principal2 {
	public static void main(String[] args) {
	Pessoa2 pessoa = new Pessoa2("ronaldo");
	System.out.println("Pessoa:");
	System.out.println("nome:" + pessoa.getNome());
	
	Fisica Fisica = new Fisica("João", "009.816.543-21", "400.368-x");
	System.out.println("\nPessoa fisica:");
	System.out.println("nomw:" +Fisica.getNome());
	System.out.println("cpf:"+ Fisica.getcpf());
	System.out.println("rg:" + Fisica.getrg());

}}
