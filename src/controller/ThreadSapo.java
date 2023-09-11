package controller;

public class ThreadSapo extends Thread{

	private int nSapo;
	
	public ThreadSapo(int nSapo) {
		this.nSapo = nSapo;
	}
	
	@Override
	public void run() {
		largada();
	}

	private void largada() {
		int posicao = 0;
		int chegada = 15;
		while (posicao < chegada) {
			int salto = (int)(Math.random()*5);//Tamanho do salto
			System.out.println("O sapo "+nSapo+" deu um salto de "+salto+" metros!");
			
			posicao += salto;//Total percorrido 
			
			//Verifica a posicao do sapo
			if (posicao >= chegada) {
				System.out.println("O sapo "+nSapo+" ultrapssou a linha de chegada!!");
			} else {
				System.out.println("O sapo "+nSapo+" percorreu no total: "+posicao+" metros");
			}
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}
