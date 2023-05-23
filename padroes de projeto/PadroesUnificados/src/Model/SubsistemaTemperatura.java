package Model;

public class SubsistemaTemperatura {
    private SistemaAlarme sistemaAlarme;

    public SubsistemaTemperatura() {
        this.sistemaAlarme = new SistemaAlarme();
    }

    public void monitorarTemperatura() {
        // Logica para monitorar temperatura.
        // Se a temperatura estiver fora dos limites aceitaveis, notifique o observador.
        // Suponha que detectamos uma temperatura alta:
        sistemaAlarme.notificarObservadores("Alerta: Temperatura alta na estufa!");
    }
}