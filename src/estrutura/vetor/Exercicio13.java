package estrutura.vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio13 {
	public static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int[] numeros = new int [10];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o número " + (i+1) + ": ");
			numeros[i] = sc.nextInt(); 
		}
		
		System.out.println("Vetor original: " + Arrays.toString(numeros));
		
		int ultimo = numeros[numeros.length-1];
		
		for(int i = numeros.length - 1; i > 0; i--) {
			numeros[i] = numeros[i - 1];
		}
		numeros[0] = ultimo;
		
		System.out.println("Vetor formatado: " + Arrays.toString(numeros));
	}
}