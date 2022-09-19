package questao1;

import java.util.ArrayList;
import java.util.List;

public class NoticiarioAssina implements Noticiario{
	
	private List<ConsumidorDeNoticia> assinantes;
	private Noticia ultimaNoticia;
	
	public NoticiarioAssina() {
		this.assinantes = new ArrayList<ConsumidorDeNoticia>();
		this.ultimaNoticia = null;
	}

	@Override
	public void adicionarConsumidor(ConsumidorDeNoticia consumidor) {
		if (consumidor != null) {
			this.assinantes.add(consumidor);
		}	
	}

	@Override
	public void notificarTodosConsumidores() {
		if(ultimaNoticia != null) {
			for (ConsumidorDeNoticia consumidor : assinantes) {
			consumidor.lerNoticia(ultimaNoticia);
			}
		}
	}
	
	public void publicarNoticia(Noticia noticia) { // == setUltimaNoticia(Noticia n)
		this.ultimaNoticia = noticia;
		this.notificarTodosConsumidores();
	}
}
