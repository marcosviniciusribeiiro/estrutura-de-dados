package estrutura.vetor;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio01 {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println((i+1) + "° número:");
			numeros[i] = sc.nextInt();
		}
		System.out.println("Vetor de Números: " + Arrays.toString(numeros));
	}
}