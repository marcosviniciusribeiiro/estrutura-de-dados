package estrutura.pilha.exercicios;

public class TestarPilhaFuncionarios {
	public static void main(String[] args) {
		PilhaFuncionarios pilha = new PilhaFuncionarios(4);
		Funcionarios f1 = new Funcionarios("João", "Gerente");
		Funcionarios f2 = new Funcionarios("Maria", "Assistente");
		Funcionarios f3 = new Funcionarios("Jéssica", "Diretora");
		Funcionarios f4 = new Funcionarios("Pedro", "Estagiário");
		
		
		pilha.empilhar(f1);
		pilha.empilhar(f2);
		pilha.empilhar(f3);
		pilha.empilhar(f4);
		
		System.out.println("Removendo funcionario da pilha: " + pilha.desempilhar());
		System.out.println("Removendo funcionario da pilha: " + pilha.desempilhar());
		System.out.println("Removendo funcionario da pilha: " + pilha.desempilhar());
		System.out.println("Removendo funcionario da pilha: " + pilha.desempilhar());
	}
}
