package questao2;

public class Main {

	public static void main(String[] args) {
		Viagem vCru = new Cruzeiro();
		Viagem pBeb = new Bebida(vCru);
		Viagem pPas = new PasseioExtra(pBeb);
		
		System.out.println("Total: R$ " + vCru.calcularPreco() + "\n");
		System.out.println("Total: R$ " + pBeb.calcularPreco() + "\n");
		System.out.println("Total: R$ " + pPas.calcularPreco() + "\n");
	}

}
