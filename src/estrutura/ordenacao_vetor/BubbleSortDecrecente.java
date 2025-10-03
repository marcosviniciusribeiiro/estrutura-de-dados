package estrutura.ordenacao_vetor;

import java.util.Arrays;

public class BubbleSortDecrecente {
	public static void main(String[] args) {
		int[] vetor = {3,1,7,4,10,8,12,17,20,5};
		int temp;
		
		for(int i = 0; i < vetor.length - 1; i++) {
			for(int j = 0; j < vetor.length - 1; j++) {
				if(vetor[j]<vetor[j+1]) {
					temp = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = temp;
				}
			}
		}
		System.out.println("Vetor ordenado: " + Arrays.toString(vetor));

	}
}
