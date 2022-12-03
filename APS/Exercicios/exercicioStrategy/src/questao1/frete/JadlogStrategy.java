package questao1.frete;

import questao1.FreteStrategy;

public class JadlogStrategy implements FreteStrategy{
	private String tipoDeFrete;
	private double precoPorKm;
	private double precoFixo;
	
	public JadlogStrategy() {
		this.precoFixo = 15;
		this.precoPorKm = 0.25;
		this.setTipoDeFrete("Jadlog");
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
