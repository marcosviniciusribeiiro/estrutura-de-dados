package estrutura.lista.listadupla;

public class No {
	public int valor;
	public No anterior;
	public No proximo;
	
	public No(int valor) {
		this.valor = valor;
		this.anterior = null;
		this.proximo = null;
	}
}
