package estrutura.matriz;

public class Exemplo01 {

	public static void main(String[] args) {
		// declarado e inicializando uma matriz 2x2
		int[][] m = {{1,2}, {3, 4, 9}, {5, 6, 7, 8}}; 
		
		System.out.println("Imprimindo a matriz com um For Tradicional");
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Imprimindo a matriz com For Each");
		
		for (int[] linha : m) {
			for(int elemento:linha) {
				System.out.print(elemento + " ");
			}
			System.out.println();
		}
	}
}
