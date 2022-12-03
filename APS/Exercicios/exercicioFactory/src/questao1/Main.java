package questao1;

import questao1.factories.*;


public class Main {
	public static void main(String[] args) {
		LanchoneteFactory lf = new LanchoneteFactory();
		
		Lanchonete jua = lf.createLanchonete("Juazeiro");
		Lanchonete cra = lf.createLanchonete("Crato");
		Lanchonete bar = lf.createLanchonete("Barbalha");
		
		jua.orderSandwich();
		bar.orderSandwich();
		cra.orderSandwich();
		
	}
	
}
