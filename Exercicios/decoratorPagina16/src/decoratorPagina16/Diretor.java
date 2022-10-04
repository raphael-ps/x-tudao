package decoratorPagina16;

public class Diretor extends Incorporado {

	public Diretor(double salario, String descricao) {
		super(salario, descricao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaSalario() {
		if (cargo != null) {
			return cargo.calculaSalario() + 2000;
		}
		return 0;
	}

}
