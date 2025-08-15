package estrutura.vetor;

import java.util.Scanner;

public class Exercicio17 {
	public static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int[] numeros = new int[3];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Número " + (i+1));
			int numero = sc.nextInt();
			numeros[i] = numero;
			
			if(numeros[i] < 0) {
				numeros[i] = 0;
			}
		}
				
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
	}
}