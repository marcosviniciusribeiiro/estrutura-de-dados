package estrutura.vetor;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio12 {
	public static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int[] numeros = new int[10];
		int cont=0, num;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Numero " + (i+1) + ":");
			numeros[i] = sc.nextInt();
		}
		
		// Selecionando um numero para tirar do vetor
		System.out.println("Digite um número para removê-lo:");
		num = sc.nextInt();
		
		for(int numero : numeros) {
			if(numero == num) {
				cont++;
			}
		}
		
		int[] novoVetor = new int[numeros.length - cont];
		
		
		if(cont>0) {
			int j = 0;
			for(int i = 0; i < numeros.length ; i++) {
				if(numeros[i] != num) {
					novoVetor[j] = numeros[i];
					j++;
				}
			}
			System.out.println("Novo vetor : " + Arrays.toString(novoVetor));
		} else {
			System.out.println("Número não encontrado. O array permanece o mesmo.");
			System.out.println("Vetor original : " + Arrays.toString(numeros));
		}
		
		
		
		
	}
}
