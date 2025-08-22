package estrutura.matriz;

public class Exercicio12 {
	public static void main(String[] args) {
		
		int[][] m = new int[10][10];

		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				m[i][j] = i + j;
			}
		}

		for(int[] linha : m) {
			for(int elemento : linha) {
				System.out.print(elemento + " ");
			}
			System.out.println();
		}
	}
}
/*12 – Declare uma matriz de 10x10 e atribua a cada posição da matriz a soma das posições de linha e coluna. 
 * Ao final imprima toda a matriz.*/