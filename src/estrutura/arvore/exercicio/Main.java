package estrutura.arvore.exercicio;

public class Main {
	public static void main(String[] args) {
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		// inserindo as palavras
		arvore.inserir("Banana");
		arvore.inserir("Maçã");
		arvore.inserir("Laranja");
		arvore.inserir("Abacate");
		arvore.inserir("Abacaxi");
		arvore.inserir("Uva");
		
		// impressão em ordem
		arvore.imprimirEmOrdem();
		
		// buscando palavras
		String busca1 = "uva";
		String busca2 = "melão";
		
		System.out.println("\nBusca por \"" + busca1 + "\": " + (arvore.buscar(busca1) ? "Encontrada" : "Não encontrada"));
		
		System.out.println("\nBusca por \"" + busca2 + "\": " + (arvore.buscar(busca2) ? "Encontrada" : "Não encontrada"));
	}
}
