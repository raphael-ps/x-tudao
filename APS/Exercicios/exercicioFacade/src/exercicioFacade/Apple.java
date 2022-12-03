package exercicioFacade;

public class Apple implements LojaCelular {
	private String modelo;
	private double preco;
	private int quantidadeEstoque;
	
	public Apple(String modelo, double preco, int quantidadeEstoque) {
		this.modelo = modelo;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return preco;
	}

	@Override
	public String getModelo() {
		// TODO Auto-generated method stub
		return modelo;
	}

	@Override
	public int getQuantidadeEstoque() {
		// TODO Auto-generated method stub
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
