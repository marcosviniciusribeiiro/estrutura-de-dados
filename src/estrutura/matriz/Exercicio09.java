package estrutura.matriz;

import java.util.Arrays;

public class Exercicio09 {
	public static void main(String[] args) {
		double[][] notas = {{5.4, 6.2, 6.4, 7},	{7.4, 6.9, 8, 7.7}, {3.5, 4.6, 4.7, 5}, {9, 8.8, 9.2, 8.4}, {7, 6.4, 7.2, 8}};
	
		double soma = 0, media;
		double[] medias = new double [5];
	
	
		for(int i = 0; i < notas.length; i++) {
			for(int j = 0; j < notas[i].length; j++) {
				soma += notas[i][j];
			}
			media = soma / 4;
			medias[i] = media;
			soma = 0;
		}
		
		System.out.println("\nMatriz de notas:");
		
		for(int i = 0; i < notas.length; i++) {
			for(int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("\nMédias: " + Arrays.toString(medias));

	}
}
/*9 – Criar uma matriz nota de 5x4 e atribua notas para a matriz declarada.
Armazene a media de cada linha em um vetor media[5] ao final imprima a matriz e o vetor*/