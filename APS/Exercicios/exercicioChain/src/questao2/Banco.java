package questao2;

public abstract class Banco {
	private String nomeBanco;
	protected Banco sucessor;
	private int codigoBanco;
	
	public Banco(Banco sucessor, int codigoBanco, String nome) {
		this.sucessor = sucessor;
		this.codigoBanco = codigoBanco;
		this.nomeBanco = nome;
	}
	
	public void processarPagamento(Pagamento pagamento) {
		if (this.codigoBanco == pagamento.getCodigoBancoPermitidoPagar()) {
			System.out.printf("Seu pagamento de R$ %.2f foi processado com sucesso pelo banco: %s.\n", pagamento.getValor(), this.nomeBanco);
		}
		else {
			System.out.printf("O banco \"%s\" não conseguiu processar seu pagamento de R$ %.2f.\n", this.nomeBanco, pagamento.getValor());
			if (this.sucessor != null) {
				sucessor.processarPagamento(pagamento);
			}
			else {
				System.out.println("Não foi possível processar pagamento. Banco não encontrado.");
			}
		}
	}

	public Banco getSucessor() {
		return sucessor;
	}

	public void setSucessor(Banco sucessor) {
		this.sucessor = sucessor;
	}

	public int getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(int codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	
}
