package estrutura.pilha;

public class TestarPilha {
	public static void main(String[] args) {
		Pilha pilha = new Pilha(5);
		pilha.empilhar(10);
		pilha.empilhar(15);
		pilha.empilhar(30);
		pilha.empilhar(5);
		System.out.println("Elemento no topo da pilha: " + pilha.topo());
		System.out.println("Removendo um elemento da pilha: " + pilha.desempilhar());
		System.out.println("Elemento no topo da pilha: " + pilha.topo());
		pilha.empilhar(60);
		pilha.empilhar(55);
		System.out.println("Elemento no topo da pilha: " + pilha.topo());
		System.out.println("A pilha está cheia? " + pilha.estaCheia());
	}
}
