package questao2.factories;

import questao2.ingredientes.*;

public interface SanduicheIngredientesFactory {
	public Salada createSalada();
	public Pao createPao();
	public Presunto createPresunto();
	public Queijo createQueijo();
}
