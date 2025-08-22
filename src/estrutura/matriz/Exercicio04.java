package estrutura.matriz;

import java.util.Random;

public class Exercicio04 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		int[][] matriz = new int [5][2];
		
		int soma=0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = aleatorio.nextInt(11);
				soma += matriz[i][j];
			}
		}
		
		double media = soma / 10;
		 
		
		System.out.println("Matriz");
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nMedia " + media);
		
		System.out.println("\nNúmeros Acima da Média");
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] > media) {
					System.out.print(matriz[i][j] + " ");
				}
			}
		}
	}
}
/*4 - Criar uma matriz 5x2 e sortear números de 1 até 10 e inserir na matriz.
Crie um algoritmo que calcule a média dos elementos de uma matriz 5x2.
imprima a matriz completa 
imprima a media dos elementos 
imprima somente os números que estão acima da media
*/