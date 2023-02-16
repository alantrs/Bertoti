package br.com.loja.imposto;

import br.com.loja.orcamento.Orcamento;

/* o imposto ISS implementa a interface,
 * e faz seu metodo calcular de acordo com sua regra de negocio
 */

public class ISS implements Imposto{

    public double calcular(Orcamento orcamento){
        return orcamento.getValor()*0.6;
    }
}
