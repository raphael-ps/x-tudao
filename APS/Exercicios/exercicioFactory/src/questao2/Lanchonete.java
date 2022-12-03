package questao2;

public abstract class Lanchonete {

	public Sanduiche orderSandwich() {
		System.out.println("Pedido de Sanduiche sendo processado...");
		Sanduiche sanduiche = createSandwich();

		return sanduiche;
	}
	
	public abstract Sanduiche createSandwich();
	
}	
