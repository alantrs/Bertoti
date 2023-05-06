package imposto;

import orcamento.Orcamento;

public class ISS implements Imposto{

    public double calcular(Orcamento orcamento){
        return orcamento.getValor()*0.6;
    }
}
