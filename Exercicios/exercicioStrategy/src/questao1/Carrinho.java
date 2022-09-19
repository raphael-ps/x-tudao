package questao1;

import questao1.frete.*;

public class Carrinho {
	// Imagine uma lista de itens aqui.
	private FreteStrategy frete;
	
	public Carrinho() {
		this.frete = new SedexStrategy();
		// Tipo de entrega padr�o � o Sedex.
	}

	public FreteStrategy getFrete() {
		return frete;
	}

	public void setFrete(FreteStrategy frete) {
		this.frete = frete;
	}
	
}
