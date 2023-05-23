import Controller.EstufaController;
import Model.Agricultor;
import Model.Estufa;
import Model.Observador;
import Model.SistemaAlarme;
import View.EstrategiaEstacaoSeca;
import View.EstrategiaIrrigacao;

public class App {
    public static void main(String[] args) {
        // Criação da estufa (Singleton)
        Estufa estufa = Estufa.getInstancia();

        // Criação do agricultor (Observador)
        Observador agricultor = new Agricultor();

        // Adicionar o agricultor ao sistema de alarme (Observador)
        SistemaAlarme sistemaAlarme = estufa.getFachada().getSistemaAlarme();
        sistemaAlarme.adicionar(agricultor);

        // Monitorar a estufa através da fachada (Fachada)
        estufa.getFachada().monitorarEstufa();

        // Controlar a irrigação na estufa durante a estação seca (Controlador)
        EstrategiaIrrigacao estrategiaSeca = new EstrategiaEstacaoSeca();
        EstufaController controlador = new EstufaController(estrategiaSeca);
        controlador.controlarIrrigacao();
    }
}
