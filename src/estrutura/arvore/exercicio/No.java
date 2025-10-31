package estrutura.arvore.exercicio;

public class No {
	String palavra;
	No esquerda, direita;
	
	public No(String palavra) {
		this.palavra = palavra;
		esquerda = null;
		direita = null;
	}
}
