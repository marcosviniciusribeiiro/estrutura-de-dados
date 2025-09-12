package estrutura.pilha.exercicios;

public class PilhaFuncionarios {
	private int topo;
	private Funcionarios[] elementos;
	private int capacidade;
	
	public PilhaFuncionarios(int capacidade) {
		this.capacidade = capacidade;
		this.elementos = new Funcionarios[capacidade];
		this.topo = -1;
	}
	
	public boolean estaVazio() {
		return topo == -1;
	}
	
	public boolean estaCheio() {
		return topo == capacidade - 1;
	}
	
	public void empilhar(Funcionarios elemento) {
		if(estaCheio()) {
			System.out.println("A pilha está cheia.");
			return;
		}
		topo++;
		elementos[topo] = elemento;
	}
	
	public Funcionarios desempilhar() {
		if(estaVazio()) {
			throw new IllegalStateException("A pilha está vazia.");
		}
		Funcionarios funcionarioRemovido = elementos[topo];
		topo--;
		return funcionarioRemovido;
	}
	
	public Funcionarios topo() {
		if(estaVazio()) {
			throw new IllegalStateException("A pilha está vazia.");
		}
		return elementos[topo];
	}
}
