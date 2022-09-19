package questao2;

import java.util.ArrayList;
import java.util.List;

public abstract class Noticiario {
	
	private String nomeNoticiario;
	private List<ConsumidorDeNoticia> consumidores;
	private Noticia ultimaNoticia;
	
	public abstract void adicionarNoticia(Noticia noticia);
	
	public Noticiario(String nome) {
		this.nomeNoticiario = nome;
		this.consumidores = new ArrayList<ConsumidorDeNoticia>();
		this.ultimaNoticia = null;
	}

	public void adicionarConsumidor(ConsumidorDeNoticia consumidor) {	
		if (consumidor != null) {
			this.consumidores.add(consumidor);
			System.out.println("Consumidor do noticiário adicionado!\n");
		}	
	}
	
	public void notificarTodosConsumidores() {
		for (ConsumidorDeNoticia consumidor : consumidores) {
			consumidor.atualizar(ultimaNoticia, nomeNoticiario);
		}
	}
	
	public void setUltimaNoticia(Noticia noticia) { // == setUltimaNoticia(Noticia n)
		this.ultimaNoticia = noticia;
	}
	
	public Noticia getUltimaNoticia() {
		return this.ultimaNoticia;
	}

	public List<ConsumidorDeNoticia> getConsumidores() {
		return consumidores;
	}

	public void setConsumidores(List<ConsumidorDeNoticia> consumidores) {
		if (consumidores != null) {
			this.consumidores = consumidores;
		}
	}

	public String getNome() {
		return nomeNoticiario;
	}

	public void setNome(String nome) {
		this.nomeNoticiario = nome;
	}
	
}
