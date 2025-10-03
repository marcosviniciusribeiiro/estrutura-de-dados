package estrutura.ordenacao_vetor;

import java.util.Arrays;

public class OrdenacaoPronta {
	public static void main(String[] args) {
		int[] vetor = {22,11,6, 66, 29, 5, 7};
		String[] nomes = {"João", "Carlos", "Ana", "Pedro", "Julia"};
		System.out.println("Vetor: " + Arrays.toString(vetor));
		Arrays.sort(vetor);
		Arrays.sort(nomes);
		System.out.println("Numeros ordenados: "+ Arrays.toString(vetor));
		System.out.println("Nomes ordenados: "+ Arrays.toString(nomes));
	}
}
