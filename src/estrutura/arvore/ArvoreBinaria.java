package estrutura.arvore;

public class ArvoreBinaria {
	No raiz;
	
	public ArvoreBinaria () {
		this.raiz = null;
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
}
