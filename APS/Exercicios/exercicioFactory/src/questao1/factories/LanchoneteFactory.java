package questao1.factories;

import questao1.Lanchonete;
import questao1.lanchonetes.*;

public class LanchoneteFactory {
	
	public Lanchonete createLanchonete(String tipo) {
		Lanchonete lanchonete = null;
		
		if (tipo.equals("Juazeiro")) {
			lanchonete = new Juazeiro();

		} else if (tipo.equals("Crato")) {
			lanchonete = new Crato();
			
		} else if (tipo.equals("Barbalha")) {
			lanchonete = new Barbalha();
		} 
		
		if (lanchonete != null) 
			System.out.println("Lanchonete do tipo \"" + tipo + "\" criada.");
		
		return lanchonete;
	}
}
