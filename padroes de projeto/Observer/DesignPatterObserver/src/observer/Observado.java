package observer;

import java.util.ArrayList;
import java.util.List;

// classe observado (Subject)
public class Observado {
	
	private int temperatura;
	private List<Observer> observers = new ArrayList<>();
	
	public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        notificarObservers();
    }
	
	public void registrarObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void removerObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notificarObservers() {
		for(Observer observer : observers) {
			observer.update(temperatura);
		}
	}
}
