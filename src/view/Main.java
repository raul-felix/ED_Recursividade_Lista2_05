package view;

import controller.mdcController;

public class Main {
	
	public static void main(String[] args) {
		
		mdcController mdcController = new mdcController();
		
		int x = 20;
		int y = 24;
		
		int resultado = mdcController.mdcRecursiva(x, y);
		
		System.out.println(String.format("O MDC de %d e %d é: %d", x, y, resultado));
	}

}
