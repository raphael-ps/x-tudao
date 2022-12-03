package questao1;

public abstract class Lanchonete {

	public Sanduiche orderSandwich() {
		Sanduiche sanduiche = createSandwich();
		sanduiche.preparar();
		
		return sanduiche;
	}
	
	public abstract Sanduiche createSandwich();
	
}	
