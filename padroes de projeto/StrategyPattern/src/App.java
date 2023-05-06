import imposto.CalculadoraImposto;
import imposto.ICMS;
import orcamento.Orcamento;

public class App {
    public static void main(String[] args) {
        CalculadoraImposto calculadora = new CalculadoraImposto();
        // Printo o orcamento e crio o imposto com o new

        calculadora.setImposto(new ICMS());

        System.out.println(calculadora.calcular(new Orcamento(1000)));

    }
}