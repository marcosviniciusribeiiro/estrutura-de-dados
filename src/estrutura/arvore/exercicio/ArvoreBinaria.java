package estrutura.arvore.exercicio;

public class ArvoreBinaria {
	private No raiz;
	
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
	public boolean buscar(String palavra) {
		return buscarRec(raiz, palavra.toLowerCase());
	}
	
	private boolean buscarRec(No atual, String palavra) {
		if(atual == null) {
			return false;
		}
		
		int comparacao = palavra.compareTo(atual.palavra);
		
		if(comparacao == 0) {
			return true;
		} else if (comparacao < 0) {
			return buscarRec(atual.esquerda, palavra);
		} else {
			return buscarRec(atual.direita, palavra);
		}
	}
	
	// Imprimir em ordem alfabética
	public void imprimirEmOrdem() {
		System.out.println("\nPalavras em ordem alfabética:");
		imprimirEmOrdemRec(raiz);
		System.out.println();
	}

	private void imprimirEmOrdemRec(No atual) {
		if(atual != null) {
			imprimirEmOrdemRec(atual.esquerda);
			System.out.print(atual.palavra + " ");
			imprimirEmOrdemRec(atual.direita);
		}
	}
}