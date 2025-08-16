package estrutura.vetor;

import java.util.Scanner;

public class Exercicio16 {
	public static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Double[] numeros = new Double[10];
		double media, soma = 0; 
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Número " + (i+1) + ":");
			numeros[i] = sc.nextDouble();
			
			soma += numeros[i];
		}
		
		media = soma/ numeros.length;
		
		System.out.println("Média: " + media);
		
		
		System.out.println("\nNúmeros Acima da Média:");
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] > media) {
				System.out.println(numeros[i]);
			}
		}

	}
}

/*16 - Leia 10 números e armazene-os em um vetor. Calcule a média dos valores e exiba os elementos que estão acima da média.*/
