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