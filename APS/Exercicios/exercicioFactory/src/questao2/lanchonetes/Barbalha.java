package questao2.lanchonetes;

import questao2.Lanchonete;
import questao2.Sanduiche;
import questao2.sanduiches.SandubaBar;

public class Barbalha extends Lanchonete{

	@Override
	public Sanduiche createSandwich() {
		Sanduiche sand = new SandubaBar();
		sand.preparar();
		System.out.println("Sanduiche À Moda Barbalha Feito");
		return sand;
	}

	
}
