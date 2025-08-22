package estrutura.matriz;

import java.util.Scanner;

public class Exemplo02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j< matriz[i].length;j++) {
				System.out.println("Digite um número:");
				matriz[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
