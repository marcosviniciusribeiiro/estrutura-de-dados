package estrutura.fila.exercicio;

public class Cliente {
	private String nome;
	private  FormaDePagamento tipoPagamento;
	private int tempo;
	
	public Cliente(String nome, FormaDePagamento tipoPagamento) {
		this.nome = nome;
		this.tipoPagamento = tipoPagamento;
		if (tipoPagamento.equals(FormaDePagamento.Pix)){
			tempo = 1;
		} else if (tipoPagamento.equals(FormaDePagamento.Dinheiro)) {
			tempo = 2;
		} else if (tipoPagamento.equals(FormaDePagamento.Vale_Alimentacao)) {
			tempo = 3;
		} else if (tipoPagamento.equals(FormaDePagamento.Cartão_de_Credito)) {
			tempo = 5;
		}
	}

	@Override
	public String toString() {
		return nome + "\nForma de Pagamento: " + tipoPagamento + "\nTempo de Atendimento: " + tempo + " min.\n";
	}
	
	
}
