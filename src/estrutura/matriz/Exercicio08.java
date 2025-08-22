package estrutura.matriz;

import java.util.Random;

public class Exercicio08 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int[][] matriz = new int [5][5];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(i == j) {
					matriz[i][j] = rd.nextInt(10) + 1;
				}else {
					matriz[i][j] = 0;
				}
			}
		}
		
		for(int[] lista : matriz) {
			for(int elemento : lista) {
				System.out.print(elemento + " ");
			}
			System.out.println();
		}
	}
}
/*8 - Crie um algoritmo que declare e inicialize uma matriz 5x5 com números sorteados de 1 ate 10, sendo que todos os elementos abaixo da diagonal principal deverá ser igual a 0.
Ao final imprima a matriz completa*/