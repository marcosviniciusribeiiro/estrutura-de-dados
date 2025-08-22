package estrutura.matriz;

import java.util.Random;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[][] mat = new int[10][10];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = rd.nextInt(100) + 1;
			}
		}
		
		System.out.println("Digite um Número:");
		int numero = sc.nextInt();
		
		sc.close();
		
		boolean encontrado = false;
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == numero) {
					System.out.println("Número encontrado na posição [" + i + "][" + j + "]"); 
					encontrado = true;
				}
			}
		}
		
		if(!encontrado) {
			System.out.println("O Número não foi encontrado.");
		}
	}
}
/*11 – Declare e atribua com números sorteados de 1 ATE 100 uma matriz 10x10.
 * Ao final leia um numero e procure o numero dentro da matriz e informe qual a posição linha e coluna que o numero foi encontrado. 
 * Caso o numero não exista na matriz exiba uma mensagem que o numero não existe na matriz.*/
