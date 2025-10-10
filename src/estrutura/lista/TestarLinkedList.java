package estrutura.lista;

import java.util.LinkedList;

public class TestarLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> numeros = new LinkedList<Integer>();
		numeros.add(34);
		numeros.add(18);
		numeros.add(41);
		numeros.add(5);
		imprimir(numeros);
		numeros.removeFirst();
		imprimir(numeros);
	}
	public static void imprimir(LinkedList<Integer> numeros) {
		for(Integer elemento : numeros) {
			System.out.print(elemento + " ");
		}
		System.out.println();
	}
}
