package questao2;

import questao2.factories.*;


public class Main2 {
	public static void main(String[] args) {
		LanchoneteFactory lf = new LanchoneteFactory();
		
		Lanchonete jua = lf.createLanchonete("Juazeiro");
		System.out.println("----------------------------");
		Lanchonete cra = lf.createLanchonete("Crato");
		System.out.println("----------------------------");
		Lanchonete bar = lf.createLanchonete("Barbalha");
		System.out.println("----------------------------");
		
		jua.orderSandwich();
		System.out.println("----------------------------");
		bar.orderSandwich();
		System.out.println("----------------------------");
		cra.orderSandwich();
		
	}
	
}
