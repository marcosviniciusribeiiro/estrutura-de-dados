package estrutura.matriz;

public class Exercicio07 {
	public static void main(String[] args) {
		int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
		int soma = 0;
		
		System.out.println("Matriz");
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
				if(i == j) {
					soma += mat[i][j];
				}
			}
			System.out.println();
		}
		
		System.out.println("\nSoma dos Valores da Diagonal Principal = " + soma);
	}
}
/*7 - Crie um algoritmo que declare e atribua e depois calcule a soma dos valores da diagonal principal de uma matriz 5x5. 
Ao final imprima a matriz e imprima o valor da variável soma*/