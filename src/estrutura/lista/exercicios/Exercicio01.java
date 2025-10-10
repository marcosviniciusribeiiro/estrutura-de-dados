package estrutura.lista.exercicios;

import java.util.ArrayList;

public class Exercicio01 {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("João");
		nomes.add("Maria");
		nomes.add("Arthur");
		nomes.add("Ana");
		nomes.add("Igor");
		
		for(String elemento : nomes) {
			System.out.print(elemento + " ");
		}
	}	
}