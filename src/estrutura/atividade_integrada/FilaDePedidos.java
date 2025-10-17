package estrutura.atividade_integrada;

import java.util.LinkedList;
import java.util.Queue;

public class FilaDePedidos<T> {
	private Queue<T> fila = new LinkedList<>();
	
	public void adicionar(T valor) {
		fila.offer(valor);
	}
	
	public T remover() {
		return fila.poll();
	}
	
	public boolean estaVizia() {
		return fila.isEmpty();
	}
	
	public void imprimir() {
		System.out.println(fila);
	}
}
