package estrutura.vetor;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio11 {
	public static Scanner sc;
	public static void main(String[] args) {
		Random aleatorio = new Random();
		sc = new Scanner(System.in);
		
		int[] numerosSorteador = new int[30];
		
		for(int i = 0; i < numerosSorteador.length; i++) {
			numerosSorteador[i] = aleatorio.nextInt(100) + 1;
		}
		
		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		
		boolean num = false;
		
		for(int i = 0; i < numerosSorteador.length; i++) {
			if(numerosSorteador[i] == numero) {
				num = true;
				System.out.println("Número na Posição " + i);
				break;
			}

		}
		if(num == false) {
			System.out.println("Numero não encontrado.");				
		}
		System.out.println(Arrays.toString(numerosSorteador));
		
	}
}
