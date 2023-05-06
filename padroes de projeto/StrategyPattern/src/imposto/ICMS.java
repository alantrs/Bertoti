package imposto;

import orcamento.Orcamento;

public class ICMS implements Imposto{

    public double calcular(Orcamento orcamento){
        return orcamento.getValor()*0.1;
    }
}
