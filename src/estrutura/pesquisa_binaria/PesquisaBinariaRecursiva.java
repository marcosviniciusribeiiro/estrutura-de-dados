package estrutura.pesquisa_binaria;

public class PesquisaBinariaRecursiva {
	public static int buscaBinaria(int[] vet, int num, int inicio, int fim) {
		if (inicio > fim) {
			return -1;
		}
		
		int meio = (inicio + fim) / 2;
		
		if(vet[meio] == num) {
			return meio;
		} else if (vet[meio] < num) {
			return buscaBinaria(vet, num, meio + 1, fim);
		} else {
			return buscaBinaria(vet, num, inicio, meio - 1);
		}
	}
}
