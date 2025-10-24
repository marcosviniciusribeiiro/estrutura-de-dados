package estrutura.funcao.recursiva;

public class FatorialRecursivo {

	public static void main(String[] args) {
		int num = 4;
		
		int fatorial = fatorial(num);
		
		System.out.println(num + "! = " + fatorial);
	}
	
	// fatorial utilizando a função recursiva	
	public static int fatorial(int num) {
		if(num == 0 || num == 1) {
			return 1;
		}
		return num *= fatorial(num-1);
	}
}
// 4! = 4 * 3 * 2 * 1
// 3! = 3 * 2 * 1
// 2! = 2 * 1
// 1! = 1