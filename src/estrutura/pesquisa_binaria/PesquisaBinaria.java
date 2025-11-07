package estrutura.pesquisa_binaria;

public class PesquisaBinaria {
	public static int buscaBinaria(int[] vetor, int numProc) {
		int inicio = 0;
		int fim = vetor.length - 1;
		int meio;
		
		while(inicio <= fim) {
			meio = (inicio + fim) / 2;
			
			if(vetor[meio] == numProc) {
				return meio;
			} else if (vetor[meio] < numProc) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
			
		}
		return -1;
	}
}
