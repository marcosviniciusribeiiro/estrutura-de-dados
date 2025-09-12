package estrutura.pilha;

public class Pilha {
	private int topo;
	private int[] elementos;
	private int capacidade;
	
	public Pilha(int capacidade) {
		this.capacidade = capacidade;
		this.elementos = new int[capacidade];
		this.topo = - 1;
	}
	
	public boolean estaVazia() {
		return topo == -1;
	}
	
	public boolean estaCheia() {
		return topo == capacidade - 1;
	}
	
	public void empilhar(int elemento) {
		if(estaCheia()) {
			System.out.println("A pilha está cheia.");
			return;
		}
		topo++;
		elementos[topo] = elemento;
	}
	
	public int desempilhar() {
		if(estaVazia()) {
			throw new IllegalStateException("A pilha está vazia.");			
		}
		int elementoRemovido = elementos[topo];
		topo --;
		return elementoRemovido;
	}
	
	public int topo() {
		if(estaVazia()) {
			throw new IllegalStateException("A pilha está vazia.");			
		}
		return elementos[topo];
	}
}
