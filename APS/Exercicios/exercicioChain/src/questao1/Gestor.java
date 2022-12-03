package questao1;

public abstract class Gestor {
	protected Gestor sucessor;
	private double valorLimite;
	private String cargo;
	
	public Gestor(Gestor sucessor, double valor, String cargo) {
		this.sucessor = sucessor;
		this.valorLimite = valor;
		this.cargo = cargo;
	}
	
	public void processarCompra(RequisicaoCompra resquisicaoCompra) {
		if (resquisicaoCompra.getValorCompra() <= this.valorLimite) {
			System.out.printf("Compra de R$ %.2f aprovada pelo %s\n", resquisicaoCompra.getValorCompra(), this.getCargo());
		}
		else{
			System.out.printf("O gestor de cargo: \"%s\" n�o conseguiu aprovar a compra de R$ %.2f, pois seu limite � de R$ %.2f.\n", this.getCargo(), resquisicaoCompra.getValorCompra(), this.getValorLimite());
			if (this.sucessor != null) {	
				sucessor.processarCompra(resquisicaoCompra);
			}
			else {
				System.out.println("N�o foi poss�vel processar a compra, pois n�o h� cargo com tal poder.");
			}
		}
	}
	public Gestor getSucessor() {
		return sucessor;
	}
	public void setSucessor(Gestor sucessor) {
		this.sucessor = sucessor;
	}
	public double getValorLimite() {
		return valorLimite;
	}
	public void setValorLimite(double valor) {
		this.valorLimite = valor;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
