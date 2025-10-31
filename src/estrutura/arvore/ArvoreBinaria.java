package estrutura.arvore;

public class ArvoreBinaria {
	No raiz;
	
	public ArvoreBinaria () {
		raiz = null;
	}
	
	// Inserção de um Nó com função recursiva
	public No inserir(No raiz, int valor) {
		if (raiz == null) {
			raiz = new No(valor);
			return raiz;
		}
		if(valor < raiz.valor) {
			raiz.esquerda = inserir(raiz.esquerda, valor);
		}
		else if (valor > raiz.valor) {
			raiz.direita = inserir(raiz.direita, valor);
		}
		return raiz;
	}
	
	// Busca Recursiva
	public boolean buscar(No raiz, int valor) {
		if(raiz == null) 
			return false;
		
		if(raiz.valor == valor)
			return true;
		
		return valor < raiz.valor ? buscar(raiz.esquerda, valor) : buscar(raiz.direita, valor);
	}
	
	// Percurso em Ordem
	public void emOrdem(No raiz) {
		if(raiz != null) {
			emOrdem(raiz.esquerda);
			System.out.print(raiz.valor + " ");
			emOrdem(raiz.direita);
		}
	}
}