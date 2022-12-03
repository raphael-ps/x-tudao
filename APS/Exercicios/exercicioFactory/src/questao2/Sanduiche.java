package questao2;

import questao2.factories.SanduicheIngredientesFactory;
import questao2.ingredientes.*;


public abstract class Sanduiche {
	protected Pao pao;
	protected Queijo queijo;
	protected Presunto presunto;
	protected Salada salada;
	protected SanduicheIngredientesFactory sandubaIngredientesFactory;
	
	public Sanduiche(SanduicheIngredientesFactory sandubaIngredientesFactory) {
		this.sandubaIngredientesFactory = sandubaIngredientesFactory;
	}

	public void preparar() {
		pao = sandubaIngredientesFactory.createPao();
		queijo = sandubaIngredientesFactory.createQueijo();
		presunto = sandubaIngredientesFactory.createPresunto();
		salada = sandubaIngredientesFactory.createSalada();
	}
}
