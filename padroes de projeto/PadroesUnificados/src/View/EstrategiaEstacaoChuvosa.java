package View;

public class EstrategiaEstacaoChuvosa implements EstrategiaIrrigacao {
    @Override
    public void regarPlantas() {
        System.out.println("Estação chuvosa: Reduzir frequência de rega.");
    }
}
