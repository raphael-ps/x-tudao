package questao2.sanduiches;

import questao2.Sanduiche;
import questao2.factories.CraIngredientesFactory;

public class SandubaCra extends Sanduiche{
	public SandubaCra() {
		super(new CraIngredientesFactory());
	}
}
