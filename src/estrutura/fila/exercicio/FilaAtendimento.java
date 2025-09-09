package estrutura.fila.exercicio;

import java.util.Queue;
import java.util.LinkedList;

public class FilaAtendimento<T> {
	private Queue<T> fila = new LinkedList<T>();
	
	public void adicionarCliente(T elemento) {
		fila.add(elemento);
	}
	
	public T atenderCliente() {
		return fila.poll();
	}
	
	public boolean verificarFilaVazia() {
		return fila.isEmpty();
	}
	
	public T primeiroCliente() {
		return fila.element();
	}
	
	public void imprimirFila() {
		for(T elemento : fila) {
			System.out.println(elemento);
		}
	}
}
