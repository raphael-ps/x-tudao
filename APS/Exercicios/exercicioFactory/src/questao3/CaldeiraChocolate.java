package questao3;

public class CaldeiraChocolate {
	private static CaldeiraChocolate caldeira = null; //*
	private boolean empty;
	private boolean boiled;
	
	//só é iniciado quando a caldeira está vazia
	private CaldeiraChocolate() {
		this.empty = true;
		this.boiled = true;
	}
	
	public static CaldeiraChocolate getInstance() { //**
		if (caldeira == null)
			caldeira = new CaldeiraChocolate();
		
		return caldeira;
	}
	
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
			//preencha a caldeira com uma mistura de leite e chocolate
		}
	}
	
	//para drenar a caldeira ela deve estar cheia e também em ebulição
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			//drene o leite e o chocolate fervidos
			empty = true;
			System.out.println("Caldeira drenada.");
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			//coloque o conteúdo em ebulição
			boiled = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
}