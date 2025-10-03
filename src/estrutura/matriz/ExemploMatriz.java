package estrutura.matriz;

public class ExemploMatriz {
	public static void main(String[] args) {
		String[][][] nomes = new String[5][3][2];
		
		for(int i = 0; i < nomes.length; i++) {
			for(int j = 0; j < nomes[i].length; j++) {
				for(int k = 0; k < 2; k++) {
					if(nomes[i][j][k] == null & k == 0) {
						nomes[i][j][k] = " * ";
					}else {
						nomes[i][j][k] = " # ";
					}
				}
			}
		}
		nomes[0][1][0] = "João";
		nomes[1][2][0] = "Maria";
		nomes[3][0][0] = "Ana";
		
		imprimirMatriz(nomes);

	}
	private static void imprimirMatriz(String[][][] matriz) {
		for(int k = 0; k < 2; k++) {
			System.out.printf("-- Dimensão %d --\n", (k + 1));
			for(int i = 0; i < matriz.length; i++) {
				for(int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j][k] + " ");
				}
				System.out.println();
			}
		}
	}
}
