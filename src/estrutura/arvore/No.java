package estrutura.arvore;

public class No {
	int valor;
	No esquerda, direita;
	
	public No (int valor) {
		this.valor = valor;
		esquerda = null;
		direita = null;
	}
}