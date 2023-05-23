package View;

public class EstrategiaEstacaoSeca implements EstrategiaIrrigacao {
    @Override
    public void regarPlantas() {
        System.out.println("Estação seca: Aumentar frequência de rega.");
    }
}
