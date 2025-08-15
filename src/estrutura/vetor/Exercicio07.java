package estrutura.vetor;

public class Exercicio07 {
	public static void main(String[] args) {
		int[] v1 = {1, 3, 5, 7, 9};
		int[] v2 = {2, 4, 6, 8, 10};

		int[] v3 = new int[10];
		
		int c = 0;
		
		for(int i = 0; i < v1.length; i++) {
			v3[c] = v1[i];
			c++;
			v3[c] = v2[i];
			c++;
		}
		
		for(int i = 0; i < v3.length; i++) {
			System.out.println(v3[i]);
		}
	}
}
