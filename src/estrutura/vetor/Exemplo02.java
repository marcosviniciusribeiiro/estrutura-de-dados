package estrutura.vetor;

public class Exemplo02 {
	public static void main(String[] args) {
		// declaração e inicialização do vetor
		String[] lista = {"Ana", "Bia", "Dani", "Lu"};;
		
		// usar o for each para imprimir todos os elementos da lista
		for(String nome : lista) {
			System.out.println(nome);
		}
		
		lista[2] = "Fernanda";
		
		for(String nome : lista) {
			System.out.println(nome);
		}
	}
}
