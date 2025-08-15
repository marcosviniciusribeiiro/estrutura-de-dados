package estrutura.vetor;

import java.util.Scanner;

public class Exercicio16 {
	public static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Double[] numeros = new Double[2];
		double num, media, soma = 0;
		int i; 
		
		for(i = 0; i < numeros.length; i++) {
			System.out.println("Número " + (i+1));
			num = sc.nextDouble();
			
			numeros[i] = num;
			soma += numeros[i];
		}
		
		media = soma/ numeros.length;
		
		System.out.println("Média: " + media);
		
		
		System.out.println("\nNúmeros Acima da Média:");
		
		for(i = 0; i < numeros.length; i++) {
			if(numeros[i] > media) {
				System.out.println(numeros[i]);
			}
		}

	}
}