package estrutura.pesquisa_binaria;

public class TestarBuscaBinaria {
	public static void main(String[] args) {
		int[] vetor = {4, 6, 9, 12, 15, 18, 21, 26, 30, 31, 33, 40};
		int numProcurado = 35;
		
		int resultado = PesquisaBinaria.buscaBinaria(vetor, numProcurado);
		
		if (resultado == -1) {
			System.out.println("O número " + numProcurado + " não foi encontrado no vetor");
		} else {
			System.out.println("O número " + numProcurado + " foi encontrado na posição " + resultado);
		}
	}
}
