package questao2;

public class AgregadorTopico extends Agregador{
	String topicoDeInteresse;
	int contador;
	
	public AgregadorTopico(String nome, String topico) {
		super(nome);
		this.topicoDeInteresse = topico;
		this.contador = 0;
	}
	public void adicionarConsumidor(ConsumidorDeNoticia consumidor) {	
		if (consumidor != null) {
			super.getConsumidores().add(consumidor);
			System.out.println("Consumidor do Agregador Tópico adicionado!\n");
		}	
	}
	@Override
	public void atualizar(Noticia noticia, String nomeNoticiario) {

		if (noticia.getTopico().equals(topicoDeInteresse)) { //Primeira noticia recebida pelo agregador
			if (contador == 0) {
				super.setUltimaNoticia(noticia);
			}
			else {
				this.adicionarNoticia(noticia);
				super.getUltimaNoticia().setDia(noticia.getDia());
				super.getUltimaNoticia().setMes(noticia.getMes());
			}	
			contador++;
		} 
		
		if (contador == 10) {
			super.notificarTodosConsumidores();
			contador = 0;
			super.setUltimaNoticia(null);
		}
	}

}
