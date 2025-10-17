package estrutura.atividade_integrada;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		FilaDePedidos<String> filaPedidos = new FilaDePedidos<>();
		LinkedList<String> pedidosAtivos = new LinkedList<String>();

		for(int i = 1; i <= 5; i++) {
			filaPedidos.adicionar("Pedido " + i);			
			pedidosAtivos.add("Pedido " + i);
		}
		
		
		Stack<String>acoesChef = new Stack<String>();
		acoesChef.push("Preparar Pedido 1");
		acoesChef.push("Preparar Pedido 2");
		acoesChef.push("Preparar Pedido 3");
		
		for(int i = 0; i < 2; i++) {
			filaPedidos.remover();
			pedidosAtivos.removeFirst();
		}

		pedidosAtivos.remove(1);
		
		System.out.println("Ações do Chef: \n" + acoesChef);
		
		System.out.println("\nPedidos:");
		filaPedidos.imprimir();
		
		imprimir(pedidosAtivos);
		
	}
	
	public static void imprimir(LinkedList<String> pedidos) {
		System.out.println("\nPedidos Ativos:");
		for(String pedido : pedidos) {
			System.out.print(pedido + " ");
		}
		System.out.println("\n");
	}
}