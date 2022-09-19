package questao1;

public class Diretor extends Gestor {
	
	public Diretor(Gestor sucessor, String cargo) {
		super(sucessor, 20000.00, cargo);
	}

}
