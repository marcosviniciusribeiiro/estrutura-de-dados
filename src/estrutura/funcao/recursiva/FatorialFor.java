package estrutura.funcao.recursiva;

public class FatorialFor {
	
	public static void main(String[] args) {
		int num = 8;
		
		int fatorial = calcularFatorial(num);
		
		System.out.println(num + "! = " + fatorial);
	}
	
	// fatorial sem utilizar a função recursiva
	public static int calcularFatorial(int num) {
		int resultado = 1;
		for(int i = num; i > 0; i--) {
			resultado *= i;
		}
		return resultado;
	}
}