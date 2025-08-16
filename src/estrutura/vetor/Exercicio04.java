package estrutura.vetor;

import java.util.Scanner;

public class Exercicio04 {
	public static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int[] numeros = new int[15];
		int contador = 0;
		
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Numero " + (i+1) + ": ");
			numeros[i] = sc.nextInt();
			
			if(numeros[i] % 2 == 0) {
				contador ++;
			}
		}
		System.out.println("Numeros Pares: " + contador);
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.println(numeros[i]);
			}
		}
	}
}