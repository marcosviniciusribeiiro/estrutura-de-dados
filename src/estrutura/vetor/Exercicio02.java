package estrutura.vetor;

import java.util.Scanner;

public class Exercicio02 {
	public static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int[] vetor = new int[5];
		int  soma=0;
		
		System.out.println("Vamos Calcular!");
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Numero " + (i+1) + ": ");
			vetor[i] = sc.nextInt();
			soma += vetor[i];
		}		
		System.out.println("Soma Total = " + soma);

	}
}
