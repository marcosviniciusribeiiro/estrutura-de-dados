package estrutura.vetor;

public class Exemplo03 {
	public static void main(String[] args) {
		int[] num = new int[10];
		int i = 0;
		while (i<num.length) {
			num[i] = i;
			System.out.println(num[i]);
			i++;
		}
		//imprimindo do ultimo até o primeiro numero
		i = 9;
		while(i>=0) {
			System.out.println(num[i]);
			i--;
		}
	}
}
