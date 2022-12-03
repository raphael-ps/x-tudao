package decoratorPagina16;

public class Adjunto extends Cargo {

	public Adjunto(double salario, String descricao) {
		super(salario, descricao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaSalario() {
		// TODO Auto-generated method stub
		return this.getSalario() + 2500;
	}

}
