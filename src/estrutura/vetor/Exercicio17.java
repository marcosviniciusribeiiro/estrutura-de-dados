package estrutura.vetor;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio17 {
	public static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int[] numeros = new int[15];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Número " + (i+1));
			numeros[i] = sc.nextInt();
			
			if(numeros[i] < 0) {
				numeros[i] = 0;
			}
		}
				
		System.out.println(Arrays.toString(numeros));	
	}
}