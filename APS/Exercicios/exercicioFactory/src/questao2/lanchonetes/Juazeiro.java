package questao2.lanchonetes;

import questao2.Lanchonete;
import questao2.Sanduiche;
import questao2.sanduiches.SandubaJua;

public class Juazeiro extends Lanchonete{

	@Override
	public Sanduiche createSandwich() {
		Sanduiche sand = new SandubaJua();
		sand.preparar();
		System.out.println("Sanduiche À Moda Juazeiro Feito");
		return sand;
	}

	
}
