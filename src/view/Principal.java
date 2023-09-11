package view;

import controller.ThreadSapo;

public class Principal {

	public static void main(String[] args) {
		int colocacao = 0;
		
		for (int i = 1; i <= 5; i++) {
			Thread pular = new ThreadSapo(i);
			pular.start();
		}
//		System.out.println("1º colocado - ");
		
	}

}
