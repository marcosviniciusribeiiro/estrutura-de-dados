package estrutura.matriz;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] mat = new int[5][5];
		int soma = 0;
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				System.out.println("Digite um núemro:");
				mat[i][j] = sc.nextInt();
				soma += mat[i][j];
			}
		}
		sc.close();
		
		System.out.println("Matriz 5x5");
		
		for(int[] linha: mat) {
			for(int elemento:linha) {
				System.out.print(elemento + " ");
			}
			System.out.println();
		}
		System.out.println("\nSoma dos Elementos: " + soma);
	}
}
/*1 - Crie um algoritmo que leia uma matriz 5x5. Em seguida, some todos os números da matriz. 
 * Imprima toda a matriz e imprima também soma dos elementos*/