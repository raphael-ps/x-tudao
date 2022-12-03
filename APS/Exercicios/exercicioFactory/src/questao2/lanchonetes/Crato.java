package questao2.lanchonetes;

import questao2.Lanchonete;
import questao2.Sanduiche;
import questao2.sanduiches.SandubaCra;

public class Crato extends Lanchonete{

	@Override
	public Sanduiche createSandwich() {
		Sanduiche sand = new SandubaCra();
		sand.preparar();
		System.out.println("Sanduiche À Moda Crato Feito");
		return sand;
	}


}
