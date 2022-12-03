package questao2.factories;

import questao2.Lanchonete;
import questao2.lanchonetes.*;

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
