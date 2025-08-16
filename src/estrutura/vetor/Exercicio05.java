package estrutura.vetor;
import java.util.Scanner;
public class Exercicio05 {
	public static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int[] num = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			System.out.println((i+1) + "° Número:");
			num[i] = sc.nextInt();
		}
		
		for(int i = 9; i >= 0; i--) {
			System.out.println(num[i]);
		}
	}
}

/*5 - Leia 10 números e armazene-os em um vetor. Mostre os elementos na ordem inversa à de inserção.*/
