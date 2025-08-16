package estrutura.vetor;

import java.util.Scanner;

public class Exercicio03 {
	public static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Double[] notas = new Double[8];
		double soma = 0, media;
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Nota do " + (i+1) + "° Aluno: ");
			notas[i] = sc.nextDouble();
			soma += notas[i];
		}
		media = soma/(notas.length);
		
		System.out.println("Média da Turma: " + media);
	}

}

/*3 - Crie um vetor para ler e armazenar as notas de 8 alunos. Calcule e exiba a média das notas.*/
