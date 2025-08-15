package estrutura.vetor;

import java.util.Random;

public class Exercicio08 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] numerosSorteados = new int[20];
				
		
		for(int i = 0; i < numerosSorteados.length; i++) {
			numerosSorteados[i] = aleatorio.nextInt(101);
		}
	}
}

/*8 - Sortear 20 números entre 0 e 100 e armazene-os em um vetor. 
Em seguida, crie um novo vetor que contenha apenas os números únicos (não repetidos) do vetor original.

*/
