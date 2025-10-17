package estrutura.atividade_integrada.fila;

public class TestarFilaDePedidos {
	public static void main(String[] args) {
		FilaDePedidos<String> fila = new FilaDePedidos<>();
		fila.adicionar("Pedido 1");
		fila.adicionar("Pedido 2");
		fila.adicionar("Pedido 3");
		fila.adicionar("Pedido 4");
		fila.adicionar("Pedido 5");
		
		fila.imprimir();
	}
}
