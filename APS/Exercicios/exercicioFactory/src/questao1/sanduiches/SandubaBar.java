package questao1.sanduiches;

import questao1.Sanduiche;
import questao1.ingredientes.*;


public class SandubaBar extends Sanduiche{

	public SandubaBar() {
		this.pao = new PBola();
		this.queijo = new QCheddar();
		this.presunto = new PRPeru();
		this.salada = new SSemVerdura();
		
		System.out.println("Sanduiche À Moda Barbalha Feito");
	}
	
}
