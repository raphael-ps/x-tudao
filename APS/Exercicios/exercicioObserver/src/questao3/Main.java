package questao3;

public class Main {

	public static void main(String[] args) {
		ConcreteCampoTexto campoTexto = new ConcreteCampoTexto();
		Observer rotulo1 = new ConcreteRotulo1(null);
		Observer rotulo2 = new ConcreteRotulo2(null);
		Observer rotulo3 = new ConcreteRotulo3(null);
		
		campoTexto.adicionarObserver(rotulo1);
		campoTexto.adicionarObserver(rotulo2);
		campoTexto.adicionarObserver(rotulo3);
		
		campoTexto.atualizarTexto("O sabiá    sabia    o sabiá sabia assobiar.");
	}

}
