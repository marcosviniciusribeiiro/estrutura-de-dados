package estrutura.vetor;

import java.util.Scanner;

public class Exercicio01 {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println((i+1) + "° número:");
			int numero = sc.nextInt();
			
			numeros[i] = numero;
		}
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}