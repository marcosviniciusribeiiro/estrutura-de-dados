package estrutura.fila.exercicio;

public class TestarFilaAtendimento {
	public static void main(String[] args) {
		FilaAtendimento<Cliente> fila = new FilaAtendimento<>();
		fila.adicionarCliente(new Cliente("Marcos", FormaDePagamento.Pix));
		fila.adicionarCliente(new Cliente("Ana", FormaDePagamento.Dinheiro));
		

		System.out.println("Atendendo cliente: " + fila.atenderCliente());
		System.out.println("Atendendo cliente: " + fila.atenderCliente());
	}	
}
