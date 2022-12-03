package questao1;

import questao1.ingredientes.*;


public abstract class Sanduiche {
	protected Pao pao;
	protected Queijo queijo;
	protected Presunto presunto;
	protected Salada salada;
	
	public void preparar() {
		System.out.println("Preparando sanduiche...");
	}
}
