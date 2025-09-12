package estrutura.pilha.exercicios;

import java.util.Stack;

public class TransferenciaPilhas {
	public static void main(String[] args) {
		Stack<Integer> pilhaOrigem = new Stack<>();
		
		//adicionando os elementos na primeira pilha
		pilhaOrigem.push(1);
		pilhaOrigem.push(2);
		pilhaOrigem.push(3);
		pilhaOrigem.push(4);
		pilhaOrigem.push(5);
		
		System.out.println("Pilha de origem: ");
		imprimir(pilhaOrigem);
		
		Stack<Integer> pilhaDestino = new Stack<>();
		
		//transferindo os elementos da primeira pilha para a segunda pilha
		while(! pilhaOrigem.isEmpty()) {
			pilhaDestino.push(pilhaOrigem.pop());
		}
		
		System.out.println("Pilha de destino: ");
		imprimir(pilhaDestino);

		//desempilhandos elementos da segunda pilha
		System.out.println("Removendo um elemento da pilha: " + pilhaDestino.pop());
		System.out.println("Removendo um elemento da pilha: " + pilhaDestino.pop());
		System.out.println("Removendo um elemento da pilha: " + pilhaDestino.pop());
		System.out.println("Removendo um elemento da pilha: " + pilhaDestino.pop());
		System.out.println("Removendo um elemento da pilha: " + pilhaDestino.pop());
		System.out.println("A pilha de origem está vazia? " + pilhaOrigem.isEmpty());
		System.out.println("A pilha de destino está vazia? " + pilhaDestino.isEmpty());
	}
	
	public static void imprimir(Stack<Integer> pilha) {
		for(int elemento : pilha) {
			System.out.print(elemento + " ");
		}
		System.out.println("\n");
	}
}