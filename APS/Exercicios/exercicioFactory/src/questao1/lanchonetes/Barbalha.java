package questao1.lanchonetes;

import questao1.Lanchonete;
import questao1.Sanduiche;
import questao1.sanduiches.SandubaBar;


public class Barbalha extends Lanchonete{

	@Override
	public Sanduiche createSandwich() {
		
		return new SandubaBar();
	}

	
}
