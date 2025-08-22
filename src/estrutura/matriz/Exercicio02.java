package estrutura.matriz;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		int[][] numeros = new int [5][5];
		
		int numPares = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[i].length; j++) {
				System.out.println("Digite um número:");
				numeros[i][j] = sc.nextInt();
				
				if(numeros[i][j] % 2 == 0) {
					numPares++;
				}
			}
		}
		sc.close();
		
		System.out.println("\nMatriz");
		
		for(int[] linha : numeros) {
			for(int elemento: linha) {
				System.out.print(elemento + " ");
			}
			System.out.println();
		}
		System.out.println("\nNúmeros Pares: " + numPares);
	}
}
/*2 - Crie um algoritmo que leia uma matriz 5x5. Em seguida, conte quantos números pares existem na matriz.
Imprima toda a matriz e imprima também a quantidade de números pares.*/
