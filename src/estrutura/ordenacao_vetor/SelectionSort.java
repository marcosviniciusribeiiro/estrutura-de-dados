package estrutura.ordenacao_vetor;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] vetor = {22,11,6, 66, 29, 6,1,6,12,10,22,3};
		int menor_index, temp, troca = 0, comparacao = 0;
		for(int i = 0; i < vetor.length - 1; i++) {
			menor_index = i;
			for(int j = i+1; j < vetor.length; j++) {
				comparacao++;
				if(vetor[j] < vetor[menor_index]) {
					menor_index = j;
				}
			}
			temp = vetor[i];
			vetor[i] = vetor[menor_index];
			vetor[menor_index] = temp;
			troca++;
		}
		System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
		System.out.println("Quantidade de Trocas: " + troca);
		System.out.println("Numeros de Comparações: " + comparacao);
	}
}
