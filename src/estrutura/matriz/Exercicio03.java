package estrutura.matriz;

public class Exercicio03 {
	public static void main(String[] args) {
		int[][] mat = {{1,2,3},
				       {4,5,6},
				       {7,8,9}};
		
		int c0 = 0, c1 = 0, c2= 0;
		
		for(int i =0; i < mat.length; i++) {
			c0 = c0 + mat[i][0];
			c1 = c1 + mat[i][1];
			c2 = c2 + mat[i][2];
		}
		
		System.out.println("Matriz");
		for(int[] linha : mat) {
			for(int elemento : linha) {
				System.out.print(elemento + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nColuna 1 = " + c0 + ", Coluna 2 = " + c1 + ", Coluna 3 = " + c2);
	}
}
/*3 - Crie um algoritmo que atribua os seguintes números numa matriz 3x3 e calcule a soma dos valores das colunas da matriz. 
 * Ao final imprima a matriz completa e também a soma de cada coluna */