package estrutura.lista.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe o Número " + (i+1));
			Integer numero = sc.nextInt();
			total += numero;
			lista.add(numero);
		}
		sc.close();
		
		System.out.println("Lista Numérica: " + lista);
		System.out.println("Soma Total: " + total);
	}
}