package estrutura.ordenacao_vetor;

import java.util.Arrays;

public class OrdenacaoPronta {
	public static void main(String[] args) {
		int[] vetor = {22,11,6, 66, 29, 5, 7};
		System.out.println("Vetor: " + Arrays.toString(vetor));
		Arrays.sort(vetor);
		System.out.println("Vetor ordenado: "+ Arrays.toString(vetor));
	}
}
