package questao1;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Carrinho carrinho = new Carrinho();
		
		List<TipoDeFrete> tipoDeFrete = Arrays.asList(TipoDeFrete.values());
		
		double distanciaDestinoKm = 1500;
		
		for (TipoDeFrete tipoFrete : tipoDeFrete) {
			FreteStrategy frete = tipoFrete.getTipoDeFrete();
			carrinho.setFrete(frete);
			
			System.out.printf("O tipo de frete escolhido foi %s.\n"
				+ "Assim, o valor do seu frete é de R$ %.2f\n\n", tipoFrete, carrinho.getFrete().calcularFrete(distanciaDestinoKm));
		}
	}
}
