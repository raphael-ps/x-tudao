package questao2.sanduiches;

import questao2.Sanduiche;
import questao2.factories.JuaIngredientesFactory;

public class SandubaJua extends Sanduiche{
	public SandubaJua() {
		super(new JuaIngredientesFactory());
	}

}
