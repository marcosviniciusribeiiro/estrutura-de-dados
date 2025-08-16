package estrutura.vetor;

import java.util.Random;
import java.util.Arrays;

public class Exercicio14 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] numeros = new int[10];
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = aleatorio.nextInt(11);
		}
		
		int j = numeros.length - 1;
		for(int i = 0; i <= 4; i++) {
			if(j >= 5) {
				int n = numeros[i];
				numeros[i] = numeros[j];
				numeros[j] = n;
				j--;
			}
		}	
		System.out.println("Vetor: " + Arrays.toString(numeros));
	}
}