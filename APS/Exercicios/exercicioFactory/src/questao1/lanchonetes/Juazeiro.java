package questao1.lanchonetes;

import questao1.Lanchonete;
import questao1.Sanduiche;
import questao1.sanduiches.SandubaJua;

public class Juazeiro extends Lanchonete{

	@Override
	public Sanduiche createSandwich() {
		return new SandubaJua();
	}

	
}
