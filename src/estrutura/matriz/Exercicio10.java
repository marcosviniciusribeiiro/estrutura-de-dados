package estrutura.matriz;

import java.util.Random;

public class Exercicio10 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int[][] matriz = new int [10][10];
		
		int maiorNum = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rd.nextInt(100) + 1;
				if(matriz[i][j] > maiorNum) {
					maiorNum = matriz[i][j];
				}
			}
		}
		
		System.out.println("Matriz");
		
		for(int[] linha: matriz) {
			for(int elemento : linha) {
				System.out.print(elemento + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nMaior Número: " + maiorNum);
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == maiorNum) {
					System.out.println("\nPosição do Maior Número:\nLinha " + i + "\nColuna " + j);
				}
			}
		}
	}
}
/*10 – Declare e atribua com números sorteados de 1 ATE 100 uma matriz 10x10 
 * ao final imprimir toda a matriz e o maior numero dentro da matriz e informe as posições (linha e coluna) 
 * que o maior numero está armazenado.*/
