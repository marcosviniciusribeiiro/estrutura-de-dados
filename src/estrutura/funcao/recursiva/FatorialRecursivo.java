package estrutura.funcao.recursiva;

public class FatorialRecursivo {

	public static void main(String[] args) {
		int num = 3;
		
		int fatorial = fatorial(num);
		
		System.out.println(num + "! = " + fatorial);
	}
	
	// fatorial utilizando a função recursiva	
	public static int fatorial(int num) {
		if(num == 0 | num == 1) {
			return 1;
		}
		return num *= fatorial(num-1);
	}
}