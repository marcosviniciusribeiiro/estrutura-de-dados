package estrutura.ordenacao_vetor;

public class OrdenacaoSimples {
	public static void main(String[] args) {
		int n1 = 12, n2 = 5, n3 = 1, temp;
		
		if(n1 > n2) {
			temp = n1;
			n1 = n2;
			n2 = temp;
		}
		if(n2 > n3) {
			temp = n2;
			n2 = n3;
			n3 = temp;
		}
		if(n1 > n2) {
			temp = n1;
			n1 = n2;
			n2 = temp;
		}
		System.out.println("Ordem crescente: " + n1 + ',' + n2 + ',' + n3);
	}
}
