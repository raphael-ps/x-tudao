package questao1.frete;

import questao1.FreteStrategy;

public class SedexStrategy implements FreteStrategy{
	private String tipoDeFrete;
	private double precoPorKm;
	private double precoFixo;
	
	public SedexStrategy() {
		this.precoFixo = 10;
		this.precoPorKm = 0.5;
		this.setTipoDeFrete("Sedex");
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
