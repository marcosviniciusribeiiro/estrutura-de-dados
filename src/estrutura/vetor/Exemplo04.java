package estrutura.vetor;

import java.util.Scanner;
import java.util.Arrays;
public class Exemplo04 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int[] numeros;
		
		System.out.println("Tamanho do Vetor: ");
		int tamanho = sc.nextInt();
		
		numeros = new int[tamanho];
		
		for(int i = 0; i < tamanho; i++) {
			System.out.println("Numero na posição " + i + ": ");
			int numero = sc.nextInt();
			numeros[i] = numero;
		}
		
		System.out.println("Vetor de Números: " + Arrays.toString(numeros));
	}
}
