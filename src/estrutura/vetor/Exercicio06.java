package estrutura.vetor;
import java.util.Scanner;
public class Exercicio06 {
	public static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		//declarando as variaveis e iniciando o vetor
		int[] numeros = new int[3];
		int i, n, maiorNum=0, menorNum = 1000000;
	
		//for para inserir os vetores
		for(i = 0; i < numeros.length; i++) {
			System.out.println((i+1) + " número:");
			n = sc.nextInt();
			numeros[i] = n;
			
			//if e else para definir o maior e o menor número
			if(n> maiorNum) {
				maiorNum = n;
			}else if(n< menorNum) { 
				menorNum = n;
			}
		}
		
		for(i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
				
		System.out.println("\nMaior Número: " + maiorNum);
		System.out.println("\nMenor Numero: " + menorNum);
	}
}