package decoratorPagina16;

public class Reitor extends Incorporado {

	public Reitor(double salario, String descricao) {
		super(salario, descricao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaSalario() {
		if (cargo != null) {
			return cargo.calculaSalario() + 1000;
		}
		return 0;
	}

}
