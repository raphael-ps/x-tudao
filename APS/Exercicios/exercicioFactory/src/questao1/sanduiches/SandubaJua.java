package questao1.sanduiches;

import questao1.Sanduiche;
import questao1.ingredientes.*;

public class SandubaJua extends Sanduiche{
	public SandubaJua() {
		this.pao = new PIntegral();
		this.queijo = new QPrato();
		this.presunto = new PRFrango();
		this.salada = new SSemVerdura();
		
		System.out.println("Sanduiche À Moda Juazeiro Feito");
	}

}
