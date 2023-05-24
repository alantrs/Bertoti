package src.model;

import src.view.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public void notifyObservers(String empregadoNome, Integer departamentoId);
}
