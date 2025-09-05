package estrutura.fila.queue;

import java.util.LinkedList;
import java.util.Queue;

public class FilaGenerica<T> {
	private Queue<T> fila = new LinkedList<>();

	public boolean estaVazia() {
		return fila.isEmpty();
	}
	
	public void enfileirar(T elemento) {
		fila.offer(elemento);
	}
	
	public T desenfileirar() {
		return fila.poll();
	}
	
	public T proximoElemento() {
		return fila.element();
	}
	
	public void imprimirFila() {
		for(T elemento : fila) {
			System.out.print(elemento + " ");		
		}
	}
}
