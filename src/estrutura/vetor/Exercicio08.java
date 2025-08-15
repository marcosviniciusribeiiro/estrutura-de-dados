package estrutura.vetor;
import java.util.Random;
public class Exercicio08 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		int i, resultado;
		int[] numerosSorteados = new int[20];
		
		for(i = 0; i<20; i++) {
			resultado = aleatorio.nextInt(101);
			numerosSorteados[i] = resultado;
		}
		
		
	}
}

/*
8 - Sortear 20 números entre 0 e 100 e armazene-os em um vetor. 
Em seguida, crie um novo vetor que contenha apenas os números únicos (não repetidos) do vetor original.
*/
