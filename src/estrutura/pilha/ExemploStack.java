package estrutura.pilha;

import java.util.Stack;

public class ExemploStack {
	public static void main(String[] args) {
		Stack<Integer> pilha = new Stack<>();
		pilha.push(10);
		pilha.push(22);
		pilha.push(36);
		
		System.out.println("Elemento do topo da pilha: " + pilha.peek());
		System.out.println("Removendo o elemento: " + pilha.pop());		
		System.out.println("Elemento do topo da pilha: " + pilha.peek());
		System.out.println("Removendo o elemento: " + pilha.pop());
		System.out.println("Elemento do topo da pilha: " + pilha.peek());
		System.out.println("Removendo o elemento: " + pilha.pop());
		System.out.println("A pilha está vazia? " + pilha.isEmpty());
		
	}
}
