package estrutura.vetor;

import java.util.Arrays;

public class Exemplo01 {
	public static void main(String[] args) {
		// declararação do vetor
		int [] numeros = new int[5];
		int c = 2;
		
		// inicializando o vetor e imprimindo cada elemento do vetor
		for(int i = 0; i<5; i++) {
			numeros[i] = c +=2;
		}

		System.out.println(Arrays.toString(numeros));

	}
}