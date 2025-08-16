package estrutura.vetor;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio06 {
	public static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int[] numeros = new int[12];
		int maiorNum=0, menorNum = 1000000;
	
		for(int i = 0; i < numeros.length; i++) {
			System.out.println((i+1) + " número:");
			numeros[i] = sc.nextInt();
			
			
			if(numeros[i]> maiorNum) {
				maiorNum = numeros[i];
			}else if(numeros[i]< menorNum) { 
				menorNum = numeros[i];
			}
		}
		
		System.out.println(Arrays.toString(numeros));
				
		System.out.println("\nMaior Número: " + maiorNum);
		System.out.println("\nMenor Numero: " + menorNum);
	}
}

/*6 - Crie um vetor com 12 elementos inteiros. Encontre e exiba o maior e o menor valor presente no vetor.*/
