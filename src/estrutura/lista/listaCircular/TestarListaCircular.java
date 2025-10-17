package estrutura.lista.listaCircular;

public class TestarListaCircular {
	public static void main(String[] args) {
		ListaCircular lista = new ListaCircular();
		lista.adicionar(10);
		lista.adicionar(20);
		lista.adicionar(30);
		lista.adicionar(40);
		lista.adicionar(50);
		
		System.out.println("Lista Circular:");
		lista.imprimir();
		
		lista.remover(10);
		
		System.out.println("Lista após remover um item:");
		lista.imprimir();
	}
}
