package estrutura.atividade_integrada.fila;

import java.util.LinkedList;
import java.util.Queue;

public class FilaDePedidos<T> {
	private Queue<T> fila = new LinkedList<>();
	
	public void enfileirar(T valor) {
		fila.offer(valor);
	}
	
	public T desenfileirar() {
		return fila.poll();
	}
	
	
}
