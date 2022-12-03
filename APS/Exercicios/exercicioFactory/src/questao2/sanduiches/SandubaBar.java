package questao2.sanduiches;

import questao2.Sanduiche;
import questao2.factories.BarIngredientesFactory;

public class SandubaBar extends Sanduiche{

	public SandubaBar() {
		super(new BarIngredientesFactory());
	}
	
}
