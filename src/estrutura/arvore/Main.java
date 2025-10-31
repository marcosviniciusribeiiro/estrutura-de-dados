package estrutura.arvore;

public class Main {
	public static void main(String[] args) {
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		arvore.raiz = arvore.inserir(arvore.raiz, 10);
		
		arvore.inserir(arvore.raiz, 5);
		arvore.inserir(arvore.raiz, 15);
		arvore.inserir(arvore.raiz, 2);
		arvore.inserir(arvore.raiz, 1);
		arvore.inserir(arvore.raiz, 7);
		arvore.inserir(arvore.raiz, 7);

		
		System.out.print("Travessia Em Ordem: ");
		arvore.emOrdem(arvore.raiz);
		System.out.println();
		
		System.out.println("Busca pelo 10: " + arvore.buscar(arvore.raiz, 10));
		System.out.println("Busca pelo 24: " + arvore.buscar(arvore.raiz, 24));		
	}
}
