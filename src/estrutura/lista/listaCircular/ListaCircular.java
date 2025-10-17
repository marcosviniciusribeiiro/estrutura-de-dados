package estrutura.lista.listaCircular;

public class ListaCircular {
	private No primeiro;
	
	public ListaCircular() {
		this.primeiro = null;
	}
	
	public void adicionar(int valor) {
		No novoNo = new No(valor);
		
		if(primeiro == null) {
			novoNo.proximo = novoNo;
			primeiro = novoNo;
		}else {
			novoNo.proximo = primeiro.proximo;
			primeiro.proximo = novoNo;
			primeiro = novoNo;
		}
	}
	
	public void remover(int valor) {
		if(primeiro == null) {
			return;
		}
		No atual = primeiro;
		
		while(atual.proximo.valor != valor) {
			if(atual.proximo.valor == valor) {
				atual.proximo = atual.proximo.proximo;
				break;
			}
			atual = atual.proximo;
		}
		if(primeiro.valor == valor) {
			primeiro = atual;
		}
	}
	
	public void imprimir() {
		if(primeiro == null) {
			System.out.println("Lista Circular Vazia!");
			return;
		}
		
		No atual = primeiro.proximo;
		
		System.out.print(primeiro.valor + " -> ");
		
		while(atual != primeiro) {
			System.out.print(atual.valor + " -> ");
			atual = atual.proximo;
		}
		System.out.println();
	}
}
