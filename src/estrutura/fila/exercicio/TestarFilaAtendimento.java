package estrutura.fila.exercicio;

public class TestarFilaAtendimento {
	public static void main(String[] args) {
		FilaAtendimento<Cliente> fila = new FilaAtendimento<>();
		
		fila.adicionarCliente(new Cliente("Marcos", FormaDePagamento.Pix));
		fila.adicionarCliente(new Cliente("Ana", FormaDePagamento.Dinheiro));
		fila.adicionarCliente(new Cliente("Maria", FormaDePagamento.Cartão_de_Credito));

		System.out.println("Atendendo cliente: " + fila.atenderCliente());
		System.out.println("Próximo cliente: " + fila.primeiroCliente());
		System.out.println("Atendendo cliente: " + fila.atenderCliente());
		System.out.println("Próximo cliente: " + fila.primeiroCliente());
		System.out.println("Atendendo cliente: " + fila.atenderCliente());
	}	
}
