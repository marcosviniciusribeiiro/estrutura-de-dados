package estrutura.vetor;

import java.util.Scanner;

public class Exercicio04 {
	public static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int[] numeros = new int[15];
		int numero, i, contador = 0;
		
		
		for(i = 0; i < numeros.length; i++) {
			System.out.println("Numero " + (i+1) + ": ");
			numero = sc.nextInt();
			numeros[i] = numero;
			
			if(numero % 2 == 0) {
				contador ++;
			}
		}
		System.out.println("Numeros Pares: " + contador);
		for(i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.println(numeros[i]);
			}
		}
	}
}