package estrutura.vetor;

import java.util.Random;
import java.util.Arrays;

public class Exercicio14 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] numeros = new int[10];
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = aleatorio.nextInt(50) + 1;
		}
		
		System.out.println("Vetor original: " + Arrays.toString(numeros));
		
		for(int i = 0,  j = numeros.length - 1; i < j; i++, j--) {
			int aux = numeros[i];
			numeros[i] = numeros[j];
			numeros[j] = aux;
		}
		System.out.println("Vetor com elementos invertidos: " + Arrays.toString(numeros));
	}
}

/*14 - Sortear 10 números e armazene-os em um vetor. E inverter o vetor de forma que troque os elementos da:
   posição 0 com a posição 9
   posição 1 com a posição 8
   posição 2 com a posição 7
   posição 3 com a posição 6
   posição 4 com a posição 5*/
