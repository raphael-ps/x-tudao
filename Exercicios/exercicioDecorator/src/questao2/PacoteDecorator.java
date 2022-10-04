package questao2;

public abstract class PacoteDecorator extends Viagem{
	private Viagem viagem;
	
	public PacoteDecorator(String descricao, double preco, Viagem viagem) {
		super(descricao, preco);
		this.viagem = viagem;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPreco() {
		System.out.println(this.getDescricao() + " --- R$ " + this.getPreco());
		return viagem.calcularPreco() + this.getPreco();
	}

}
