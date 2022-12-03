package questao1.lanchonetes;

import questao1.Lanchonete;
import questao1.Sanduiche;
import questao1.sanduiches.SandubaCra;

public class Crato extends Lanchonete{

	@Override
	public Sanduiche createSandwich() {
		return new SandubaCra();
	}


}
