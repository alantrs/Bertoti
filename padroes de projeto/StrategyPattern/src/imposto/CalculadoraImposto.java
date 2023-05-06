package imposto;

import orcamento.Orcamento;

public class CalculadoraImposto {

    private Imposto imposto;

    public void setImposto(Imposto impo) {
        imposto = impo;
    }

    public double calcular(Orcamento orcamento){
        return imposto.calcular(orcamento);
    }
}
