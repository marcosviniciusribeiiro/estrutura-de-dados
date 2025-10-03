package estrutura.pilha;

import java.util.Stack;

public class Exemplo {

	public static void main(String[] args) {
		Stack<Integer> p1 = new Stack<>();
		p1.push(40);
		p1.push(30);
		p1.push(25);
		p1.push(10);
		
		Stack<Integer> p2 = new Stack<>();
		p2.push(34);
		p2.push(60);
		p2.push(28);
		p2.push(15);
		
		Stack<Integer> p3 = new Stack<>();
		
		p3.push(20);
		p3.push(35);
		
		Stack<Integer> a1 = new Stack<>();
		
		
		while(!p1.isEmpty() & !p2.isEmpty()) {
			a1.push(p1.pop());
			a1.push(p2.pop());
		}
		
		while(!p3.isEmpty()) {
			a1.push(p3.pop());
		}
		
		Stack<Integer> a2 = new Stack<>();
		
		while(!a1.isEmpty()) {
			a2.push(a1.pop());			
		}
		
		for(int i = 0; i < 4; i++) {
			System.out.print(a2.pop() + " ");
		}
	}

}
