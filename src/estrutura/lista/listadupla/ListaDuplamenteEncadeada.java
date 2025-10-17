package estrutura.lista.listaDupla;

public class ListaDuplamenteEncadeada {
	private No primeiro;
	private No ultimo;
	
	public ListaDuplamenteEncadeada() {
		this.primeiro = null;
		this.ultimo = null;
	}
	
	public void adicionar(int valor) {
		No novoNo = new No(valor);
		
		if(primeiro == null) {
			primeiro = novoNo;
			ultimo = novoNo;
		}else {
			ultimo.proximo = novoNo;
			novoNo.anterior = ultimo;
			ultimo = novoNo;
		}
	}
	
	public void imprimir() {
		No atual = primeiro;
		
		while(atual != null) {
			System.out.print(atual.valor + " ");
			atual = atual.proximo;
		}
	}
}
