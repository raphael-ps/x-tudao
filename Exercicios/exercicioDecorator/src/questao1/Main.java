package questao1;

public class Main {

	public static void main(String[] args) {
		Bolo bLim = new BoloLimao();
		Bolo cMor = new CoberturaMorango(bLim);
		Bolo fAmo = new FrutaAmora(cMor);
		
		System.out.println("Total: " + bLim.calcularPreco() + '\n');
		System.out.println("Total: " + cMor.calcularPreco() + '\n');
		System.out.println("Total: " + fAmo.calcularPreco() + '\n');
	}

}
