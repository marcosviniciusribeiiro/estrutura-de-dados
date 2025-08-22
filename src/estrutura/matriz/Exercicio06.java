package estrutura.matriz;

import java.util.Random;

public class Exercicio06 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int[][] m1 = new int[2][5];
		int[][] m2 = new int[2][5];
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 5; j++) {
				m1[i][j] = rd.nextInt(10) + 1;
				m2[i][j] = rd.nextInt(10) + 1;
			}
		}
		
	}
}
/*6 - Crie um algoritmo que sorteie números de 1 até 10 e atribua duas matrizes 2x5 
 * e crie uma terceira matriz também 2x5 com o valor da soma dos elementos de mesmo índice. */