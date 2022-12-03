package questao1.sanduiches;

import questao1.Sanduiche;
import questao1.ingredientes.*;

public class SandubaCra extends Sanduiche{
	public SandubaCra() {
		this.pao = new PFrances();
		this.queijo = new QMussarela();
		this.presunto = new PRFrango();
		this.salada = new SComVerdura();
		
		System.out.println("Sanduiche À Moda Crato Feito");
	}
}
