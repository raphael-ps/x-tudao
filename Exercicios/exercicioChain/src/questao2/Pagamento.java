package questao2;

public class Pagamento {
	private double valor;
	private int codigoBancoPermitidoPagar;
	
	public Pagamento(double valor, int codigoBancoPermitidoPagar) {
		this.valor = valor;
		this.codigoBancoPermitidoPagar = codigoBancoPermitidoPagar;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getCodigoBancoPermitidoPagar() {
		return codigoBancoPermitidoPagar;
	}

	public void setCodigoBancoPermitidoPagar(int codigoBancoPermitidoPagar) {
		this.codigoBancoPermitidoPagar = codigoBancoPermitidoPagar;
	}
	
	
}
