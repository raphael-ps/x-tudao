package questao3;

import java.util.ArrayList;
import java.util.List;

public abstract class SubjectCampoTexto {
	private List<Observer> observers;
	
	public SubjectCampoTexto() {
		this.observers = new ArrayList<Observer>();
	}
	
	public abstract void notificarTodosObservers();
	
	public void adicionarObserver(Observer observer) {
		if (observer != null) {
			observers.add(observer);
		}
	}
	
	public void removerObserver(Observer observer) {
		if (observers.remove(observer)) {
			System.out.println("Observer removido!");
		}
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

}
