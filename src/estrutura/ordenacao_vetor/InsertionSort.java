package estrutura.ordenacao_vetor;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] vetor = {7,23,10,6,15,8,3,5,13,20,9,11};
		int key;
		
		for(int i = 1; i < vetor.length; i++) {
			key = vetor[i];
			int j = i-1;
			while(j >= 0 && vetor[j]>key) {
				vetor[j+1] = vetor[j];
				j--;
			}
			vetor[j+1] =key;
		}
		System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
	}
}
