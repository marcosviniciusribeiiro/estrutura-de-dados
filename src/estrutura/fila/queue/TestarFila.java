package estrutura.fila.queue;

public class TestarFila {
	public static void main(String[] args) {
		FilaGenerica<String> filaStrings = new FilaGenerica<>();
		filaStrings.enfileirar("João");
		filaStrings.enfileirar("Maria");
		filaStrings.enfileirar("Felipe");
		
		filaStrings.imprimirFila();
		
		
		System.out.println("\nRemovendo o elemento da fila: " + filaStrings.desenfileirar());
		
		filaStrings.imprimirFila();
	}
}
