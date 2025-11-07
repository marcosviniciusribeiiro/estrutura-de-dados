package estrutura.pesquisa_binaria;

public class TestarPesquisaBinariaRecursiva {
	public static void main(String[] args) {
		int[] vetor = {1, 3,4,9,10, 12, 14,18,19, 22, 25,30, 32, 35};
		int numProcurado = 22;
		
		int resultado = PesquisaBinariaRecursiva.buscaBinaria(vetor, numProcurado, 0, vetor.length-1);
		
		if(resultado == -1) {
			System.out.println("Número não encontrado!");
		} else {
			System.out.println("Número " + numProcurado + " foi encontrado na posiçao: " + resultado);
		}
	}
}
 