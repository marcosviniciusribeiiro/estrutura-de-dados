package estrutura.vetor;

import java.util.Scanner;
import java.util.Arrays;;

public class Exercicio15 {
	public static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int[] vetor1 = new int[7];
		int[] vetor2 = new int[7];
		int[] vetor3 = new int[14];
		System.out.println("Preenchendo o primeiro vetor:");
		for(int i = 0; i < vetor1.length; i++) {
			System.out.println("Digite o número " + (i+1) + ": ");
			vetor1[i] = sc.nextInt();
		}
		
		System.out.println("\nPreenchendo o segundo vetor:");
		for(int i = 0; i < vetor2.length; i++) {
			System.out.println("Digite o número " + (i+1) + ": ");
			vetor2[i] = sc.nextInt();
		}
		
		for(int i = 0; i < vetor1.length; i++) {
			vetor3[i] = vetor1[i];
		}
		for(int i = 0; i < vetor2.length; i++) {
			vetor3[vetor1.length + i] = vetor2[i];
		}
		
		System.out.println("\nVetor 1: " + Arrays.toString(vetor1));
		System.out.println("Vetor 2: " + Arrays.toString(vetor2));
		System.out.println("Vetor 3 (concatenado): " + Arrays.toString(vetor3));
		
	}
}
/*
15 - Dado dois vetores de 7 elementos cada, 
crie um terceiro vetor que seja a concatenação dos dois primeiros.
*/