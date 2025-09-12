package estrutura.pilha.exercicios;

import java.util.Random;
import java.util.Stack;

public class PilhaNumeros {
	public static void main(String[] args) {
		Stack<Integer> pilhaPar = new Stack<>();
		Stack<Integer> pilhaImpar = new Stack<>();
		
		for(int i = 0; i < 10; i++) {
			Random sortear = new Random();
			int num = sortear.nextInt(100) + 1;
			
			if(num % 2 == 0) {
				pilhaPar.push(num);
			}else {
				pilhaImpar.push(num);
			}
		}
		
		System.out.println("Esvaziando a Pilha Impar:");
		for(int elemento : pilhaImpar) {
			System.out.printf("Removendo o %d da pilha\n", elemento);
		}
		System.out.println();
		
		System.out.println("Esvaziando a Pilha Par:");
		for(int elemento : pilhaPar) {
			System.out.printf("Removendo o %d da pilha\n", elemento);			
		}
		System.out.println();
	}
}