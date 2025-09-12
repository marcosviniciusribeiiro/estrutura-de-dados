package estrutura.pilha.exercicios;

public class Funcionarios {
	private String nome;
	private String cargo;
	
	public Funcionarios(String nome, String cargo) {
		this.nome = nome;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return nome + " - " + cargo;
	}
	
}
