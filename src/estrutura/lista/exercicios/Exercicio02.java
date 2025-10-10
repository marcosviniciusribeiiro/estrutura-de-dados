package estrutura.lista.exercicios;

import java.util.LinkedList;
import java.util.List;

public class Exercicio02 {
	public static void main(String[] args) {
		LinkedList<Integer> numeros = new LinkedList<Integer>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		numeros.add(50);
		imprimir(numeros);
		numeros.removeFirst();
		numeros.removeLast();
		imprimir(numeros);
	}
	
	public static void imprimir(List<Integer> lista) {
		for(Integer elemento : lista) {
			System.out.print(elemento + " ");
		}
		System.out.println();
	}
}