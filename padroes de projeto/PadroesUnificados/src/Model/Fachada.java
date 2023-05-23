package Model;

// Model.Fachada Pattern
public class Fachada {
    private SubsistemaTemperatura subsistemaTemperatura;
    private SubsistemaIrrigacao subsistemaIrrigacao;
    private SistemaAlarme sistemaAlarme;

    public Fachada() {
        this.subsistemaTemperatura = new SubsistemaTemperatura();
        this.subsistemaIrrigacao = new SubsistemaIrrigacao();
        this.sistemaAlarme = new SistemaAlarme();

        // Adicionar o agricultor ao sistema de alarme
        Observador agricultor = new Agricultor();
        sistemaAlarme.adicionar(agricultor);
    }

    public void monitorarEstufa() {
        subsistemaTemperatura.monitorarTemperatura();
        subsistemaIrrigacao.monitorarIrrigacao();
    }

    public SistemaAlarme getSistemaAlarme() {
        return sistemaAlarme;
    }
}
