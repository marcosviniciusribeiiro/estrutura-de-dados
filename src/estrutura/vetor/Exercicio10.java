package estrutura.vetor;

import java.util.Random;
import java.util.Arrays;

public class Exercicio10 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] numSorteado = new int[15];
		int[] numImpar =  new int[15];
		int[] numPar =  new int[15];
		
		int idxPar = 0, idxImpar = 0;
		
		for(int i = 0; i < numSorteado.length; i++) {
			numSorteado[i] = aleatorio.nextInt(101);
			int numAtual = numSorteado[i];
			
			if(numAtual % 2 == 0) {
				numPar[idxPar] = numAtual;
				idxPar++;
			}else {
				numImpar[idxImpar] = numAtual;
				idxImpar++;
			}
		}
		System.out.println("Números Sorteados: " + Arrays.toString(numSorteado));
		
		System.out.print("Números Par: ");
		for(int i = 0; i < idxPar; i++) {
			System.out.print(numPar[i] + " ");
		}
		
		System.out.print("\nNúmeros Impar: ");
		for(int i = 0; i < idxImpar; i++) {
			System.out.print(numImpar[i] + " ");
		}
	}
}
