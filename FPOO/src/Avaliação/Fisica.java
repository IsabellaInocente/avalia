package Avaliação;

public class Fisica extends Pessoa2 {
	private String cpf;
	private String rg;
	
	public Fisica(String nome, String cpf, String rg) {
		super(nome);
		this.cpf = cpf;
		this.rg = rg;
	}
	public String getcpf() {
		return cpf;
	}
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	public String getrg() {
		return rg;
	}
	public void setnome(String rg) {
		this.rg = rg;
	}
}