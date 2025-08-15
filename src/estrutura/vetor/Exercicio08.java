package estrutura.vetor;

import java.util.Random;
import java.util.Arrays;

public class Exercicio08 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] numerosSorteados = new int[20];
				
		
		for(int i = 0; i < numerosSorteados.length; i++) {
			numerosSorteados[i] = aleatorio.nextInt(101);
		}
		
		int[] tempUnicos = new int[20];
		int contadorUnicos = 0;
		
		for(int i = 0 ; i < numerosSorteados.length; i++) {
			int numeroAtual = numerosSorteados[i];
			boolean jaExiste = false;
			
			for(int j = 0; j < numerosSorteados.length; j++) {
				if(tempUnicos[j] == numeroAtual) {
					jaExiste = true;
					break;
				}
			}
			
			if(!jaExiste) {
				tempUnicos[contadorUnicos] = numeroAtual;
				contadorUnicos++;
			}
		}
		
		int[] numerosUnicos = new int[contadorUnicos];
		for(int i = 0; i < contadorUnicos; i++) {
			numerosUnicos[i] = tempUnicos[i]; 
		}
		
		System.out.println("Números Sorteados: " + Arrays.toString(numerosSorteados));
		System.out.println("Números Únicos: " + Arrays.toString(numerosUnicos));
		
	}
}