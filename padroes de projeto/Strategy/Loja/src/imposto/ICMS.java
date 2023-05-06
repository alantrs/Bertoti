package br.com.loja.imposto;

import br.com.loja.orcamento.Orcamento;


/* o imposto ICMS implementa a interface,
 * e faz seu metodo calcular de acordo com sua regra de negocio
 */

public class ICMS implements Imposto {

    public double calcular(Orcamento orcamento){
        return orcamento.getValor()*0.1;
    }
}
