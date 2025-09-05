package estrutura.fila.vetor;

public class FilaArray {
	private int[] fila;
	private int tamanho;
	private int frente;
	private int tras;
	
	// Método construtor
	public FilaArray(int capacidade) {
		fila = new int[capacidade];
		tamanho = 0;
		frente = 0;
		tras = -1;
	}
	
	// Método que retorna verdadeiro caso a fila esteja vazia
	public boolean estaVazia() {
		return tamanho == 0;
	}
	
	// Método que retorna verdadeiro caso a fila esteja cheia
	public boolean estaCheia() {
		return tamanho == fila.length;
	}
	
	// Adiciona um elemento no final da fila
	public void enfileirar(int elemento) {
		if (estaCheia()) {
			System.out.println("Não foi possivel adicionar um elemento, a fila já está cheia.");
			return;
		}
		tras = (tras + 1) % fila.length;
		fila[tras] = elemento;
		tamanho++;
	}
	
	// Retira o primeiro elemento da fila
	public int desenfileirar() {
		if (estaVazia()) {
			System.out.println("A fila está vazia, não é possivel desenfileirar um elemento.");
			return 0;
		}
		int elementoRemovido = fila[frente];
		frente = (frente + 1) % fila.length;
		tamanho--;
		return elementoRemovido;
	}
	
	// Retorna o proximo elemento da fila
	public int proximoElemento() {
		if (estaVazia()) {
			throw new RuntimeException("A fila está vazia.");
		}
		return fila[frente];
	}
}