package questao1.frete;

import questao1.FreteStrategy;

public class FedexStrategy implements FreteStrategy{
	private String tipoDeFrete;
	private double precoPorKm;
	private double precoFixo;
	
	public FedexStrategy() {
		this.precoFixo = 12;
		this.precoPorKm = 0.3;
		this.setTipoDeFrete("Fedex");
	}
	
	@Override
	public double calcularFrete(double distanciaKM) {
		return precoFixo + (precoPorKm * distanciaKM);
	}

	public double getPrecoPorKM() {
		return precoPorKm;
	}

	public void setPrecoPorKM(double precoPorKM) {
		this.precoPorKm = precoPorKM;
	}

	public double getPrecoFixo() {
		return precoFixo;
	}

	public void setPrecoFixo(double precoFixo) {
		this.precoFixo = precoFixo;
	}

	public String getTipoDeFrete() {
		return tipoDeFrete;
	}

	public void setTipoDeFrete(String tipoDeFrete) {
		this.tipoDeFrete = tipoDeFrete;
	}

}
