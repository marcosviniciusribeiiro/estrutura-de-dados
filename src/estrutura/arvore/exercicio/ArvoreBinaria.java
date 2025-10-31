package estrutura.arvore.exercicio;

public class ArvoreBinaria {
	private No raiz;
	
	public ArvoreBinaria() {
		this.raiz = null;
	}
	
	// Inserir palavra na arvore binária
	public void inserir(String palavra) {
		raiz = inserirRec(raiz, palavra.toLowerCase());
	}
	
	private No inserirRec(No atual, String palavra) {
		if(atual == null) {
			return new No(palavra);
		}
		int comparacao = palavra.compareTo(atual.palavra);
		
		if(comparacao < 0) {
			atual.esquerda = inserirRec(atual.esquerda, palavra);
		} else if (comparacao > 0) {
			atual.direita = inserirRec(atual.direita, palavra);
		} else {
			// Não insere duplicatas
			System.out.println("A palavra \"" + palavra + "\" já existe na árvore binária.");
		}
		
		return atual;
	}
	
	// Buscar por uma palavra
	
	// Imprimir em ordem alfabética
}