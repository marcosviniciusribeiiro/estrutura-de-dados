package estrutura.matriz;

public class Exercicio05 {
	public static void main(String[] args) {
		int[][] mat = {{1,2,3},
		                  {4,5,6},
		                  {7,8,9}};
		
		int[][]matInversa = new int [3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matInversa[i][j] = mat[j][i];
			}
		}
		
		
		for(int[] linha : matInversa) {
			for(int elemento: linha) {
				System.out.print(elemento + " ");
			}
			System.out.println();
		}
	}
}
/*5 – Criar uma matriz 3x3 e atribua o seguintes números,  crie uma segunda matriz que inverta as linhas e colunas da primeira matriz*/