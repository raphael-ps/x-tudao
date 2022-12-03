package decoratorPagina16;

public class Auxiliar extends Cargo {

	public Auxiliar(double salario, String descricao) {
		super(salario, descricao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaSalario() {
		// TODO Auto-generated method stub
		return this.getSalario() + 1000;
	}

}
