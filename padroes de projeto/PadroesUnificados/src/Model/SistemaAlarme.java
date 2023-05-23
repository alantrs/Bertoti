package Model;

import java.util.ArrayList;
import java.util.List;

public class SistemaAlarme {
    private List<Observador> observadores = new ArrayList<>();

    public void adicionar(Observador observador) {
        observadores.add(observador);
    }

    public void remover(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(String mensagem) {
        for (Observador observador : observadores) {
            observador.atualizar(mensagem);
        }
    }
}