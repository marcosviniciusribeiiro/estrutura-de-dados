package estrutura.vetor;

import java.util.Arrays;

public class Exercicio09 {
	public static void main(String[] args) {
		int[] vetor1 = {4, 2, 13, 10, 16, 7};
		int[] vetor2 = {5, 6, 1, 15, 4, 2};
		
		int[] vetor3 = new int[6];
		
		for(int i = 0; i < vetor3.length; i++) {
			vetor3[i] = vetor1[i] * vetor2[i];
		}
		System.out.println("Vetor: " + Arrays.toString(vetor3));
	}
}

/*9 - Inicialize dois vetores de 6 elementos inteiros cada. Gere um terceiro vetor onde 
  cada elemento é o produto dos elementos correspondentes nos vetores originais.*/
