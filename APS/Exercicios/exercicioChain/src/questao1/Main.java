package questao1;

public class Main {

	public static void main(String[] args) {

		Presidente presidente = new Presidente(null, "Presidente");
		Diretor diretor1 = new Diretor(presidente, "Diretor");
		Gerente gerente1 = new Gerente(diretor1, "Gerente");
		Supervisor supervisor1 = new Supervisor(gerente1, "Supervisor");
		
		supervisor1.processarCompra(new RequisicaoCompra(5000, "Kits de periféricos"));
		gerente1.processarCompra(new RequisicaoCompra(10000, "Mesas e cadeiras"));
		diretor1.processarCompra(new RequisicaoCompra(20000, "Impressoras"));
		presidente.processarCompra(new RequisicaoCompra(50000, "Computadores"));
		
		supervisor1.processarCompra(new RequisicaoCompra(100000, "Reforma"));
	}

}
