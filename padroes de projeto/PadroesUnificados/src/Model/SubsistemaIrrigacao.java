package Model;

public class SubsistemaIrrigacao {
    private SistemaAlarme sistemaAlarme;

    public SubsistemaIrrigacao() {
        this.sistemaAlarme = new SistemaAlarme();
    }

    public void monitorarIrrigacao() {
        // Logica para monitorar irrigacao.
        // Se o nível de água estiver abaixo do limite, notifique o observador.
        // Suponha que detectamos baixo nível de água:
        sistemaAlarme.notificarObservadores("Alerta: Nível baixo de água na estufa!");
    }
}