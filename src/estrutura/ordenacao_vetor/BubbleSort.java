package estrutura.ordenacao_vetor;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] vetor = {22,11,6, 66, 29, 6,1,6,12,10,22,3};
		int temp = 0;
		int troca = 0, comparacao = 0;
		for(int i = 0; i < vetor.length - 1; i++) {
			for(int j = 0; j < vetor.length - 1-i; j++) {
				if (vetor[j] > vetor[j+1]) {
					comparacao++;
					temp = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = temp;
					troca++;
				}
			}
		}
		
		System.out.println("Vetor Ordenado: " + Arrays.toString(vetor));
		System.out.println("Quantidade de Trocas: " + troca);
		System.out.println("Numeros de Comparações: " + comparacao);
	}
}
