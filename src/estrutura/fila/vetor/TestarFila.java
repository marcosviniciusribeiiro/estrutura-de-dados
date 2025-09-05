package estrutura.fila.vetor;

public class TestarFila {
	public static void main(String[] args) {
		FilaArray fila = new FilaArray(5);
		System.out.println("A fila está vazia? " + fila.estaVazia());
		fila.enfileirar(5);
		fila.enfileirar(10);
		fila.enfileirar(20);
		fila.enfileirar(30);
		fila.enfileirar(45);
		
		System.out.println("Removendo o elemento da fila: " + fila.desenfileirar());
		System.out.println("Removendo o elemento da fila: " + fila.desenfileirar());
		System.out.println("Removendo o elemento da fila: " + fila.desenfileirar());
		System.out.println("Removendo o elemento da fila: " + fila.desenfileirar());
		System.out.println("Removendo o elemento da fila: " + fila.desenfileirar());
	}
}
