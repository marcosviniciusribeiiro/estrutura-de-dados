package estrutura.vetor;

import java.util.Scanner;

public class Exercicio03 {
	public static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Double[] notas = new Double[8];
		double nota, soma = 0, media;
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Nota do " + (i+1) + "° Aluno: ");
			nota = sc.nextDouble();
			
			notas[i] = nota;
			soma += nota;
		}
		media = soma/(notas.length);
		
		System.out.println("Média da Turma: " + media);
	}

}